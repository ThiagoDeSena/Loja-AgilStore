# Gerenciamento de Produtos para a Loja AgilStore

![Badge Linguagem](http://img.shields.io/static/v1?label=LINGUAGEM&message=JAVA&color=orange&style=for-the-badge)

<p align="justify">
  A AgilStore é uma pequena loja de eletrônicos que recentemente expandiu seu catálogo de produtos para incluir uma variedade maior de itens, desde smartphones e laptops até acessórios como cabos, carregadores e fones de ouvido. Com o aumento do número de produtos e a diversidade das categorias, a equipe de gerenciamento percebeu a necessidade de otimizar o controle do inventário para garantir que os produtos estejam sempre disponíveis para os clientes e que os níveis de estoque sejam mantidos de forma eficiente.
Atualmente, o controle de inventário está sendo feito manualmente em planilhas, o que tem se mostrado ineficiente e propenso a erros, especialmente quando se trata de atualizações rápidas ou buscas específicas. Para resolver esse problema, a loja decidiu desenvolver uma aplicação que permita a gestão automatizada do inventário de produtos, facilitando operações como adicionar novos produtos, listar produtos existentes, atualizar informações e remover itens obsoletos.

## Requisitos Funcionais:

:heavy_check_mark: `Adicionar Produto:` Permitir que o usuário adicione um novo produto ao inventário.
 1. Solicitar ao usuário a inserção dos seguintes dados:
 - Nome do Produto 
 - Categoria 
 - Quantidade em Estoque 
 - Preço
 - Gerar um id único para cada produto automaticamente.

:heavy_check_mark: `Listar Produtos:` Exibir todos os produtos cadastrados no inventário.
 1. Mostrar uma tabela com as seguintes colunas:
 - ID
 - Nome do Produto
 - Categoria
 - Quantidade em Estoque
 - Preço
 - Permitir opções de filtragem por categoria ou ordenação por nome, quantidade ou preço (opcional).

:heavy_check_mark: `Atualizar Produto:` Atualizar as informações de um produto existente identificado pelo seu id.
 - Verificar se o id informado existe no inventário.
 - Solicitar ao usuário quais campos deseja atualizar (Nome, Categoria, Quantidade, Preço).
 - Validar os novos dados antes de salvar as alterações.

:heavy_check_mark: `Excluir Produto:` Remover um produto do inventário pelo seu id.
 - Verificar se o id informado existe no inventário.
 - Confirmar a ação com o usuário antes de excluir (opcional).
 - Remover o produto do inventário após a confirmação.

:heavy_check_mark: `Buscar Produto:` Buscar e exibir detalhes de um produto específico pelo id ou pelo nome.
 - Permitir a busca por id ou por parte do nome do produto.
 - Exibir todas as informações detalhadas do produto encontrado.
 - Exibir mensagem apropriada se nenhum produto for encontrado.


## Funcionamento

:heavy_check_mark: `Menu de opções do Gerenciamento` 

<p align="center">Escolha uma das opções do menu:</p>

1. - Adicionar Produto.
2. - Listar Produtos.
3. - Atualizar Produto.
4. - Excluir Produto.
5. - Buscar Produto.
0. - Sair
  

![image](https://github.com/user-attachments/assets/e32ef577-9fbc-4de7-964c-2638dcfc8927)

<br>

:heavy_check_mark: `1 - Adicionar Produto` 

<p align="center">Adicione um produto a ser cadastrado com os seguintes dados:</p>

- Nome do Produto 
- Categoria 
- Quantidade em Estoque 
- Preço
- Gerar um id único para cada produto automaticamente.

![image](https://github.com/user-attachments/assets/7b155925-2dce-4562-8ff0-e1cabb551664)

<br>

:heavy_check_mark: `2 - Listar Produtos` 

<p align="center">Escolha a opção 2 para Listar os produtos cadastrados:</p>

![image](https://github.com/user-attachments/assets/ff86e644-74dd-42c3-a3f7-5ad5f5217ad2)

<br>

:heavy_check_mark: `3 - Atualizar Produto` 

<p align="center">Escolha a opção 3 para Atualiza um Produto:</p>

 - Digite o ID do produto que deseja atualizar
 - Escolha o campo que você deseja atualizar no produto
 - Atualize o campo escolhido
 - Digite 's' para atualizar outro campo ou 'n' para encerrar a atualização
 - Produto Atualizado com sucesso

![image](https://github.com/user-attachments/assets/6d09e03a-8650-4444-9eae-143ee27b8333)

<br>

:heavy_check_mark: `4 - Excluir Produto` 

<p align="center">Escolha a opção 4 para Excluir um Produto:</p>

 - Digite o ID do produto que deseja excluir
 - Confirme com 's' para excluir o produto ou 'n' para não excluir

![image](https://github.com/user-attachments/assets/a97f55ed-3780-42d6-a621-ad2d285acd85)

<br>

:heavy_check_mark: `5 - Buscar Produto` 

<p align="center">Escolha a opção 5 para Buscar um Produto pelo ID ou nome:</p>

 - Digite 1 se deseja buscar o produto pelo ID ou 2 se deseja buscar pelo nome
 - Digite o ID se tiver escolhido a opção 1
 - Digite o nome do produto se tiver escolhido a opção 2

![image](https://github.com/user-attachments/assets/68a26028-b9b0-4202-9f01-97a3ce366539)

<br>

:heavy_check_mark: `0 - Sair` 

<p align="center">Escolha a opção 0 para encerrar o programa</p>

![image](https://github.com/user-attachments/assets/8470dad8-495d-4e1e-91f8-6aca99e914f2)

</p>

## Desenvolvedor

[<img src="https://avatars.githubusercontent.com/u/110785400?v=4" width=115><br><sub>Thiago De Sena</sub>](https://www.linkedin.com/in/thiago-de-sena-ab5b09179/)
