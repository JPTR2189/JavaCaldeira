# Introdução aos Web Services 🌐

Web Services são uma tecnologia que permite a comunicação entre sistemas distribuídos através da internet. 
Eles são fundamentais para a integração de sistemas e aplicativos, permitindo que diferentes partes se comuniquem independentemente da linguagem de programação ou plataforma utilizada. 
Web Services são amplamente usados em aplicações web, móveis e empresariais para compartilhar dados e funcionalidades.
imagine que Web Services são como 💌 correios 📮 para computadores 🖥️! Eles permitem que sistemas diferentes se comuniquem pela internet.

## Funcionamento Básico de um Web Service 🛠️

Podemos pensar que há dois lados: um é o "Chef" que prepara a comida (os dados ou serviços), e o outro é o "Cliente" que faz pedidos. O funcionamento básico de um Web Service envolve duas partes principais:

- Provedor de Serviços (Servidor): Este é o sistema que fornece os serviços por meio do Web Service. Ele expõe funcionalidades ou dados que outros sistemas podem acessar. Como se fosse o "Chef" em uma cozinha. Ele prepara a comida (ou seja, os dados ou serviços) e coloca nos pratos para serem servidos.

- Consumidor de Serviços (Cliente): Este é o sistema que consome os serviços do Web Service. Ele faz solicitações para o provedor de serviços e recebe as respostas. Isso é como alguém fazendo um pedido em um restaurante. Eles escolhem o que querem, fazem um pedido e o "Chef" prepara o pedido e o serve.

## O que são APIs?

API significa "Application Programming Interface" e é um conjunto de regras que permitem que diferentes software interajam uns com os outros. As APIs são usadas para acessar recursos ou serviços de outros aplicativos ou sistemas.

## Tipos de Arquitetura de APIs 🍔🍟

Existem dois tipos principais de Web Services:

### **SOAP (Simple Object Access Protocol):** 
Um protocolo baseado em XML (Extensible Markup Language) que define um formato estruturado para as mensagens de solicitação e resposta. 
Ele é altamente seguro e permite transações complexas. 
É como um cardápio completo em um restaurante chique, onde você obtém todos os detalhes sobre o que você pode pedir. 
Tudo é bem estruturado.

**Características:**

- Utiliza XML para estruturar as mensagens.
- Define um formato estruturado para mensagens.
- Geralmente é usado em ambientes empresariais e transações complexas e seguras.

  - Exemplo de Serviço SOAP em Java:
    ```java
        import javax.jws.WebMethod;
        import javax.jws.WebService;
        import javax.xml.ws.Endpoint;
        
        // Define a classe ConversorTemperatura como um serviço web usando a anotação @WebService
        @WebService
        public class ConversorTemperatura {
        
            // Define o método fahrenheitParaCelsius como um método de serviço web usando a anotação @WebMethod
            @WebMethod
            public double fahrenheitParaCelsius(double fahrenheit) {
                // Converte a temperatura de Fahrenheit para Celsius usando a fórmula
                return (fahrenheit - 32) * 5.0 / 9.0;
            }
        
            public static void main(String[] args) {
                // Define a URL onde o serviço será publicado
                String url = "http://localhost:8080/conversorTemperatura";
        
                // Publica o serviço na URL especificada, passando uma instância da classe ConversorTemperatura
                Endpoint.publish(url, new ConversorTemperatura());
        
                // Exibe uma mensagem indicando que o serviço SOAP foi publicado
                System.out.println("Serviço SOAP de Conversão de Temperatura publicado em: " + url);
            }
        }
    ```
    
Passo a passo do que este exemplo faz:

1. Importações: Importamos as classes necessárias do pacote javax.jws e javax.xml.ws para criar um serviço web SOAP.

2. Anotação @WebService: A classe ConversorTemperatura é anotada com @WebService, indicando que esta classe é um serviço web.

3. Método fahrenheitParaCelsius: É definido um método fahrenheitParaCelsius que realiza a conversão de temperatura de Fahrenheit para Celsius. Ele é anotado com @WebMethod, indicando que é um método de serviço web.

4. O método fahrenheitParaCelsius recebe a temperatura em Fahrenheit como argumento, realiza a conversão e retorna o valor em Celsius.

5. Método main: No método main, definimos a URL onde o serviço será publicado, neste caso, "http://localhost:8080/conversorTemperatura".

6. Publicação do serviço: Usamos Endpoint.publish(url, new ConversorTemperatura()) para publicar o serviço na URL especificada. Isso torna o serviço acessível na URL fornecida.

