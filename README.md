# TCC-UnlockSafely
Fechadura Inteligente com impressão digital utilizando arduino.

<img src="LogoProjetoTCC.png" width="200px">

Problema: Gerenciamento de chaves dos armarios 

●	Área: Escolas
●	Responsável: Professor Roberto
1. Escopo
O projeto tem como objetivo erradicar o uso de chaves para abertura dos armários, sendo possível gerir de uma maneira eficiente o uso de tais, por meio de uma “fechadura eletrônica”, ao colocar sua digitar, o armário atribuído a você destrancará. o objetivo principal do projeto é sanar o problema dos alunos, professores(a) e etc, saírem da escola e não devolverem as chaves dos armários, sendo necessário romper o cadeado para abertura dos armário, visando facilitar essa gestão dos armários após a saída dos estudantes ou funcionários.
2. Objetivos do projeto
●	Desenvolver uma tranca eletrônica para a abertura dos armários apartir do leitor biométrico.
●	Implementar interface com mecanismo de segurança para gerenciar digitais.
●	Implementar sistema eletroeletronico para a abertura dos armários.
●	Estabelecer uma forma segura de manter os pertences.
●	Melhorar a gestão dos armários para garantir uma maior organização da instituição.
●	Reduzir os custos associados a compra dos cadeados e chaves.

3. Análise de Riscos
Risco: Problemas com a parte do hardware
•	Estratégias de Mitigação: Unir projetos TCC com algum grupo da turma de Mecatrônica, desta forma, faremos todo o desenvolvimento do software e o outro grupo, a parte mecânica (hardware).
•	Plano de Contingência: Com a falta de disponibilidade do professor, tem a necessidade de recorrer a diversas opções para auxiliar nesta parte, como materias da internet, documentações, vídeos, os alunos da mecatrônica e professor.

Risco: Falhas técnicas no projeto
•	Estratégias de Mitigação: Sempre realizar testes do projeto, analisando cada detalhe especificamente, com a lógica de cada funcionalidade, recorrer sempre a ajudas externas ao longo prazo.
•	Plano de Contingência: Adquirir a capacidade de resolução de problemas, de último caso, utilizaremos a última versão já entregue e sem erros, e desenvolver a partir dela, visando corrigir os erros.

Risco: Mudanças nos Requisitos durante o Desenvolvimento
•	Estratégias de Mitigação: Ter visão ao longo prazo e entender que pode haver mudanças. Adquirir a capacidade de reorganizar ideias e funções conforme as mudanças dos requisitos.
•	Plano de Contingência: Ser resiliente e se adaptar de último momento às mudanças e novas especificações impostas. Comunicação entre o grupo é primordial para o melhor desenvolvimeto do projeto em diferentes circunstâncias.
4. Cronograma
•	Janeiro/2024: Planejamento e Análise
●	Formação das equipes;
●	Identificação de requisitos detalhados;
●	Início do desenvolvimento do escopo do projeto e documentação da ideia inicial;
●	Definição do backlog e prioridade das atividades;
•	Fevereiro/2024: 
•	Desenvolvimento do MVP (menor produto viável);
●	Codificação e validação do MVP com o cliente e adaptação dos documentos de escopo (se necessário);
•	Março/2024: 
●	Desenvolvimento das interfaces do usuário, fluxos da aplicação;
●	Desenvolvimento dos micro serviços e bancos de dados;
●	Revisão e ajuste do protótipo com feedback da equipe e usuários;
•	Abril/2024: 

●	Implementação do Painel de Supervisão e Integração;
●	Desenvolvimento do painel de supervisão para os gestores;
●	Início da integração com sistemas existentes;
●	Testes de integração e ajustes necessários;
•	Maio/2024: Testes Finais e Lançamento;
5. Recursos
	Pessoal:
●	Desenvolvedores de Software: Para a criação do sistemas para supervisores, funcionários e alunos.
●	Equipe de Treinamento: Para capacitar supervisores, funcionários e alunos no uso do novo sistema.
●	Gerente de Projeto: Para coordenar e supervisionar todas as atividades.
	Tecnologia:
●	Ambiente de Desenvolvimento Integrado (IDE): Ferramentas adequadas para o desenvolvimento do sistema e do painel de supervisão.
●	Sistemas de versionamento de código: git e github para manter o código versionado e sempre atualizado.
●	Servidores e Infraestrutura em Nuvem: Para hospedar o sistema, o painel de supervisão e os dados do sistema.
●	Ferramentas de Teste de Software: Para garantir a qualidade e a confiabilidade do sistema.
	
	Equipamentos:
