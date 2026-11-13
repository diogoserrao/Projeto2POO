# Simulador de Aeroporto

## Descrição

Este projeto tem como objetivo desenvolver, utilizando Java, um simulador de aeroporto que permita representar e acompanhar as principais operações realizadas num aeroporto.

O simulador irá incluir elementos como aviões, pistas de aterragem e descolagem, terminais, portas de embarque e zonas de estacionamento. O objetivo será gerir e organizar o movimento dos aviões, garantindo que as diferentes operações sejam realizadas de forma segura e eficiente.

Ao longo da simulação, poderão ocorrer diferentes situações, como a chegada e partida de aviões, a atribuição de portas de embarque e a necessidade de controlar o fluxo de tráfego aéreo dentro do aeroporto.

O projeto pretende proporcionar uma experiência interativa e permitir a aplicação de conceitos de programação orientada a objetos em Java, através da criação e interação entre diferentes classes e objetos que representam os vários elementos do aeroporto.

---

## Elementos de Avaliação do Projeto

A avaliação será composta por diferentes componentes. Os requisitos definidos são de implementação obrigatória e têm um valor total de 20 valores. O peso dos requisitos que não forem cumpridos será subtraído à nota final do trabalho. Adicionalmente, existem até 3 valores extra que os estudantes poderão obter mediante a implementação de funcionalidades opcionais, conforme especificado no final desta secção.

### Requisitos (55%)

Os requisitos apresentados abaixo, que correspondem a 20 valores, são de implementação obrigatória e a respetiva cotação não pode ser recuperada através dos pontos extra. Importa referir que o foco é a implementação do requisito essencial, sendo que muitos dos detalhes descritos em cada um podem ser adaptados ou omitidos, ficando ao critério do grupo determinar a melhor abordagem e a respetiva explicação no relatório final.

- **Gestão de aviões**
  O sistema deve permitir registar e gerir os aviões presentes no aeroporto, incluindo informações como matrícula, companhia aérea, modelo e capacidade. Em caso de situações de emergência, o avião recebe propriedade em relação aos restantes aviões.

- **Gestão de voos**
  O sistema deve permitir criar, consultar e atualizar voos, indicando informações como número do voo, origem, destino, horário e estado do voo.

- **Aterragem e descolagem**
  O sistema deve permitir simular a aterragem e a descolagem dos aviões, garantindo que as operações respeitam as condições definidas pelo sistema.

- **Gestão das pistas**
  O aeroporto deve possuir uma ou mais pistas. O sistema deve controlar a sua utilização, impedindo que dois aviões utilizem a mesma pista simultaneamente.

- **Gestão das portas de embarque**
  O sistema deve permitir atribuir portas de embarque aos voos e controlar a sua disponibilidade.

- **Estado dos voos**
  Cada voo deve possuir um estado, como Agendado, Em embarque, Atrasado, Em voo, Aterrado, Cancelado ou Concluído.

- **Passageiros**
  O sistema deve permitir registar passageiros e associá-los aos respectivos voos.

- **Embarque e desembarque**
  O sistema deve permitir simular o embarque dos passageiros antes da partida e o desembarque após a chegada do avião.

- **Controlo de conflitos**
  O sistema deve detectar situações incompatíveis, como tentar atribuir uma pista ou porta de embarque que já esteja ocupada.

- **Pesquisa e consulta**
  O utilizador deve conseguir consultar informações sobre aviões, voos, passageiros, pistas e portas de embarque.

- **Simulação do aeroporto**
  O sistema deve permitir iniciar uma simulação na qual os aviões chegam, aterram, permanecem no aeroporto e posteriormente realizam a sua descolagem.

- **Interface de utilização**
  O sistema deve disponibilizar uma interface que permita ao utilizador interagir com o simulador e consultar o estado atual do aeroporto.

- **Carregamento de dados**
  O sistema deve carregar dados a partir de um documento `.txt` para popular o sistema com dados predefinidos.

### Principios SOLID (45%)

Esta seção detalha os critérios de avaliação para o projeto, focando na aplicação dos princípios SOLID e das boas práticas de programação orientada a objetos. Cada secção aborda um conceito fundamental, descreve os princípios envolvidos e explica como será feita a avaliação.

#### Encapsulamento (20%)

**Descrição**