7. Mensagem de confirmação: Exibimos uma mensagem indicando que o serviço SOAP de conversão de temperatura foi publicado com sucesso.

Quando você executa este código, ele inicia um servidor embutido que publica o serviço em "http://localhost:8080/conversorTemperatura". O serviço pode ser acessado por clientes SOAP que fazem solicitações para o método fahrenheitParaCelsius. O serviço receberá essas solicitações, executará a conversão e enviará a resposta de volta ao cliente.

Neste caso, o exemplo é bastante simples, mas em ambientes empresariais, os serviços da web SOAP geralmente realizam operações mais complexas e seguras, como transações financeiras ou acesso a sistemas legados.


### **REST (Representational State Transfer):** 
Um estilo arquitetural que utiliza os métodos HTTP (GET, POST, PUT, DELETE) para acessar e manipular recursos (geralmente representados em formato JSON (JavaScript Object Notation) ou XML). 
É mais como um menu de fast food, onde você faz pedidos simples, como "Quero um hambúrguer" ou "Quero batatas fritas". 
As respostas são diretas e simples.


**Características:**

- Utiliza os métodos HTTP (GET, POST, PUT, DELETE) para interagir com recursos.
- Os recursos são geralmente representados em formato JSON ou XML.
- Geralmente é usado na web para acessar e manipular recursos.
- É altamente escalável e flexível, adequado para a web e aplicativos móveis.

## Exemplo de Serviço REST em Java ☕

Neste exemplo, criaremos um Web Service REST simples que fornece informações sobre livros.📚 Este Web Service de livros permitirá:

- **Consultar Livro:** Você pode pedir para consultar informações de um livro com base no ISBN.
- **Adicionar Livro:** Se você tiver um novo livro, pode pedir para adicioná-lo à coleção.

### 1. Configurando o Ambiente

Certifique-se de ter o Java Development Kit (JDK) instalado e sua IDE configurada. Você também precisará de uma biblioteca para converter objetos Java em JSON. 
Uma biblioteca comum para isso é o Jackson. Adicione a dependência ao seu projeto.

### 2. Criando o Projeto

Crie um novo projeto Java em sua IDE preferida (Eclipse, IntelliJ, etc.) e adicione as bibliotecas ao seu projeto.

### 3. Criando a Classe do Web Service

Classe de Modelo (Livro.java):

```java
public class Livro {
    private String isbn;
    private String titulo;
    private String autor;

    // Construtores, getters e setters
}
```
Aqui, definimos a estrutura de um livro, como o título, autor, e ISBN.

Classe do Web Service (LivroService.java):

```java
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/livros")
public class LivroService {
    private static Map<String, Livro> livros = new HashMap<>();

    @GET
    @Path("/info/{isbn}")
    @Produces(MediaType.APPLICATION_JSON)
    public Livro getLivroInfo(@PathParam("isbn") String isbn) {
        Livro livro = livros.get(isbn);
        return livro;
    }

    @POST
    @Path("/adicionar")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response adicionarLivro(Livro livro) {
        livros.put(livro.getIsbn(), livro);
        return Response.status(201).entity("Livro adicionado com sucesso!").build();
    }
}

```
Essa é a parte onde criamos o "menu" para pedir informações sobre os livros. Por exemplo, você pode pedir "Dê-me informações sobre o livro com este ISBN" e/ou "Adicione este novo livro".

### 4. Executando o Web Service

Execute o Web Service em um servidor de aplicação, como o Grizzly, e acesse-o em http://localhost:8080/seu-projeto/livros.

### 5. Uso do Web Service

Você pode usar uma ferramenta como o Postman ou um cliente HTTP para testar o Web Service. Aqui estão exemplos de como usá-lo:

Consultar informações de um livro específico:

```java
GET http://localhost:8080/seu-projeto/livros/info/1234567890
```

Adicionar um novo livro:

```java
POST http://localhost:8080/seu-projeto/livros/adicionar

Corpo da solicitação (JSON):
{
    "isbn": "1234567890",
    "titulo": "Aventuras de Alice no País das Maravilhas",
    "autor": "Lewis Carroll"
}

```

Embora SOAP e REST sejam os mais conhecidos, há outros tipos de web services, como **JSON-RPC**, **XML-RPC** e **gRPC**, que são usados em casos específicos ou em ambientes que exigem requisitos particulares.

Lembre-se de que, em uma aplicação real, você deve adicionar mais recursos de segurança, manipulação de erros e armazenamento de dados em um banco de dados para tornar o Web Service robusto e seguro.
