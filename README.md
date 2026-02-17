# JDBC FIAP — CRUD com Java e MySQL

Este projeto demonstra a implementação de um **CRUD completo utilizando Java com JDBC (Java Database Connectivity)** para acesso a banco de dados relacional MySQL.  

Foi desenvolvido como projeto avaliativo para a disciplina de desenvolvimento de aplicações corporativas da FIAP, com foco em organização, boas práticas e clareza arquitetural.

## Apresentação
https://www.canva.com/design/DAHBlx9Tgs8/OV5yPOXExeJE06sU1EckrQ/edit?utm_content=DAHBlx9Tgs8&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton

## Video da apresentação no youtube
https://www.youtube.com/watch?v=XNNsBBTAhlE

## Apresentação PDF
[Apresentação - JDBC Java Basics.pdf](https://github.com/user-attachments/files/25374377/Apresentacao.-.JDBC.Java.Basics.pdf)

## Curriculo
[marcusvinicius-cv-english.pdf](https://github.com/user-attachments/files/25374380/marcusvinicius-cv-english.pdf)



---

## 📌 Visão Geral

O objetivo deste projeto é demonstrar como uma aplicação Java pode:

- Estabelecer conexão com banco de dados via JDBC  
- Executar operações SQL (Create, Read, Update e Delete)  
- Organizar o código utilizando o padrão **DAO (Data Access Object)**  
- Aplicar boas práticas no gerenciamento de recursos e exceções  

JDBC é a API base de acesso a dados no ecossistema Java e serve como fundamento para frameworks como JPA, Hibernate e Spring Data.

---

## 🏗 Estrutura do Projeto

jdbc-fiap/
- src/main/java
- app/ # Classe principal e fluxo da aplicação
- model/ # Entidades (POJOs)
- dao/ # Camada de acesso a dados (DAO)
  - util/ # Classe de conexão e utilitários
- db.properties # Configurações de conexão com o banco
- .gitignore
- README.md


---

## ⚙️ Requisitos

Antes de executar o projeto, é necessário:

- JDK 8 ou superior  
- MySQL instalado  
- Driver JDBC do MySQL adicionado ao classpath  
- IDE (IntelliJ, Eclipse ou similar)

---

## 🛠 Configuração do Banco de Dados

1. Criar um banco de dados (exemplo: `jdbc_fiap`)
2. Criar as tabelas necessárias conforme o modelo utilizado no projeto
3. Configurar o arquivo `db.properties`:

```properties
jdbc.url=jdbc:mysql://localhost:3306/jdbc_fiap
jdbc.username=root
jdbc.password=sua_senha
▶️ Executando o Projeto
Importar o projeto na IDE

Garantir que o driver JDBC esteja configurado

Executar a classe principal (Main.java)

Testar as operações de CRUD

✅ Boas Práticas Aplicadas
Uso de PreparedStatement para prevenção de SQL Injection

Separação de responsabilidades através do padrão DAO

Encapsulamento da lógica de conexão

Fechamento adequado de recursos (Connection, Statement, ResultSet)

Tratamento estruturado de exceções SQL

🚀 Possíveis Evoluções
Este projeto pode evoluir para:

Implementação de controle transacional

Integração com Spring Boot

Migração para JPA / Hibernate

Criação de API REST

Implementação de testes automatizados

👨‍💻 Autor
Marcus Vinicius
Projeto acadêmico desenvolvido para avaliação técnica – FIAP.
