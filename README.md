# 💸 PicPay Transfer API - Projeto de Teste

Este projeto é uma implementação de uma API de transferência de dinheiro inspirada em um tutorial do canal **Build and Run** no YouTube. A aplicação foi desenvolvida com **Java 21** e **Spring Boot** e inclui um endpoint para realizar transferências entre contas.

## 🎥 Créditos
Este projeto foi baseado no tutorial do canal [Build and Run](https://www.youtube.com/@buildrun-tech/@BuildandRun). Todo o conteúdo e a lógica foram explicados de forma didática no canal.

## 🚀 Tecnologias Utilizadas
- 🟦 **Java 21**
- 🌱 **Spring Boot 3**
- 📄 **Swagger OpenAPI 3**
- 🗄️ **H2 Database** (ou outro banco de dados configurado)
- 📦 **Maven**

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
    ```bash
    git clone https://github.com/bfrjunior/picpay-transfer-api.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd picpay-transfer-api
    ```
3. Execute o projeto:
    ```bash
    mvn spring-boot:run
    ```

4. Acesse a documentação Swagger:
    ```
    http://localhost:8080/swagger-ui.html
    ```

## 📋 Endpoints Disponíveis

### 💵 Transferência

1. **Realizar uma Transferência**
    - **URL:** `/transfer`
    - **Método:** `POST`
    - **Descrição:** Realiza a transferência de um valor entre contas.
    - **Corpo da Requisição:**
      - Um objeto JSON contendo os seguintes campos:
        ```json
        {
            "senderId": 1,
            "receiverId": 2,
            "amount": 100.00
        }
        ```
    - **Resposta:** `200 OK` (contém o objeto `Transfer` com os detalhes da transferência)

## 🗂️ Estrutura de Dados

- **`TransferDto`**: DTO utilizado para realizar a transferência, contendo o ID do remetente, do destinatário e o valor a ser transferido.
- **`Transfer`**: Objeto de resposta que contém as informações da transferência realizada (remetente, destinatário, valor, data/hora).


---

Se você quiser aprender mais sobre desenvolvimento em Java, não deixe de conferir o canal **Build and Run** para tutoriais incríveis como este.
