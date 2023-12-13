# Atividade de Revisão de Java e Git/GitHub 🚀📚

## Chegou a hora de trabalhar juntos em um projeto!

### **Objetivo:** 
O objetivo desta atividade é revisar e praticar diversos conceitos de Java, incluindo tipos de dados, enum, interfaces, arrays, listas, mapas e muito mais, enquanto aprimoramos nossas habilidades com o Git.

### **Instruções:**

1. Dividam-se em grupos de 3 alunos. Certifiquem-se de que cada grupo tem um líder.

2. Cada grupo deve escolher um nome para sua equipe - algo legal e criativo!.

3. Uma pessoa do grupo será responsável por criar um novo repositório Git no GitHub e compartilhá-lo com os membros do grupo, nome do repositorio deve conter o nome da equipe neste formato -> Projeto-Revisao-Equipe.

4. Cada membro do grupo deve clonar o repositório para sua máquina local.

5. Certifiquem-se de que cada classe Java possui comentários explicativos para descrever suas funcionalidades.

6. Cada membro do grupo deve fazer o commit e o push para o repositório compartilhado. É importante adicionar uma mensagem de commit descritiva.

7. Certifiquem-se de resolver qualquer conflito que possa ocorrer durante o processo de push.

8. Depois de todos os membros do grupo terem feito seus commits, verifiquem o repositório compartilhado para garantir que tudo esteja lá.

### **Entrega:**

- Cada grupo deve fazer no README do projeto (em formato Markdown) com o nome dos integrantes e um breve resumo de como foi trabalhar em equipe usando o Git, destacando os desafios e aprendizados.

- Certifiquem-se de fornecer o link para o repositório Git compartilhado.

## Projeto Revisão 🚚

Imagine que uma empresa, que chamaremos carinhosamente de "Amarelinha", que é tipo um supermercado gigante online e livre de sedes físicas (se você pegou o nome, é esperto!), precisa da nossa ajuda para criar um sistema de transporte irado pelo Brasilzão! Eles vendem uma variedade de produtos como um grande mercado online, mas precisam de um sistema para simular o transporte desses produtos de um lugar para outro.

### Para fazer isso eles contrataram vocês para desenvolver essa solução

![Minions livres](https://github.com/SkiereszDiego/Java-Caldeira-Privado/blob/main/aula09/minions2.gif?raw=true)

A Amarelinha forneceu ao seu time um arquivo em .CSV, que contém informações sobre as distâncias entre diferentes cidades. Na primeira linha desse arquivo, estão os nomes das cidades para as quais o transporte ocorrerá, e nas linhas seguintes, há uma espécie de tabela com as distâncias entre essas cidades.

- [Arquivo .CSV](DistanciasCidadesCSV.csv)

Além disso, a Amarelinha já possui vários tipos de caminhões para transportar esses produtos, cada um com seu tamanho, custo por quilômetro rodado e capacidade. Aqui estão os tipos de caminhões e seus custos por quilômetro:🗺️🚛

| Classificação | Preço por Km (R$/km) | Capacidade Máxima |
|---------------|----------------------|-------------------|
| Pequeno       | 5,83                 | 1 Tonelada        |
| Médio         | 13,42                | 4 Toneladas       |
| Grande        | 29,21                | 10 Toneladas      |

Além disso, forneceram ao seu time, quais são os tipos de produtos que vocês precisam transportar nessa primeira versão do sistema, visto que, ela deseja aplicar o novo software aos poucos, para não impactar o legado que já está funcionando. Os produtos são esses: 📦🚚

| Nome              | Peso (kg) |
|-------------------|-----------|
| Celular           | 0,7       |
| Geladeira         | 50        |
| Air Fryer         | 3,5       |
| Cadeira           | 5,0       |
| Luminária         | 0,8       |
| Lavadora de roupa | 15        |
| PlayStation 5     | 3,9       |
| Nintendo Switch   | 0,3       |

Com todos esses dados em mãos, nossa missão é criar um sistema em Java 17 e Gradle com as seguintes funcionalidades:

![Minions livres](https://github.com/SkiereszDiego/Java-Caldeira-Privado/blob/main/aula09/minions3.gif?raw=true)

## Funcionalidades

1. **Consultar Trechos e Modalidades** 🌆➡️🚚💰

   O sistema deve apresentar no terminal os trechos disponíveis para transporte. O usuário seleciona duas cidades e o tipo de caminhão 🚛, e o programa mostrará a distância entre elas, juntamente com o custo total estimado para o trecho. Caso um nome de cidade não exista, o programa informará ao usuário. **Por exemplo**, ao escolher PORTO ALEGRE e SÃO PAULO, utilizando um caminhão de pequeno porte, a distância é de XXX km, e o custo será de R$ xxx,00.💰

2. **Cadastrar transporte** 🚛🚛➡️🚛💼💼💼

   O programa deverá permitir ao usuário listar as cidades e adicionar uma lista de itens a transportar (e seus pesos). O programa deverá calcular a distância total a ser percorrida e identificar o modelo de caminhão mais adequado para este transporte  e mostra os custos (por trecho e totais).  Às vezes, precisamos de mais de um caminhão para carregar tudo! **Por exemplo**, de PORTO ALEGRE para SÃO PAULO, a distância a ser percorrida é de X km, para transporte dos produtos X, Y, Z será necessário utilizar 2 caminhões de porte PEQUENO e um de porte MÉDIO, de forma a resultar no menor custo de transporte por km rodado. O valor total do transporte dos itens é R$ xxx,00, sendo R$ xxx,00 é o custo unitário médio.

   Para realizar esta questão, considere os seguintes cenários de exemplo:
   
   - **Cenário 1:** Transportar o total de 300 celulares, 50 geladeiras, 70 PlayStation 5 e 2000 luminárias. O transporte deverá partir da cidade de Porto Alegre, com parada em Florianópolis onde serão descarregados 25 geladeiras, 50 freezers e 100 celulares. O restante da carga seguirá até a cidade de Curitiba.
     
   - **Cenário 2:** Transportar o total de 500 Nintendo Switch, 100 geladeiras, 200 air fryers, 98 cadeiras. O transporte deverá partir da cidade de Maceió, com parada em Goiânia onde serão descarregados 90 geladeiras, 200 freezers e 20 celulares. O restante da carga seguirá até São Paulo.

3. **Dados estatísticos** 📊💡

   O programa deverá exibir um relatório dos transportes até então cadastrados: custo total, o custo por trecho, o custo médio por km, o custo médio por tipo de produto, o custo total por trecho, o custo total para cada modalidade de transporte, o número total de veículos deslocados e o total de itens transportados.

4. **Finalizar o programa** 🚀

   O programa deve permitir que o usuário encerre o programa a qualquer momento.

Para deixar o sistema robusto e mais seguro, esse software precisa ter 50% de cobertura de testes unitários, no mínimo – Não faz diferença usar JUnit 4 ou JUnit 5. 🛡️


🚨 Atenção! Certifiquem-se de que cada classe possui métodos e atributos relevantes para seu propósito. Todos integrantes devem ter mais de uma atividade cadastrada no Kanban com seu nome, assim como commits no repositorio. 

# Trabalhem em equipe!

![Minions livres](https://github.com/SkiereszDiego/Java-Caldeira-Privado/blob/main/aula09/minions4.gif?raw=true)

## Vamos lá, pessoal! trabalhem juntos para criar um sistema de transporte que vai revolucionar o Brasilzão da "Amarelinha"! 

![Minions livres](https://github.com/SkiereszDiego/Java-Caldeira-Privado/blob/main/aula09/minions.gif)
