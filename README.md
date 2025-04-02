# fiap - checkpoint1 

FIAP - Checkpoint 1: API de Pedidos

Disciplina: Arquitetura SOA e Web Services

Aluno 1: Enzo Vazquez Sartorelli RM94618
Aluno 2: Nicolas Nogueira Boni RM551965
Aluno 3: Eduardo de Oliveira Nistal RM94524

Objetivo do Projeto:
Esta API RESTful permite cadastrar, listar, atualizar e deletar pedidos de clientes.
Foi desenvolvida com Spring Boot 3.4.4, utilizando banco de dados H2 em memória e uma estrutura MVC (Model-Service-Repository-Controller).

Tecnologias Utilizadas:
- Java 17
- Spring Boot 3.4.4
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Gradle
- Postman

Estrutura de Pastas:
src/main/java/br/com/fiap/checkpoint1
    ├── model
    ├── repository
    ├── service
    └── controller

Endpoints da API:
Método   | Endpoint          | Descrição
---------|-------------------|----------------------------------
GET      | /pedidos          | Lista todos os pedidos
GET      | /pedidos/{id}     | Retorna pedido por ID
POST     | /pedidos          | Cria novo pedido
PUT      | /pedidos/{id}     | Atualiza pedido existente
DELETE   | /pedidos/{id}     | Remove pedido por ID

Exemplo de Requisição POST:
-----------------------------------------
{
  "clienteNome": "Vinicius",
  "valorTotal": 450.24
}
------------------------------------------

Validações Implementadas:
- “clienteNome”: obrigatório (não pode estar em branco)
- “valorTotal”: não pode ser negativo
- Validações realizadas com anotações: @NotBlank, @PositiveOrZero
- Em caso de dados inválidos, a API retorna erro 400

Configuração do Banco (H2):
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:mem:pedidosdb
spring.datasource.username=sa
spring.jpa.hibernate.ddl-auto=update

Link para acessar o H2 Console:
http://localhost:8080/h2-console

Como Executar:
1. Clone o repositório:
   git clone https://github.com/efsartorelli/fiap-checkpoint1

2. Abra o projeto na sua IDE (por exemplo, IntelliJ) e execute a classe Checkpoint1Application.

3. No Postman, utilize o link correspondente aos endpoints e, para acessar o H2 Console, conecte-se utilizando a URL: jdbc:h2:mem:pedidosdb.

4. Teste os comandos via Postman e, para visualizar os pedidos, execute o comando "select * from PEDIDO" no H2 Console.

Testes com Postman:
- Criar novo pedido (POST)
- Listar todos os pedidos (GET)
- Buscar pedido por ID (GET)
- Atualizar pedido (PUT)
- Deletar pedido (DELETE)

Link GitHub do Projeto:
https://github.com/efsartorelli/fiap-checkpoint1
