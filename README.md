# graphql-react-and-spring-accounts-demo
graphql-react-and-spring-accounts-demo



https://graphql.org/learn/
https://graphql.org/
https://graphql.org/learn/best-practices/
https://www.apollographql.com/


O que é GraphQL?
GraphQL é uma linguagem de consulta e ambiente de execução voltada a servidores para as interfaces de programação de aplicações (APIs) cuja prioridade é fornecer exatamente os dados que os clientes solicitam e nada além. 

O GraphQL foi desenvolvido para tornar as APIs mais rápidas, flexíveis e intuitivas para os desenvolvedores. Ainda é possível implantá-lo em um ambiente de desenvolvimento integrado (IDE) conhecido como GraphiQL. Como alternativa à arquitetura REST, o GraphQL permite aos desenvolvedores construir solicitações que extraem os dados de várias fontes em uma única chamada de API. 

Além disso, o GraphQL proporciona aos profissionais responsáveis pela manutenção das APIs flexibilidade para adicionar ou preterir campos, sem afetar as consultas existentes. Os desenvolvedores podem criar APIs com o método que quiserem, pois a especificação do GraphQL assegura que elas funcionem de maneira previsível para os clientes.




What is Over-Fetching or Under-fetching?

A busca excessiva está buscando muitos dados, o que significa que há dados na resposta que você não usa.

Under-fetching é não ter dados suficientes com uma chamada para um endpoint, forçando você a chamar um segundo endpoint.

Em ambos os casos, são problemas de desempenho: você usa mais largura de banda do que o ideal ou está fazendo mais solicitações HTTP do que o ideal.

Em um mundo perfeito, esses problemas nunca surgiriam; você teria exatamente os endpoints certos para fornecer exatamente os dados certos para seus produtos.

Esses problemas geralmente aparecem quando você dimensiona e itera em seus produtos. Os dados que você usa em suas páginas geralmente mudam, e o custo para manter um endpoint separado com exatamente os dados certos para cada componente torna-se muito alto.

Portanto, você acaba com um compromisso entre não ter muitos endpoints e fazer com que os endpoints se ajustem melhor às necessidades de cada componente. Isso levará a uma busca excessiva em alguns casos (o ponto de extremidade fornecerá mais dados do que o necessário para um componente específico) e a uma busca insuficiente em alguns outros (você precisará chamar um segundo ponto de extremidade).


O GraphQL corrige esse problema porque permite solicitar quais dados você deseja do servidor. Você especifica o que precisa e obterá esses dados, e somente esses dados, em uma viagem ao servidor.


Vantagens e desvantagens do GraphQL em ambientes corporativos
Você está pensando em experimentar o GraphQL em um ambiente corporativo? A adoção do GraphQL tem seus prós e contras.

Vantagens
Os esquemas definem uma única "fonte da verdade" em uma aplicação que usa o GraphQL. É uma maneira da organização federar a API inteira.
As chamadas do GraphQL são processadas em uma única transmissão com ida e volta. Os clientes recebem exatamente o que solicitam, sem mais dados do que o necessário (overfetching).
Os tipos de dados são bem definidos, o que reduz as falhas de comunicação entre o cliente e o servidor.
O GraphQL é introspectivo. Um cliente pode solicitar uma lista de tipos de dados disponíveis. Isso é ideal para gerar documentação automaticamente.
O GraphQL permite evoluir a API de uma aplicação sem prejudicar as consultas existentes.
Há muitas extensões open source disponíveis para o GraphQL e várias oferecem funcionalidades que não estão presentes nas APIs REST.
O GraphQL não determina uma arquitetura de aplicação específica. Ele pode ser introduzido em uma API REST existente e funciona com as ferramentas de gerenciamento de API que você já tem.
Desvantagens
Desenvolvedores acostumados com as APIs REST terão que enfrentar uma certa curva de aprendizado com o GraphQL.
O GraphQL direciona muito do trabalho de consulta de dados para o servidor, o que aumenta a complexidade para os desenvolvedores.
Dependendo de como for implementado, o GraphQL talvez exija estratégias para o gerenciamento da API diferentes das aplicadas às APIs REST, principalmente em relação aos limites de taxas e preços.
O armazenamento em cache é mais complexo do que na arquitetura REST.
Os profissionais responsáveis pela manutenção da API terão a tarefa extra de escrever um esquema do GraphQL que possa ser submetido à manutenção.