O encapsulamento consiste no uso adequado de modificadores de acesso—como `private`, `public` e `protected`—para proteger os dados internos das classes. Essa prática assegura que apenas métodos públicos expõem o necessário, mantendo os detalhes de implementação ocultos e permitindo alterações internas sem impactar outras partes do sistema.

**Princípio SOLID Avaliado**

**S - Princípio da Responsabilidade Única (SRP):** Assegura que cada classe tem apenas uma responsabilidade, facilitando o encapsulamento de dados e comportamentos relacionados.

**Avaliação**

- **Proteção de Atributos:** Verificar se as classes protegem corretamente os seus atributos, evitando acesso indevido.
- **Getters e Setters:** Analisar o uso apropriado destes métodos para controlar o acesso aos dados.
- **Responsabilidade Única:** Garantir que cada classe possui uma responsabilidade clara, evitando o acoplamento indevido de funcionalidades distintas.

#### Abstração (20%)

**Descrição**

A abstração foca nos aspectos essenciais de um objeto, ocultando detalhes complexos que não são relevantes para o contexto atual. Isso é alcançado através do uso de classes abstratas e interfaces para representar conceitos gerais, permitindo que detalhes específicos sejam implementados em subclasses.

**Princípio SOLID Avaliado**

**O - Princípio Aberto/Fechado (OCP):** As classes devem ser abertas para extensão, mas fechadas para modificação. A abstração permite estender funcionalidades sem alterar o código existente.

**Avaliação**

- **Uso de Abstrações:** Avaliar o emprego de classes abstratas e interfaces para definir contratos genéricos entre componentes do sistema.
- **Métodos Abstratos:** Verificar a implementação de métodos abstratos que são especificados em subclasses, promovendo extensibilidade.
- **Extensibilidade sem Modificação:** Projetar sistemas que permitam adicionar novas funcionalidades através de extensão, evitando modificações no código existente.

#### Herança (15%)

**Descrição**

A herança estabelece uma relação "é um" entre classes, permitindo a reutilização de código através de subclasses que herdam características de superclasses. Isso facilita a organização hierárquica e a manutenção do código.

**Princípio SOLID Avaliado**

**L - Princípio da Substituição de Liskov (LSP):** Objetos de uma classe devem poder ser substituídos por objetos de suas subclasses sem afetar o funcionamento do sistema.

**Avaliação**

- **Hierarquias Correta:** Implementação adequada de hierarquias de classes que respeitam o LSP.
- **Comportamento Consistente:** Assegurar que as subclasses mantêm o comportamento esperado das superclasses.
- **Uso Apropriado da Herança:** Utilizar herança de forma a evitar violações do LSP, garantindo a integridade e previsibilidade do sistema.

#### Polimorfismo (20%)

**Descrição**

O polimorfismo é a capacidade de objetos de diferentes classes serem tratados como instâncias de uma classe base comum, permitindo a substituição dinâmica de comportamentos. Isso promove flexibilidade e extensibilidade no código.

**Princípio SOLID Avaliado**

**I - Princípio da Segregação de Interfaces (ISP):** Muitas interfaces específicas são melhores do que uma interface geral. O polimorfismo facilita a implementação de interfaces mais específicas.

**Avaliação**

- **Métodos Sobrescritos:** Uso de anotações `@Override` em subclasses para implementar comportamentos específicos.
- **Interfaces Específicas:** Implementação de interfaces direcionadas para funcionalidades distintas, promovendo coesão.
- **Evitar Interfaces "Gordas":** Prevenir a criação de interfaces extensas que forçam classes a implementar métodos desnecessários.

#### Coesão e Acoplamento (10%)

##### Coesão

**Descrição**

A coesão é um princípio fundamental na engenharia de software que se refere ao grau em que os elementos dentro de uma classe estão relacionados entre si e contribuem para uma única tarefa ou finalidade. Uma classe altamente coesa é aquela em que todos os seus métodos e atributos trabalham juntos para realizar uma única responsabilidade claramente definida.

**Princípio SOLID Avaliado**

**S - Princípio da Responsabilidade Única (SRP):** Cada classe deve ter apenas uma razão para mudar, ou seja, deve possuir uma única responsabilidade.

**Avaliação**