Computadores, Notebooks, Solenoides, Teclado numerico arduino e Arduinos: Para desenvolvimento, teste e gerenciamento de projeto.
6. Custos
Pessoal:
	Desenvolvedores de Software:
●	4 desenvolvedores trabalhando por 5 dias na semana.
●	Custo médio por desenvolvedor por hora: R$ 50
●	Custo total: $50/hora/desenvolvedor * 4 desenvolvedores * 5 dias/semana * 4 horas/dia * 18 semanas = R$72,000
	Equipe de Treinamento:
●	4 pessoas trabalhando por 5 dias na semana (considerando treinamento inicial).
●	Custo médio por pessoa por hora: R$30
●	Custo total: R$30/hora/pessoa * 4 pessoas * 5 dias/semana * 4 horas/dia * 4 semanas = R$9,600
	Gerente de Projeto:
●	1 gerente de projeto.
●	Custo médio por gerente de projeto por hora: R$60
●	Custo total: R$60/hora/gerente * 1 gerente * 5 dias/semana * 4 horas/dia * 18 semanas = R$43,200
Equipamentos:
	Computadores e Notebooks:
●	Custo total: Nenhum, já possuimos;

Arduino: 
•	Custo total: R$70,00;

Solenoides:

•	Custo total: R$ 50,00

Teclado numérico arduino:

•	Custo total: R$ 15,00


Total Geral:
●	Pessoal: $81,600
●	Equipamentos: $200,00
Custo Total do Projeto: $81,800

7 Documentação

Requisitos funcionais
	Como um funcionário, eu quero poder trancar o meu armário para guardar meus pertences.
●	Critérios de Aceitação: Deve ser possível adicionar um usuário e uma senha no ambiente específico dos armários.
	
	
	Como um supervisor, eu quero ter acesso a um painel de supervisão para visualizar o status de armários que estão ocupados ou não.
●	Critérios de Aceitação: O painel de supervisão deve exibir uma visão geral dos armários que estão ocupados ou não.
	

	Como um funcionário, eu quero ter um treinamento inicial no uso do sistema, para garantir que eu possa utilizá-lo eficientemente.
●	Critérios de Aceitação: A equipe de treinamento deve fornecer sessões iniciais de treinamento que cubram todos os recursos e funcionalidades do sistema.
	
8. Avaliação do Projeto
	Taxa de Adoção do Sistema:
●	Objetivo: Alcançar uma taxa de adoção de 100% entre os usuários de armários da escola, sejam eles funcionários ou alunos que possuem os requisitos para uso.
●	Métrica: Número total de funcionários e alunos utilizando o sistema em comparação com o número total de funcionários e alunos que possuem armários.
	
	Eficiência Operacional:
●	Objetivo: Otimização do tempo, pois não terá mais que procurar chaves ou em caso de perca de alguma chave e garantir mais segurança aos pertences dos usuários de armários. 
●	Métrica: Comparação dos usuários que cadastraram a digital.
	Taxa de Conclusão de Limpeza:
●	Objetivo: Alcançar uma taxa de instalação do sistema em 100% de pelo menos 95% dos ambientes designados no prazo estabelecido.
●	Métrica: Número de ambientes que possuem armários com sistema implementados em relação ao número total de ambientes designados implementação.
	
	Satisfação do Usuário:
●	Objetivo: Alcançar uma pontuação de satisfação do usuário de pelo menos 4,5 em 5, com base em pesquisas de satisfação.
●	Métrica: Resultados de pesquisas de satisfação realizadas com funcionários e supervisores.
	
	Integridade dos Dados:
●	Objetivo: Alcançar uma precisão de pelo menos 98% na integridade dos dados registrados pelo sistema.
●	Métrica: Comparação entre os dados registrados no sistema e as verificações físicas dos ambientes.
	
	Disponibilidade do Sistema:
●	Objetivo: Garantir uma disponibilidade do sistema de pelo menos 99,5% ao longo do tempo.
●	Métrica: Tempo total de operação sem interrupções em comparação com o tempo total planejado.
	
	Tempo de Implementação:
●	Objetivo: Cumprir o cronograma estabelecido, realizando a implementação e lançamento até a data prevista.
●	Métrica: Comparação entre a data de conclusão real e a data planejada.
