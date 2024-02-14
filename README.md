# TCC-UnlockSafely
<h2>Fechadura Inteligente com impressão digital utilizando arduino.</h2>

<h3>Responsáveis: Eduardo Coppi, Gabriel Ronconi, Heliel Hislei e Mikael Braghini</h3>

<div align="center">
	<img src="LogoProjetoTCC.png" width="200px">
</div>


Problema: Gerenciamento de chaves dos armarios 

●	Área: Escolas<br />
●	Responsável: Matheus Michilino<br />
<h2>1. Escopo</h2>
O projeto tem como objetivo erradicar o uso de chaves para abertura dos armários, sendo possível gerir de uma maneira eficiente o uso de tais, por meio de uma “fechadura eletrônica”, ao colocar sua digitar, o armário atribuído a você destrancará. o objetivo principal do projeto é sanar o problema dos alunos, professores(a) e etc, saírem da escola e não devolverem as chaves dos armários, sendo necessário romper o cadeado para abertura dos armário, visando facilitar essa gestão dos armários após a saída dos estudantes ou funcionários.
<h2>2. Objetivos do projeto</h2>
●	Desenvolver uma tranca eletrônica para a abertura dos armários apartir do leitor biométrico.<br />
●	Implementar interface com mecanismo de segurança para gerenciar digitais.<br />
●	Implementar sistema eletroeletronico para a abertura dos armários.<br />
●	Estabelecer uma forma segura de manter os pertences.<br />
●	Melhorar a gestão dos armários para garantir uma maior organização da instituição.<br />
●	Reduzir os custos associados a compra dos cadeados e chaves.<br />

<h2>3. Análise de Riscos</h2>
<h5>Problemas com a parte do hardware</h5><br />
•	Estratégias de Mitigação: Unir projetos TCC com algum grupo da turma de Mecatrônica, desta forma, faremos todo o desenvolvimento do software e o outro grupo, a parte mecânica (hardware).<br />
•	Plano de Contingência: Com a falta de disponibilidade do professor, tem a necessidade de recorrer a diversas opções para auxiliar nesta parte, como materias da internet, documentações, vídeos, os alunos da mecatrônica e professor.<br />

<h5>Falhas técnicas no projeto</h5><br />
•	Estratégias de Mitigação: Sempre realizar testes do projeto, analisando cada detalhe especificamente, com a lógica de cada funcionalidade, recorrer sempre a ajudas externas ao longo prazo.<br />
•	Plano de Contingência: Adquirir a capacidade de resolução de problemas, de último caso, utilizaremos a última versão já entregue e sem erros, e desenvolver a partir dela, visando corrigir os erros.<br />

<h5>Mudanças nos Requisitos durante o Desenvolvimento</h5><br />
•	Estratégias de Mitigação: Ter visão ao longo prazo e entender que pode haver mudanças. Adquirir a capacidade de reorganizar ideias e funções conforme as mudanças dos requisitos.<br />
•	Plano de Contingência: Ser resiliente e se adaptar de último momento às mudanças e novas especificações impostas. Comunicação entre o grupo é primordial para o melhor desenvolvimeto do projeto em diferentes circunstâncias.<br />

<h2>4. Cronograma</h2>
•	Janeiro/2024: Planejamento e Análise<br />
	●	Formação das equipes;<br />
	●	Identificação de requisitos detalhados;<br />
	●	Início do desenvolvimento do escopo do projeto e documentação da ideia inicial;<br />
●	Definição do backlog e prioridade das atividades;<br />
•	Fevereiro/2024: <br />
•	Desenvolvimento do MVP (menor produto viável);<br />
●	Codificação e validação do MVP com o cliente e adaptação dos documentos de escopo (se necessário);<br />
•	Março/2024: <br />
●	Desenvolvimento das interfaces do usuário, fluxos da aplicação;<br />
●	Desenvolvimento dos micro serviços e bancos de dados;<br />
●	Revisão e ajuste do protótipo com feedback da equipe e usuários;<br />
•	Abril/2024: <br />

