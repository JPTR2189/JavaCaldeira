# Projeto Final: 

## Desenvolvimento de API Rest com Java e Spring

### Objetivo:

Desenvolver uma API Restful utilizando Spring Boot e integrar com a API externa fornecida em https://www.narutodb.xyz/docs.

![image](https://github.com/SkiereszDiego/Java-Caldeira-Online/blob/c02119efb3a2c59aafcb116dd3abbca48a308e92/aula07/naruto.gif)

### **Instruções:**

1. Certifiquem-se de que cada classe Java possui comentários explicativos para descrever suas funcionalidades.

2. Criem uma branch "dev" a partir da "main" e para todas as tarefas deve se criar uma branch a partir da "dev".

3. Padronizem a criação de branches, podem seguir esse exemplo de padronização: 

    Nomes de branches são compostos de 3 partes:
    
        1 — Categoria do branch. As categorias podem ser os seguintes:
        
        docs: apenas mudanças de documentação;
        feat: uma nova funcionalidade;
        fix: a correção de um bug;
        perf: mudança de código focada em melhorar performance;
        refactor: mudança de código que não adiciona uma funcionalidade e também não corrigi um bug;
        style: mudanças no código que não afetam seu significado (espaço em branco, formatação, ponto e vírgula, etc);
        test: adicionar ou corrigir testes.
   
        2 — o que o branch faz em si.
        
        3 — Código da tarefa no Trello ou Jira. Ex.: PF-123 *.
        
        Exemplos de alguns nomes de branches que podem existir em nossa aplicação:
        
        feat-cadastro-veiculos-PF-123
        refactor-edicao-colaboradores-PF-355
        fix-busca-checklists-PF-232

        *PF - Projeto Final

![image](https://github.com/SkiereszDiego/Java-Caldeira-Online/blob/dde46e4f29e7f2d3f03d6d4d02be9417d3822311/aula07/commit%20semantico.webp)

4. Nunca faça commit ou push diretamente na branch "main". A branch "main" deve ser considerada como a branch principal e estável do projeto.

5. É importante adicionar uma mensagem de commit descritiva, de preferencia utilizar convençõs como [Commit semantico ](https://docs.zelda.fanapis.com/docs/games) .

6. Certifiquem-se de resolver qualquer conflito que possa ocorrer durante o processo de push.

7. Organizem pacotes de forma lógica, criem classes com responsabilidades específicas, evitem acumular muitas funcionalidades em uma classe para uma estrutura de código clara e eficiente.

8. Garanta que os pacotes do projeto sejam organizados de maneira lógica e coesa.

9. O README deve conter intruções de configuração, execução do projeto, estrutura do projeto e equipe de desenvolvedores.

### Requisitos:

- Implementar uma API Restful utilizando Spring Boot.
- Integrar a API com a API externa fornecida em https://www.narutodb.xyz/docs/characters.
- Criar endpoints para realizar operações básicas relacionadas aos personagens de Naruto, como obter a lista de personagens, detalhes de um personagem específico, etc.

Tópicos para Avaliação:

- Conhecimento em Spring Boot e desenvolvimento de APIs Restful.
- Habilidade em consumir APIs externas e manipular os dados obtidos.
- Boas práticas de codificação, como organização de código, tratamento de exceções, etc.

### Instruções:

1. Configuração do Projeto:

    Utilize o Spring Initializr para configurar o projeto Spring Boot.
    Adicione as dependências necessárias, como Web, Lombok, etc.

2. Integração com a API Externa:

    Utilize o endpoint fornecido (https://www.narutodb.xyz/api/v1/characters) para obter a lista de personagens de Naruto.
    Considere a estrutura de dados retornada pela API externa para mapear suas entidades no projeto Spring.

3. Endpoints da API:

    Implemente os seguintes endpoints na sua API Spring:
        GET /api/characters: Retorna a lista de todos os personagens.
        GET /api/characters/{id}: Retorna os detalhes de um personagem específico por ID.
        POST /api/characters: Adiciona um novo personagem (pode ser fictício, já que não temos um endpoint de escrita na API externa).
        DELETE /api/characters/{id}: Remove um novo personagem que foi adicionado previamente no endpoint acima.

4. Testes:

    Crie testes unitários para os seus serviços e controladores.
    Considere o uso de ferramentas como JUnit e Mockito.

5. Documentação:

    Documente sua API utilizando Swagger ou outra ferramenta de documentação de API.
    Certifique-se de incluir exemplos de solicitações e respostas.

### Avaliação Extra:

1. Implemente tratamento de erros apropriado em sua API.
2. Utilize o cache para otimizar as chamadas à API externa.
3. Adicione paginação à lista de personagens.

🌟 Boa sorte! Que a vontade do fogo (e do Spring) esteja com vocês durante este desafio final! 🌟

![image](https://github.com/SkiereszDiego/Java-Caldeira-Online/blob/b4ce962aa216e565bc1c253d6b71cfaffc1b358a/aula07/kakashi.gif)