- **Responsabilidades Definidas:** Verificar se as classes têm responsabilidades bem definidas e limitadas.
- **Evitar multifuncionalidades:** Prevenir a criação de classes que acumulam funcionalidades não relacionadas, o que diminui a coesão.

##### Acoplamento

**Descrição**

O acoplamento é o grau de interdependência entre classes. Um baixo acoplamento aumenta a modularidade e facilita a manutenção e evolução do sistema. Também conhecido por código esparguete.

**Princípio SOLID Avaliado**

**D - Princípio da Inversão de Dependência (DIP):** Depende de abstrações, não de implementações concretas.

**Avaliação**

- **Redução de Dependências:** Uso de interfaces e abstrações para minimizar dependências diretas entre classes concretas.
- **Flexibilidade do Código:** Evitar dependências rígidas que dificultam a manutenção e a extensão do código.

#### Reutilização de Código e Manutenibilidade (10%)

**Descrição**

Estruturar o código para ser facilmente mantido e utilizado é fundamental. Isso inclui a organização lógica e práticas que promovam a clareza e a modularidade.

**Princípios SOLID Avaliados**

- **O - Princípio Aberto/Fechado (OCP):** Facilita a extensão do código sem modificar o existente.
- **D - Princípio da Inversão de Dependência (DIP):** Promove modularidade e facilita a reutilização.

**Avaliação**

- **Organização Modular:** Verificar a estruturação lógica e modular do código.
- **Nomenclatura Clara:** Uso de nomes consistentes e descritivos para classes, métodos e variáveis.
- **Documentação Adequada:** Inclusão de comentários e documentação que suportem a manutenção futura.

#### Tratamento de Exceções (5%)

**Descrição**

A gestão adequada de situações de erro é essencial para a robustez do sistema. O uso correto de exceções permite lidar com condições anómalas sem comprometer a estabilidade da aplicação.

**Princípio SOLID Avaliado**

**S - Princípio da Responsabilidade Única (SRP):** Manter o tratamento de erros separado da lógica de negócio principal.

**Avaliação**

- **Uso de Try-Catch:** Emprego apropriado de blocos `try-catch` para capturar e tratar exceções.
- **Exceções Personalizadas:** Criação de exceções específicas para casos particulares, melhorando a clareza e a manutenção.
- **Separação de Responsabilidades:** Garantir uma distinção clara entre a lógica de negócio e o tratamento de erros.

---

## Relatório

A elaboração de um bom relatório técnico do software desenvolvido é fundamental para comunicar de forma eficaz as características, funcionalidades e decisões de design do projeto. Um relatório bem construído não só documenta o trabalho realizado, mas também facilita a manutenção futura, a colaboração entre equipes e a compreensão profunda do sistema por parte de terceiros. Para garantir a qualidade do relatório técnico, é essencial focar em três pilares principais: clareza e completude, apresentação profissional e profundidade técnica.

### Clareza e Completude (50%)

A clareza e a completude são essenciais para que o relatório cumpra o seu propósito informativo. Um relatório claro e bem estruturado permite que o leitor compreenda facilmente o conteúdo sem ambiguidades ou confusões.

- **Estruturação Adequada:** O relatório deve incluir todas as seções necessárias, como introdução, objetivos, metodologia, resultados, conclusões e referências. Cada seção deve fluir logicamente para a próxima, facilitando a leitura e a compreensão do documento.
- **Descrições Compreensíveis:** As explicações devem ser detalhadas o suficiente para que o leitor entenda completamente os conceitos apresentados. Evite jargões excessivos e, quando utilizados, certifique-se de que estão devidamente explicados.
- **Coerência e Coesão:** As ideias devem ser apresentadas de forma coerente, com transições suaves entre tópicos. A coesão textual assegura que cada parte do relatório contribui para um entendimento unificado do projeto.

### Apresentação Profissional (25%)

A apresentação profissional do relatório reflete o cuidado e o rigor aplicados no desenvolvimento do projeto. Um documento bem formatado transmite credibilidade e facilita a assimilação das informações.

