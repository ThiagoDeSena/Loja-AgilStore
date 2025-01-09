package br.com.aceleraAgil.AgilStore.principal;

import br.com.aceleraAgil.AgilStore.model.Produto;
import br.com.aceleraAgil.AgilStore.model.enums.Categoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.aceleraAgil.AgilStore.model.enums.Categoria.*;

public class Principal {

    Scanner scanner = new Scanner(System.in);
    private List<Produto> produtosCadastrados = new ArrayList<>();
    private String menu = "\n-----------------\n"
            +"Escolha o número de sua opção:\n"
            +"1 - Adicionar Produto.\n"
            +"2 - Listar Produtos.\n"
            +"3 - Atualizar Produto.\n"
            +"4 - Excluir Produto.\n"
            +"5 - Buscar Produto.\n"
            +"0 - Sair";

    public void exibirMenu(){

        var opcao = -1;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 0:
                    System.out.println("Saindo....");;
                    break;
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    excluirProduto();
                    break;
                case 5:
                    buscarProduto();
                    break;
                default:
                    System.out.println("Opção ínvalida! Digite uma opção valida.");
                    break;
            }

        }while (opcao!=0);

        System.out.println("Fim do Programa!");
    }

    private void buscarProduto() {
        System.out.println("Deseja buscar por ID (1) ou por nome (2)?");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o ID do produto: ");
                int id = scanner.nextInt();
                Produto produto = encontrarProdutoPorId(id);
                if (produto ==null){
                    System.out.println("Produto não encontrado!");
                    return;
                }
                exibirDetalhesProduto(produto);
                break;
            case 2:
                System.out.println("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                List<Produto> produtosEncontrados = encontrarProdutoPorNome(nome);
                exibirProdutosEncontrados(produtosEncontrados);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void exibirProdutosEncontrados(List<Produto> produtosEncontrados) {
        if (produtosEncontrados.isEmpty()){
            System.out.println("Nenhum Produto Encontrado!");
        }else {
            System.out.println("Produtos encontrados: ");
            for (Produto produto: produtosEncontrados){
                exibirDetalhesProduto(produto);
            }
        }
    }

    private List<Produto> encontrarProdutoPorNome(String nome) {
        List<Produto> produtosEncontrados = new ArrayList<>();
        for (Produto produto:produtosCadastrados){
            if (produto.getNomeProduto().toLowerCase().contains(nome.toLowerCase())){
                produtosEncontrados.add(produto);
            }
        }

        return produtosEncontrados;
    }

    private void exibirDetalhesProduto(Produto produto) {
        if (produto != null){
            System.out.println("Detalhes do produto: ");
            System.out.println("ID: "+produto.getId());
            System.out.println("Nome: "+produto.getNomeProduto());
            System.out.println("Categoria: "+produto.getCategoria());
            System.out.println("Quantidade em Estoque: "+produto.getQuantidadeEstoque());
            System.out.println("Preço: "+produto.getPreco());
        }else {
            System.out.println("Produto não encontrado!");
        }
    }

    private void excluirProduto() {
        Produto produtoParaExcluir = informarIDeBuscarID("excluir");

        if (produtoParaExcluir == null){
            return;
        }

        System.out.println("Tem certeza que deseja excluir o produto: "+ produtoParaExcluir+" (s/n)");
        char resposta = scanner.nextLine().charAt(0);

        if (resposta == 's' || resposta == 'S'){
            produtosCadastrados.remove(produtoParaExcluir);
            System.out.println("Produto removido com sucesso!");
        }
    }

    private void atualizarProduto() {

        Produto produtoParaAtualizar = informarIDeBuscarID("atualizar");

        if (produtoParaAtualizar == null){
            return;
        }
        String continuar = "s";

        while (continuar.equals("s") || continuar.equals("S")){

            System.out.println("O que você deseja atualizar no produto?");
            System.out.println("1 - Nome");
            System.out.println("2 - Categoria");
            System.out.println("3 - Quantidade em estoque");
            System.out.println("4 - Preço");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o novo nome do Produto: ");
                    String nome = scanner.nextLine();
                    produtoParaAtualizar.setNomeProduto(nome);
                    break;
                case 2:
                    opcoesCategorias("Escolha a nova Categoria do Produto");
                    int categoria = scanner.nextInt();
                    scanner.nextLine();
                    Categoria categoraEscolhida = escolherCategoria(categoria);
                    produtoParaAtualizar.setCategoria(categoraEscolhida);
                    break;
                case 3:
                    System.out.println("Digite a nova quantidade em Estoque: ");
                    int quantidadeEstoque = scanner.nextInt();
                    scanner.nextLine();
                    produtoParaAtualizar.setQuantidadeEstoque(quantidadeEstoque);
                    break;
                case 4:
                    System.out.println("Digite o novo preço do Produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    produtoParaAtualizar.setPreco(preco);
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção válida.");
                    break;
            }


            System.out.println("Quer Atualizar outro campo desse Produto?(s/n) ");
            continuar = scanner.nextLine().toLowerCase();

        }


        System.out.println("Produto Atualizado com Sucesso!");
    }

    private Produto encontrarProdutoPorId(int idProduto) {
        for (Produto p:produtosCadastrados){
            if (p.getId() == idProduto){
                return p;
            }
        }
        return null;
    }

    private void listarProdutos() {
        System.out.println("Lista de Produtos: ");
        if (produtosCadastrados.size()==0){
            System.out.println("Nenhum produto cadatradp");
        }else{
            produtosCadastrados.forEach(produto -> System.out.println(produto.toString()));
        }

    }

    private void adicionarProduto() {
        System.out.print("Digite o Nome do Produto: ");
        String nome = scanner.nextLine();
        opcoesCategorias("Escolha o n° da Categoria do produto");
        int itemCategoria = scanner.nextInt();
        Categoria categoria = escolherCategoria(itemCategoria);
        scanner.nextLine();
        System.out.printf("Digite a Quantidade em Estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Digite o preço do Produto: R$ ");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(nome,categoria,quantidadeEstoque,preco);
        produtosCadastrados.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    private Categoria escolherCategoria(int itemCategoria) {
        switch (itemCategoria){
            case 1: return SMARTPHONES;
            case 2: return COMPUTADORES;
            case 3: return TABLETS;
            case 4: return GAMER;
            case 5: return SMART_HOME;
            default: throw new IllegalArgumentException("Opção inválida");
        }

    }

    private void opcoesCategorias(String mensagem){
        System.out.println(mensagem +" :\n" +
                "1  - SMARTPHONES\n" +
                "2  - COMPUTADORES\n" +
                "3  - TABLETS\n" +
                "4  - GAMER\n" +
                "5  - SMART_HOME");
    }

    private Produto informarIDeBuscarID(String mensagem){
        System.out.println("Digite o ID do produto que deseja "+mensagem+" : ");
        int idProduto = scanner.nextInt();
        scanner.nextLine();

        Produto produtoParaAtualizar = encontrarProdutoPorId(idProduto);

        if (produtoParaAtualizar==null){
            System.out.println("Produto não encontrado!");
            return null;
        }

        return  produtoParaAtualizar;
    }
}
