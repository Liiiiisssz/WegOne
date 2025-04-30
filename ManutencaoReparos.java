import java.util.Scanner;

public class ManutencaoReparos {

    Scanner leia = new Scanner(System.in);

    String[] manutencaoReparos = new String[4];
    String[] titulosManutencaoReparos = new String[4];

    int contadorCadastro = 2;

    public ManutencaoReparos(){

        titulosManutencaoReparos[0] = "Manutencao de motores eletricos";

        manutencaoReparos[0] = "_______________________________________________________________________\n" +
                "|-- OBJETIVO: Estabelecer os procedimentos operacionais padrão para    --|\n" +
                "|    o setor de manutenção de motores elétricos, garantindo a eficiência e a segurança --|\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. OBJETIVO DO SETOR DE MANUTENÇÃO:                                 |\n" +
                "|                                                                     |\n" +
                "| - Garantir a operação contínua e segura dos motores elétricos.      |\n" +
                "| - Realizar manutenção preventiva, corretiva e preditiva conforme os |\n" +
                "|   planos e cronogramas estabelecidos.                               |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. MANUTENÇÃO PREVENTIVA:                                           |\n" +
                "|                                                                     |\n" +
                "| - Inspecionar regularmente os motores elétricos quanto a sinais de  |\n" +
                "|   desgaste, vibração excessiva ou aquecimento.                      |\n" +
                "| - Verificar o alinhamento e balanceamento do motor.                 |\n" +
                "| - Realizar lubrificação nos pontos recomendados pelo fabricante.    |\n" +
                "| - Limpar os motores de poeira e resíduos para evitar o superaquecimento. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. MANUTENÇÃO CORRETIVA:                                            |\n" +
                "|                                                                     |\n" +
                "| - Quando ocorrer falha no motor, identificar a causa e realizar os  |\n" +
                "|   reparos necessários com agilidade.                                |\n" +
                "| - Substituir componentes danificados, como rolamentos, escovas e    |\n" +
                "|   estatores.                                                        |\n" +
                "| - Testar o motor após o reparo para garantir seu funcionamento      |\n" +
                "|   correto.                                                          |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. MANUTENÇÃO PREDITIVA:                                            |\n" +
                "|                                                                     |\n" +
                "| - Utilizar tecnologias de monitoramento como termografia e análise  |\n" +
                "|   de vibração para prever falhas no motor antes que ocorram.        |\n" +
                "| - Implementar sensores de temperatura e vibração para um acompanhamento contínuo. |\n" +
                "| - Manter registros detalhados dos dados de monitoramento para otimizar a manutenção. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. PROCEDIMENTOS DE SEGURANÇA NA MANUTENÇÃO:                        |\n" +
                "|                                                                     |\n" +
                "| - Desligar a alimentação elétrica do motor antes de iniciar qualquer|\n" +
                "|   procedimento de manutenção.                                       |\n" +
                "| - Utilizar Equipamentos de Proteção Individual (EPIs) adequados, como |\n" +
                "|   luvas isolantes, capacetes e óculos de segurança.                 |\n" +
                "| - Garantir que os procedimentos de bloqueio e etiquetagem sejam seguidos para segurança. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. DOCUMENTAÇÃO E REGISTROS DE MANUTENÇÃO:                          |\n" +
                "|                                                                     |\n" +
                "| - Registrar todas as atividades de manutenção, incluindo data, tipo |\n" +
                "|   de serviço e peças substituídas.                                  |\n" +
                "| - Manter um histórico dos testes realizados, como medições de corrente|\n" +
                "|   e resistência do motor.                                           |\n" +
                "| - Elaborar relatórios sobre falhas recorrentes e ações corretivas.  |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 7. TREINAMENTO E CAPACITAÇÃO:                                       |\n" +
                "|                                                                     |\n" +
                "| - Promover treinamentos periódicos sobre diagnóstico de falhas e    |\n" +
                "|   técnicas de reparo em motores elétricos.                          |\n" +
                "| - Instruir os colaboradores sobre os riscos elétricos e a segurança no trabalho. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 8. PROCEDIMENTOS EM CASO DE INCIDENTES OU ACIDENTES:                |\n" +
                "|                                                                     |\n" +
                "| - Em caso de acidente, acionar imediatamente o supervisor e a equipe|\n" +
                "|   de segurança.                                                     |\n" +
                "| - Registrar o incidente conforme as normas internas e realizar uma  |\n" +
                "|   análise de causa raiz para prevenir futuros acidentes.            |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 9. NORMAS E REGULAMENTOS APLICÁVEIS:                                |\n" +
                "|                                                                     |\n" +
                "| - Seguir as normas NBR (Normas Brasileiras) para segurança em sistemas elétricos. |\n" +
                "| - Cumprir com as recomendações do fabricante para instalação, operação e manutenção dos motores. |\n" +
                "|---------------------------------------------------------------------|\n";

        titulosManutencaoReparos[1] = "Reparo de transformadores";

        manutencaoReparos[1] = 
                "_______________________________________________________________________\n" +
                "|-- OBJETIVO: Estabelecer os procedimentos operacionais padrão para    --|\n" +
                "|    o setor de reparo de transformadores, garantindo a eficiência e a segurança --|\n" +
                "|_____________________________________________________________________|\n" +
                "|                                                                     |\n" +
                "| 1. OBJETIVO DO SETOR DE REPARO:                                     |\n" +
                "|                                                                     |\n" +
                "| - Garantir a operação contínua e segura dos transformadores.        |\n" +
                "| - Realizar reparos corretivos e preventivos conforme os planos e    |\n" +
                "|   cronogramas estabelecidos.                                        |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 2. REPARO PREVENTIVO:                                               |\n" +
                "|                                                                     |\n" +
                "| - Inspecionar periodicamente os transformadores quanto a sinais de  |\n" +
                "|   aquecimento excessivo, ruídos ou vibrações anormais.              |\n" +
                "| - Verificar o estado dos isolantes e das buchas de entrada e saída. |\n" +
                "| - Realizar testes de resistência de isolamento para detectar falhas |\n" +
                "|   antes que ocorra a falha completa do equipamento.                 |\n" +
                "| - Limpar os transformadores de poeira e contaminantes para evitar   |\n" +
                "|   problemas de sobreaquecimento e falhas elétricas.                 |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 3. REPARO CORRETIVO:                                                |\n" +
                "|                                                                     |\n" +
                "| - Quando ocorrer falha em algum transformador, a equipe de reparo   |\n" +
                "|   deve diagnosticar a causa da falha e realizar a correção necessária. |\n" +
                "| - Substituir componentes danificados, como buchas, transformadores  |\n" +
                "|   de corrente ou de tensão, e sistemas de resfriamento, se aplicável.|\n" +
                "| - Realizar testes após o reparo para assegurar o bom funcionamento  |\n" +
                "|   do transformador.                                                 |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 4. REPARO PREDITIVO:                                                |\n" +
                "|                                                                     |\n" +
                "| - Utilizar tecnologias de monitoramento de condição, como sensores  |\n" +
                "|   de temperatura e umidade, para identificar falhas antes que       |\n" +
                "|   ocorram.                                                          |\n" +
                "| - Realizar medições de corrente e resistência para avaliar a saúde  |\n" +
                "|   do transformador e detectar falhas iminentes.                     |\n" +
                "| - Manter registros detalhados dos dados coletados para otimizar o   |\n" +
                "|   planejamento de manutenção.                                       |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 5. PROCEDIMENTOS DE SEGURANÇA NO REPARO:                            |\n" +
                "|                                                                     |\n" +
                "| - Desligar a alimentação elétrica do transformador antes de iniciar |\n" +
                "|   qualquer intervenção.                                             |\n" +
                "| - Utilizar Equipamentos de Proteção Individual (EPIs) adequados, como |\n" +
                "|   luvas isolantes, capacetes, óculos de segurança e botas de segurança. |\n" +
                "| - Garantir que os procedimentos de bloqueio e etiquetagem sejam seguidos para segurança. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 6. DOCUMENTAÇÃO E REGISTROS DE REPARO:                              |\n" +
                "|                                                                     |\n" +
                "| - Manter registros completos de todos os reparos realizados, com    |\n" +
                "|   descrição detalhada do defeito encontrado e solução aplicada.     |\n" +
                "| - Registrar os testes realizados, como medições de resistência e    |\n" +
                "|   corrente.                                                         |\n" +
                "| - Elaborar relatórios sobre falhas e ações corretivas implementadas.|\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 7. TREINAMENTO E CAPACITAÇÃO:                                       |\n" +
                "|                                                                     |\n" +
                "| - Promover treinamentos sobre as técnicas de diagnóstico e reparo   |\n" +
                "|   em transformadores, incluindo os riscos elétricos envolvidos.     |\n" +
                "| - Instruir os colaboradores sobre as normas de segurança e o uso adequado de ferramentas. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 8. PROCEDIMENTOS EM CASO DE INCIDENTES OU ACIDENTES:                |\n" +
                "|                                                                     |\n" +
                "| - Em caso de acidente, acionar imediatamente a equipe de segurança  |\n" +
                "|   e registrar o incidente conforme as normas internas.              |\n" +
                "| - Realizar uma análise do incidente para identificar suas causas e  |\n" +
                "|   implementar ações corretivas para evitar a repetição do acidente. |\n" +
                "|---------------------------------------------------------------------|\n" +
                "|                                                                     |\n" +
                "| 9. NORMAS E REGULAMENTOS APLICÁVEIS:                                |\n" +
                "|                                                                     |\n" +
                "| - Seguir as normas NBR (Normas Brasileiras) para segurança em sistemas elétricos e transformadores. |\n" +
                "| - Cumprir com as orientações do fabricante para instalação, operação e manutenção dos transformadores. |\n" +
                "|---------------------------------------------------------------------|\n";

    }

