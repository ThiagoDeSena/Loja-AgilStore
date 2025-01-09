package br.com.aceleraAgil.AgilStore.model;

import br.com.aceleraAgil.AgilStore.model.enums.Categoria;
import lombok.*;

@Data
@Getter
@Setter
public class Produto {

    private static int proximoId = 1;
    private int id;
    private String nomeProduto;
    private Categoria categoria;
    private int quantidadeEstoque;
    private double preco;

    public Produto(String nomeProduto, Categoria categoria,int quantidadeEstoque,double preco){
        this.id = proximoId++;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID =" + id +
                ", Nome do Produto ='" + nomeProduto + '\'' +
                ", Categoria =" + categoria +
                ", Quantidade em Estoque =" + quantidadeEstoque +
                ", Preco = R$ " + preco;
    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
