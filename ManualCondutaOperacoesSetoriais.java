import java.util.Scanner;

public class ManualCondutaOperacoesSetoriais {
       
    Scanner leia = new Scanner(System.in);
       
    String[] manualCOSConteudo = new String[4];
	String[] titulosManuaisCOS = new String[4];

    int contadorCadastro = 2;

    public ManualCondutaOperacoesSetoriais() {
                       
        titulosManuaisCOS[0] = "Manual de conduta para o setor de montagem";

        manualCOSConteudo[0] =
                    "_______________________________________________________________________\n" +
                    "|-- OBJETIVO: Estabelecer as diretrizes e normas de conduta para    --|\n" +
                    "|    todos os colaboradores envolvidos no setor de montagem da WEG    |\n" +
                    "|_____________________________________________________________________|\n" +
                    "|                                                                     |\n" +
                    "| 1. CÓDIGO DE ÉTICA E CONDUTA:                                       |\n" +
                    "|                                                                     |\n" +
                    "| - Cada colaborador é responsável por sua área de atuação, e deve   .|\n" +
                    "|   garantir que a montagem seja realizada conforme os padrões de qualidade e segurança.                 |\n" +
                    "| - Honestidade, respeito e integridade são valores indispensáveis.   |\n" +
                    "| - Todos os documentos e informações relacionadas ao projeto são confidenciais,                          |\n" +
                    "|   e não devem ser compartilhados com pessoas externas à empresa.     |\n" +
                    "|---------------------------------------------------------------------|\n" +
                    "|                                                                     |\n" +
                    "| 2. SEGURANÇA NO TRABALHO:                                           |\n" +
                    "|                                                                     |\n" +
                    "| - O uso de EPIs adequados é obrigatório em todas as atividades de montagem.                                |\n" +
                    "| - Qualquer situação de risco deve ser imediatamente reportada ao supervisor.                               |\n" +
                    "| - Nunca realizar qualquer tarefa sem análise prévia dos riscos envolvidos. |\n" +
                    "| - Informar ao setor de manutenção caso um equipamento apresente defeito ou esteja em situações inadequadas de uso.|\n" +
                    "| - Os equipamentos devem ser mantidos em boas condições de uso, com inspeções regulares.                 |\n" +
                    "|---------------------------------------------------------------------|\n" +
                    "|                                                                     |\n" +
                    "| 3. QUALIDADE:                                                       |\n" +
                    "|                                                                     |\n" +
                    "| - Todos os produtos montados devem atender aos padrões de qualidade da WEG.                           |\n" +
                    "| - É obrigatório seguir as instruções de montagem, manuais técnicos e procedimentos operacionais padrão (POPs) em todas as atividades.  |\n" +
                    "| - O setor de montagem deve participar ativamente das iniciativas de melhoria contínua.|\n" +
                    "| - A qualidade deve ser verificada em cada etapa da montagem.                                          |\n" +
                    "|---------------------------------------------------------------------|\n" +
                    "|                                                                     |\n" +
                    "| 4. COMPORTAMENTO NO AMBIENTE DE TRABALHO:                           |\n" +
                    "|                                                                     |\n" +
                    "| - Todos os colaboradores devem manter o respeito e colaboração entre si.|\n" +
                    "| - A comunicação deve ser clara, precisa e eficiente.                |\n" +
                    "| - Os colaboradores devem cumprir com os horários estabelecidos.     |\n" +
                    "| - Em caso de ausência, o colaborador deve avisar o seu superior com antecedência. |\n" +
                    "|---------------------------------------------------------------------|\n" +
                    "|                                                                     |\n" +
                    "| 5. RESPONSABILIDADE AMBIENTAL:                                     |\n" +
                    "|                                                                     |\n" +
                    "| - Todos os resíduos gerados devem ser descartados corretamente.    |\n" +
                    "| - O uso consciente de recursos como energia e água é fundamental para a sustentabilidade.   |\n" +
                    "|---------------------------------------------------------------------|\n" +
                    "|                                                                     |\n" +
                    "| 6. TREINAMENTO E DESENVOLVIMENTO:                                   |\n" +
                    "|                                                                     |\n" +
                    "| - Todos os colaboradores devem participar de treinamentos contínuos para melhorar suas habilidades.    |\n" +
                    "| - A capacitação é um processo constante, com foco na melhoria dos processos e operações.   |\n" +
                    "|---------------------------------------------------------------------|\n" +
                    "|                                                                     |\n" +
                    "| 7. PROCEDIMENTOS EM CASO DE INCIDENTES OU NÃO CONFORMIDADES:         |\n" +
                    "|                                                                     |\n" +
                    "| - Relatar qualquer incidente imediatamente ao supervisor.          |\n" +
                    "| - Adotar as ações corretivas e preventivas necessárias para garantir que a falha não se repita.   |\n" +
                    "|---------------------------------------------------------------------|\n" +
                    "|                                                                     |\n" +
                    "| 8. NORMAS APLICADAS:                                                |\n" +
                    "|                                                                     |\n" +
                    "| - Normas técnicas nacionais e internacionais relevantes.            |\n" +
                    "| - Recomendações do fabricante para equipamentos industriais.        |\n" +
                    "|---------------------------------------------------------------------|\n";
       
        titulosManuaisCOS[1] = "Procedimentos Operacionais no Setor de Manutenção";


        manualCOSConteudo[1] =
                "_______________________________________________________________________\n" +
                "|-- OBJETIVO: Estabelecer os procedimentos operacionais padrão para    --|\n" +
                "|    o setor de manutenção da WEG, garantindo a eficiência e a segurança --|\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. OBJETIVO DO SETOR DE MANUTENÇÃO:                                 |\n" +
                "|                                                                     |\n" +
                "| - Garantir a operação contínua e segura dos equipamentos e sistemas |\n" +
                "|   da WEG.                                                           |\n" +
                "| - Realizar manutenção preventiva, corretiva e preditiva de acordo com |\n" +
                "|   os planos e cronogramas estabelecidos.                             |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. MANUTENÇÃO PREVENTIVA:                                           |\n" +
                "|                                                                     |\n" +
                "| - Realizar inspeções regulares em todos os equipamentos e sistemas.  |\n" +
                "| - Seguir os cronogramas de manutenção preventiva, conforme o manual  |\n" +
                "|   do fabricante.                                                    |\n" +
                "| - Lubrificação dos componentes conforme especificado no manual de   |\n" +
                "|   operação e manutenção.                                            |\n" +
                "| - Verificar e substituir filtros, correias, rolamentos, etc., conforme|\n" +
                "|   necessário, para evitar falhas futuras.                           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. MANUTENÇÃO CORRETIVA:                                            |\n" +
                "|                                                                     |\n" +
                "| - Quando ocorrer falha ou defeito em algum equipamento, o setor de  |\n" +
                "|   manutenção deverá realizar a análise do problema, elaborar um      |\n" +
                "|   plano de reparo e corrigir a falha com a maior rapidez possível.  |\n" +
                "| - Após a correção, realizar testes para garantir o funcionamento     |\n" +
                "|   correto do equipamento.                                           |\n" +
                "| - Documentar o defeito e o procedimento de reparo, para futuras      |\n" +
                "|   referências e controle.                                           |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. MANUTENÇÃO PREDITIVA:                                            |\n" +
                "|                                                                     |\n" +
                "| - Utilizar técnicas de monitoramento de condição (como termografia,  |\n" +
                "|   vibração e ultrassom) para identificar potenciais falhas antes    |\n" +
                "|   que ocorram.                                                      |\n" +
                "| - Implementar tecnologias de análise preditiva para otimizar as      |\n" +
                "|   intervenções de manutenção e reduzir os tempos de inatividade.     |\n" +
                "| - Manter registros detalhados dos dados coletados para análise e    |\n" +
                "|   previsão de falhas futuras.                                        |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. PROCEDIMENTOS DE SEGURANÇA NA MANUTENÇÃO:                        |\n" +
                "|                                                                     |\n" +
                "| - Desligar e isolar as fontes de energia antes de realizar qualquer  |\n" +
                "|   intervenção em equipamentos.                                      |\n" +
                "| - Utilizar Equipamentos de Proteção Individual (EPIs) adequados para |\n" +
                "|   cada tipo de tarefa, como luvas, óculos, capacetes, protetores    |\n" +
                "|   auditivos e calçados de segurança.                                |\n" +
                "| - Assegurar que todas as ferramentas e dispositivos utilizados estejam|\n" +
                "|   em boas condições de uso e seguiam as normas de segurança.        |\n" +
                "| - Em caso de necessidade de intervenções em áreas de risco, seguir   |\n" +
                "|   as normas específicas de segurança para o trabalho em altura, em   |\n" +
                "|   espaços confinados ou com risco elétrico.                          |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. DOCUMENTAÇÃO E REGISTROS DE MANUTENÇÃO:                          |\n" +
                "|                                                                     |\n" +
                "| - Manter um registro atualizado de todas as atividades de manutenção,|\n" +
                "|   incluindo a data, descrição do serviço realizado e peças trocadas.|\n" +
                "| - Os registros devem ser armazenados de forma organizada e de fácil |\n" +
                "|   acesso, para futuras auditorias ou referência.                     |\n" +
                "| - Elaborar relatórios de falhas, identificando a causa raiz e as     |\n" +
                "|   ações corretivas aplicadas.                                        |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 7. TREINAMENTO E CAPACITAÇÃO:                                        |\n" +
                "|                                                                     |\n" +
                "| - Todos os colaboradores do setor de manutenção devem participar de  |\n" +
                "|   treinamentos periódicos sobre novas tecnologias, procedimentos e   |\n" +
                "|   normas de segurança.                                              |\n" +
                "| - A WEG oferece programas de treinamento contínuo para garantir que  |\n" +
                "|   os colaboradores estejam sempre atualizados com as melhores       |\n" +
                "|   práticas de manutenção e segurança.                               |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 8. PROCEDIMENTOS EM CASO DE INCIDENTES OU ACIDENTES:                 |\n" +
                "|                                                                     |\n" +
                "| - Caso ocorra qualquer tipo de acidente durante a manutenção, o     |\n" +
                "|   colaborador deverá imediatamente acionar o supervisor e a equipe  |\n" +
                "|   de segurança, além de registrar o incidente conforme os          |\n" +
                "|   procedimentos internos.                                           |\n" +
                "| - Realizar uma análise do incidente para identificar suas causas e  |\n" +
                "|   implementar ações corretivas para prevenir ocorrências semelhantes.|\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 9. NORMAS E REGULAMENTOS APLICÁVEIS:                                |\n" +
                "|                                                                     |\n" +
                "| - Seguir todas as normas técnicas nacionais e internacionais relacionadas |\n" +
                "|   à segurança e manutenção de equipamentos industriais.             |\n" +
                "| - Cumprir as orientações do fabricante quanto ao uso e manutenção  |\n" +
                "|   dos equipamentos.                                                 |\n" +
                "|---------------------------------------------------------------------|\n";

        }
    }