- **Padrões Profissionais:** O formato do relatório deve seguir os padrões estabelecidos para documentos técnicos, incluindo margens, fontes, espaçamento e numeração de páginas. O uso consistente de estilos e formatações contribui para a uniformidade do documento.
- **Elementos Visuais:** A inclusão de figuras, tabelas e diagramas é fundamental para ilustrar conceitos complexos e apresentar dados de forma clara. Esses elementos devem ser devidamente legendados e referenciados no texto.
- **Cuidado Estético:** Atenção aos detalhes como ortografia, gramática e pontuação é crucial. Um relatório livre de erros demonstra profissionalismo e atenção ao detalhe.

### Profundidade Técnica (25%)

A profundidade técnica do relatório evidencia o nível de entendimento e competência da equipe em relação ao projeto desenvolvido.

- **Entendimento Técnico Sólido:** O relatório deve demonstrar um conhecimento aprofundado dos conceitos técnicos envolvidos. Isso inclui explicações detalhadas sobre as tecnologias utilizadas, algoritmos implementados e desafios enfrentados.
- **Justificativas de Design:** As decisões de design tomadas durante o desenvolvimento do software devem ser bem justificadas. Explique por que determinadas abordagens foram escolhidas em detrimento de outras, considerando aspectos como eficiência, escalabilidade e manutenção.
- **Orientações para o Futuro:** Inclua recomendações e orientações úteis para a manutenção e expansão do sistema. Detalhes sobre possíveis melhorias, funcionalidades adicionais e considerações para futuras atualizações são valiosos para quem dará continuidade ao projeto.

---

## Instruções gerais e submissão do projeto

O projeto deverá ser realizado pelos grupos previamente definidos e deverão ser entregues um relatório e código do sistema implementado em JAVA com as funcionalidades descritas anteriormente.

**Relatório:** No relatório devem descrever detalhadamente a abordagem e implementação do trabalho realizado. Deverão também incluir um diagrama de classes UML que descreve o modelo do projeto realizado. O diagrama deve preferencialmente ser realizado recorrendo a uma ferramenta de modelação.

> [!IMPORTANT]
> **NOTA IMPORTANTE**
>
> **ANTES DE ESCREVER CÒDIGO, É ACONSELHÁVEL FAZER O DESENHO DO SISTEMA ANTES DE IMPLEMENTAR PARA ASSEGURAR QUE OS REQUISITOS ESTEJAM IMPLEMENTADOS**

O relatório deve incluir o código do projeto em anexo como texto, **NÃO como figura**. Sem este requisito a entrega não será considerada válida.

**Código:** Deverão entregar a pasta do projeto realizado no IDE Netbeans Apache. O código deverá estar devidamente estruturado e comentado para transmitir de forma breve o objetivo de cada componente. O código recebido pelos docentes deve ser executável sem qualquer modificação ou preparação prévia. **Caso o código não seja executado, o grupo fica imediatamente reprovado!**

O relatório, anexo e o projeto devem ser entregues via Infoalunos. O relatório e anexo deverão também ser enviados para o Gabinete de Apoio ao Estudante.

### Defesa do Projeto

Após a realização do projeto, os alunos deverão fazer a defesa do mesmo. A defesa será individual pelo que os elementos do grupo devem dominar a totalidade do trabalho realizado. **Caso o aluno chumba a defesa oral, reprova a cadeira.**

As datas de entrega referentes a cada etapa estão indicadas na tabela que se segue.

### Milestones

| Data | Entrega |
| --- | --- |
| Até 29 de Dezembro de 2027 | Entrega do código e relatório descrevendo o trabalho desenvolvido (via infoalunos + GAE).<br>Formato de entrega: `[NomeProjecto_Grupo#.zip]` |
| Dias 4,5,6,7 Jan 2027 | Defesa individual do projeto desenvolvido. |

---

## Considerações Gerais

Durante a sua implementação, o problema deve ser abordado de forma gradual:

- Desenvolvam o sistema incrementalmente e vão testando as diferentes classes à medida que vão implementando.
- Construam o esqueleto da classe `Main` que trata da entrada e saída dos dados e da interação com a aplicação.
- Vão fazendo, testando, e avançando por incrementos, à medida que as funcionalidades vão sendo desenvolvidas. Se necessário, criem pequenos programas de teste auxiliares.
- É preferível apresentarem um projeto que funciona, mas que não cumpre todas as funcionalidades do que apresentar um projeto que supostamente implementa tudo, mas não funciona.
- Os pormenores de interface com o utilizador não são considerados elementos de avaliação para o presente trabalho.