●	Implementação do Painel de Supervisão e Integração;<br />
●	Desenvolvimento do painel de supervisão para os gestores;<br />
●	Início da integração com sistemas existentes;<br />
●	Testes de integração e ajustes necessários;<br />
•	Maio/2024: Testes Finais e Lançamento;<br />

<h2>5. Recursos</h2>
	Pessoal:<br />
●	Desenvolvedores de Software: Para a criação do sistemas para supervisores, funcionários e alunos.<br />
●	Equipe de Treinamento: Para capacitar supervisores, funcionários e alunos no uso do novo sistema.<br />
●	Gerente de Projeto: Para coordenar e supervisionar todas as atividades.<br />
	Tecnologia:<br />
●	Ambiente de Desenvolvimento Integrado (IDE): Ferramentas adequadas para o desenvolvimento do sistema e do painel de supervisão.<br />
●	Sistemas de versionamento de código: git e github para manter o código versionado e sempre atualizado.<br />
●	Servidores e Infraestrutura em Nuvem: Para hospedar o sistema, o painel de supervisão e os dados do sistema.<br />
●	Ferramentas de Teste de Software: Para garantir a qualidade e a confiabilidade do sistema.<br />

 <h2>7 Documentação</h2>



Requisitos funcionais<br />
	Como um funcionário, eu quero poder trancar o meu armário para guardar meus pertences.<br />
●	Critérios de Aceitação: Deve ser possível adicionar um usuário e uma senha no ambiente específico dos armários.<br />
	
	
	Como um supervisor, eu quero ter acesso a um painel de supervisão para visualizar o status de armários que estão ocupados ou não.<br />
●	Critérios de Aceitação: O painel de supervisão deve exibir uma visão geral dos armários que estão ocupados ou não.<br />
	

	Como um funcionário, eu quero ter um treinamento inicial no uso do sistema, para garantir que eu possa utilizá-lo eficientemente.<br />
●	Critérios de Aceitação: A equipe de treinamento deve fornecer sessões iniciais de treinamento que cubram todos os recursos e funcionalidades do sistema.<br />
	
<h2>8. Avaliação do Projeto</h2><br />
	Taxa de Adoção do Sistema:<br />
●	Objetivo: Alcançar uma taxa de adoção de 100% entre os usuários de armários da escola, sejam eles funcionários ou alunos que possuem os requisitos para uso.<br />
●	Métrica: Número total de funcionários e alunos utilizando o sistema em comparação com o número total de funcionários e alunos que possuem armários.<br />
	
	Eficiência Operacional:<br />
●	Objetivo: Otimização do tempo, pois não terá mais que procurar chaves ou em caso de perca de alguma chave e garantir mais segurança aos pertences dos usuários de armários. <br />
●	Métrica: Comparação dos usuários que cadastraram a digital.<br />
	Taxa de Conclusão de Limpeza:<br />
●	Objetivo: Alcançar uma taxa de instalação do sistema em 100% de pelo menos 95% dos ambientes designados no prazo estabelecido.<br />
●	Métrica: Número de ambientes que possuem armários com sistema implementados em relação ao número total de ambientes designados implementação.<br />
	
	Satisfação do Usuário:<br />
●	Objetivo: Alcançar uma pontuação de satisfação do usuário de pelo menos 4,5 em 5, com base em pesquisas de satisfação.<br />
●	Métrica: Resultados de pesquisas de satisfação realizadas com funcionários e supervisores.<br />
	
	Integridade dos Dados:<br />
●	Objetivo: Alcançar uma precisão de pelo menos 98% na integridade dos dados registrados pelo sistema.<br />
●	Métrica: Comparação entre os dados registrados no sistema e as verificações físicas dos ambientes.<br />
	
	Disponibilidade do Sistema:<br />
●	Objetivo: Garantir uma disponibilidade do sistema de pelo menos 99,5% ao longo do tempo.<br />
●	Métrica: Tempo total de operação sem interrupções em comparação com o tempo total planejado.<br />
	
	Tempo de Implementação:<br />
●	Objetivo: Cumprir o cronograma estabelecido, realizando a implementação e lançamento até a data prevista.<br />
●	Métrica: Comparação entre a data de conclusão real e a data planejada.<br />
