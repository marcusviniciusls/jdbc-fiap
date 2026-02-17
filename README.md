JDBC FIAP — CRUD com Java e MySQL

Este projeto demonstra a implementação de um CRUD completo utilizando Java puro com JDBC (Java Database Connectivity) para acessar um banco de dados relacional MySQL. Ele foi desenvolvido como projeto avaliativo para a disciplina de desenvolvimento de aplicações corporativas da FIAP.

Visão geral

O objetivo é apresentar como uma aplicação Java pode se conectar a um banco de dados, executar operações SQL básicas (create, read, update, delete) e organizar o acesso a dados de forma clara e modular. JDBC é a API fundamental para interação com bancos de dados em Java e serve de base para frameworks mais avançados como JPA e Spring Data.

O código contém:

• Conexão com banco via arquivo de propriedades (db.properties)
• Estrutura de modelos (POJOs) representando as entidades
• DAO (Data Access Object) para encapsular lógica de acesso
• Operações de CRUD com tratamento de exceções
• Exemplo de uso via classe principal Main

Estrutura do projeto
jdbc-fiap/
├── src/main/java
│   ├── app/            # Classe principal e lógica de fluxo
│   ├── model/          # Entidades Java (ex: Cliente, Produto)
│   ├── dao/            # Interfaces e implementações DAO
│   └── util/           # Helpers (ex: conexão JDBC)
├── db.properties       # Configurações do banco de dados
├── .gitignore
└── README.md

Requisitos

Antes de rodar o projeto, você precisa ter:

• JDK instalado (Java 8 ou superior)
• MySQL (ou outro banco relacional compatível)
• Driver JDBC para MySQL no classpath (ex: mysql-connector-java.jar)
• IDE como IntelliJ ou Eclipse (opcional)

Configuração do banco

Crie um banco chamado jdbc_fiap (ou outro nome, desde que combinado com db.properties).

Execute o script SQL incluído (se aplicável) para criar as tabelas iniciais.

Atualize db.properties com sua URL, usuário e senha do banco:

jdbc.url=jdbc:mysql://localhost:3306/jdbc_fiap
jdbc.username=root
jdbc.password=minha_senha


Note que é necessário o driver JDBC correto para a sua versão do MySQL.

Executando o projeto

Importe o projeto para a sua IDE

Certifique-se de que as dependências JDBC estão adicionadas

Compile e execute a classe principal (Main.java)

Teste as operações de CRUD para ver como a aplicação lê e grava dados

Boas práticas demonstradas

• Uso de PreparedStatement para evitar SQL injection
• Separação de responsabilidades via camada DAO
• Fechamento correto de recursos (Connection, Statement, ResultSet)
• Tratamento de exceções SQL

Próximos passos

Esse projeto serve de base para evoluções futuras, como:

• Adicionar tratamento transacional
• Migrar para Spring JDBC Template ou JPA/Hibernate
• Criar interface REST para expor o CRUD sobre HTTP