    public void cadastrarManual() {

		if (contadorCadastro < 4) {

			System.out.println("Título do Manual de Manutenção e Reparos: ");
			titulosManutencaoReparos[contadorCadastro] = leia.nextLine();

			System.out.println(" ");

			System.out.println("Conteúdo do Manual de Manutenção e Reparos: ");
			manutencaoReparos[contadorCadastro] = leia.nextLine();
			System.out.println(" ");

			contadorCadastro++;

		} else {

			System.out.println("Número máximo de manuais atingido!");

		}

	}

   	public void pesquisaManualTitulo() {

		System.out.println("Digite o título para pesquisa: ");
		String pesquisa = leia.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < titulosManutencaoReparos.length; i++) {

			if (titulosManutencaoReparos[i] != null) {

				if (titulosManutencaoReparos[i].contains(pesquisa)) {

					System.out.println("Manual encontrado: ");
					System.out.println(titulosManutencaoReparos[i]);
					System.out.println(manutencaoReparos[i]);
					encontrado = true;

				}
			}
		}

		if (!encontrado) {

			System.out.println("Nenhum manual encontrado.");

		}
	}

        public void pesquisaManualCodigo() {

		System.out.println("Digite o código a ser pesquisado: ");
		// 0 e 1 para padrão
		// 2 e 3 para cadastro
		int pesquisaCodigo = leia.nextInt();
		
		boolean encontrado = false;

		if (titulosManutencaoReparos[pesquisaCodigo] != null) {

			System.out.println("Manual encontrado: ");
			System.out.println(titulosManutencaoReparos[pesquisaCodigo]);

			System.out.println(manutencaoReparos[pesquisaCodigo]);
			encontrado = true;

		}

		if (!encontrado) {

			System.out.println("Nenhum manual encontrado.");

		}
	}
        public void editarManual() {

		System.out.println("Digite o código do manual para edição: ");
		// 2 e 3 para cadastrados
		int codigo = leia.nextInt();

		int indiceCadastro = codigo;

		if (titulosManutencaoReparos[indiceCadastro] != null) {

			System.out.println("Novo título: ");
			titulosManutencaoReparos[indiceCadastro] = leia.nextLine();
			titulosManutencaoReparos[indiceCadastro] = leia.nextLine();

			System.out.println("Novo conteúdo: ");
			manutencaoReparos[indiceCadastro] = leia.nextLine();

			System.out.println("Manual atualizado com sucesso!");

		} else {

			System.out.println("Manual não encontrado.");

		}

	}

        public void excluirManual() {

		System.out.println("Digite o código do manual para exclusão: ");
		// 2 e 3 para cadastrados
		int codigo = leia.nextInt();

		int indiceCadastro = codigo;

		if (titulosManutencaoReparos[indiceCadastro] != null) {

                        for (int i = codigo; i < 3; i++) {

                        titulosManutencaoReparos[i] = titulosManutencaoReparos[i + 1];
                        manutencaoReparos[i] = manutencaoReparos[i + 1];

                        }

                titulosManutencaoReparos[3] = null;
                manutencaoReparos[3] = null;

                System.out.println("Manual excluído com sucesso!");

                contadorCadastro--;

                System.out.println(" ");
                System.out.println("Enter para voltar ao menu:");
                leia.nextLine();
                leia.nextLine();

		} else {

			System.out.println("Manual já foi excluído ou não foi encontrado.");

		}

	}
}

    




