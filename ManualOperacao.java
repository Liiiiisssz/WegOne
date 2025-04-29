import java.util.Scanner;

public class ManualOperacao {

	Scanner leia = new Scanner(System.in);

	String[] manualOperacaoConteudo = new String[4];
	String[] titulosManuaisOperacao = new String[4];

	int codigo;
	int contadorCadastro = 2;

	public ManualOperacao() {

		titulosManuaisOperacao[0] = "Manual de operacao de motores eletricos";

		manualOperacaoConteudo[0] = "_______________________________________________________________________\n" +
				"|--              MANUAL DE OPERAÇÃO DE MOTORES ELÉTRICOS            --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- OBJETIVO: Fornecer orientações sobre a instalação, operação e   --|\n" +
				"|   manutenção de motores elétricos, seguindo práticas recomendadas   |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. INSTRUÇÕES GERAIS:                                               |\n" +
				"|                                                                     |\n" +
				"| - Leia completamente o manual antes da instalação.                  |\n" +
				"| - Verifique os dados da placa do motor com a aplicação.             |\n" +
				"| - Apenas profissionais qualificados devem realizar procedimentos.   |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 2. INSTALAÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Local limpo, seco e bem ventilado.                                |\n" +
				"| - Fixação firme para evitar vibração.                               |\n" +
				"| - Ligação elétrica conforme o esquema do motor e normas aplicáveis. |\n" +
				"| - Conexão correta do aterramento.                                   |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 3. PARTIDA:                                                         |\n" +
				"|                                                                     |\n" +
				"| - Utilize sistemas de partida adequados:                            |\n" +
				"|   * Direta                                                          |\n" +
				"|   * Estrela-triângulo                                               |\n" +
				"|   * Soft starter                                                    |\n" +
				"|   * Inversor de frequência                                          |\n" +
				"| - Verifique e ajuste o sentido de rotação.                          |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. OPERAÇÃO:                                                        |\n" +
				"|                                                                     |\n" +
				"| - Monitorar temperatura, ruído e vibração.                          |\n" +
				"| - Não sobrecarregar o motor.                                        |\n" +
				"| - Respeitar os limites especificados pelo fabricante.               |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 5. MANUTENÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Lubrificação conforme tabela do fabricante.                       |\n" +
				"| - Utilizar graxa recomendada.                                       |\n" +
				"| - Manter limpeza das aletas e ventilador.                           |\n" +
				"| - Realizar inspeções nos rolamentos e conexões.                     |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SEGURANÇA:                                                       |\n" +
				"|                                                                     |\n" +
				"| - Desligar a energia antes de intervenções.                         |\n" +
				"| - Utilizar Equipamentos de Proteção Individual (EPI) adequados.     |\n" +
				"| - Seguir normas de segurança elétrica.                              |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SEGURANÇA:                                                       |\n" +
				"|                                                                     |\n" +
				"| - Desligar a energia antes de intervenções.                         |\n" +
				"| - Utilizar Equipamentos de Proteção Individual (EPI) adequados.     |\n" +
				"| - Seguir normas de segurança elétrica.                              |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 7. NORMAS APLICADAS:                                                |\n" +
				"|                                                                     |\n" +
				"| - Normas técnicas nacionais e internacionais relevantes.            |\n" +
				"| - Recomendações do fabricante para motores industriais.             |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n";

		titulosManuaisOperacao[1] = "Manual de operacao de geradores eletricos";

		manualOperacaoConteudo[1] = "_______________________________________________________________________\n" +
				"|--              MANUAL DE OPERAÇÃO DE GERADORES ELÉTRICOS          --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- OBJETIVO: Apresentar as instruções para instalação, operação e    |\n" +
				"|   manutenção segura e eficiente de geradores elétricos.             |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. INSTRUÇÕES GERAIS:                                               |\n" +
				"|                                                                     |\n" +
				"| - Certifique-se de que o gerador é compatível com a aplicação.      |\n" +
				"| - Leia o manual completo antes da instalação.                       |\n" +
				"| - Apenas pessoal treinado deve realizar operações ou manutenção.    |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 2. INSTALAÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Instalar o gerador em local coberto, seco e ventilado.            |\n" +
				"| - Fixar sobre base nivelada e rígida para evitar vibração.          |\n" +
				"| - Verificar alinhamento entre motor primário e o gerador.           |\n" +
				"| - Conectar aterramento de forma adequada.                           |\n" +
				"| - Realizar as conexões elétricas conforme o esquema de ligação.     |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 3. PARTIDA E PARADA:                                                |\n" +
				"|                                                                     |\n" +
				"| - Antes da partida, verificar nível de óleo e combustível           |\n" +
				"|   * (se for acionado por motor a combustão)                         |\n" +
				"| - Verificar se não há vazamentos ou obstruções.                     |\n" +
				"| - Conectar aterramento de forma adequada.                           |\n" +
				"| - Durante a parada, desligar as cargas antes de                     |\n" +
				"|   desligar o grupo gerador.                                         |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. OPERAÇÃO:                                                        |\n" +
				"|                                                                     |\n" +
				"| - Monitorar tensão, corrente, frequência e temperatura.             |\n" +
				"| - Operar o gerador dentro dos limites especificados.                |\n" +
				"| - Evitar sobrecargas ou subfrequências.                             |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 5. MANUTENÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Realizar inspeções periódicas conforme o manual técnico.          |\n" +
				"| - Lubrificar os rolamentos conforme a recomendação do fabricante.   |\n" +
				"| - Evitar sobrecargas ou subfrequências.                             |\n" +
				"| - Verificar o estado das escovas e anéis coletores (se aplicável).  |\n" +
				"| - Limpar regularmente o estator e rotor,                            |\n" +
				"|   mantendo-os livres de poeira e óleo.                              |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SEGURANÇA:                                                       |\n" +
				"|                                                                     |\n" +
				"| - Sempre desligar o gerador antes de qualquer intervenção.          |\n" +
				"| - Usar EPI apropriado para eletricidade.                            |\n" +
				"| - Evitar contato com partes móveis e quentes durante a operação.    |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 7. NORMAS APLICADAS:                                                |\n" +
				"|                                                                     |\n" +
				"| - NBR 10295: Aplicações de geradores síncronos.                     |\n" +
				"| - IEC 60034: Padrões internacionais para máquinas rotativas.        |\n" +
				"| - Instruções da WEG para grupos geradores e geradores industriais.  |\n" +
				"|---------------------------------------------------------------------|\n";

	}

	public void cadastrarManual() {

		if (contadorCadastro < 4) {

			System.out.println("Titulo do Manual de Operação: ");
			titulosManuaisOperacao[contadorCadastro] = leia.nextLine();

			System.out.println(" ");

			System.out.println("Conteúdo do Manual de Operação: ");
			manualOperacaoConteudo[contadorCadastro] = leia.nextLine();
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

		for (int i = 0; i < titulosManuaisOperacao.length; i++) {

			if (titulosManuaisOperacao[i] != null) {

				if (titulosManuaisOperacao[i].contains(pesquisa)) {

					System.out.println("Manual encontrado: ");
					System.out.println(titulosManuaisOperacao[i]);
					System.out.println(manualOperacaoConteudo[i]);
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

		if (titulosManuaisOperacao[pesquisaCodigo] != null) {

			System.out.println("Manual encontrado: ");
			System.out.println(titulosManuaisOperacao[pesquisaCodigo]);

			System.out.println(manualOperacaoConteudo[pesquisaCodigo]);
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

		if (codigo >= 2 && codigo <= 3) {

			int indiceCadastro = codigo - 2;

			if (titulosManuaisOperacao[indiceCadastro] != null) {

				System.out.println("Novo título: ");
				titulosManuaisOperacao[indiceCadastro] = leia.nextLine();

				System.out.println("Novo conteúdo: ");
				manualOperacaoConteudo[indiceCadastro] = leia.nextLine();

				System.out.println("Manual atualizado com suceso!");

			} else {

				System.out.println("Manual não encontrado.");

			}

		} else {

			System.out.println("Manuais fixos no sistemas não podem ser editados, ");
			System.out.println("só é possível editar manuais que foram cadastrados pelo usuário.");

		}
	}

	public void excluirManual() {

		System.out.println("Digite o código do manual para exclusão: ");
		// 2 e 3 para cadastrados
		int codigo = leia.nextInt();

		if (codigo >= 2 && codigo <= 3) {

			int indiceCadastro = codigo - 2;

			if (titulosManuaisOperacao[indiceCadastro] != null) {

				titulosManuaisOperacao[indiceCadastro] = null;
				manualOperacaoConteudo[indiceCadastro] = null;

				System.out.println("Manual exclcuído com sucesso!");

			} else {

				System.out.println("Manual já foi excluido ou não foi encontrado.");

			}

		} else {

			System.out.println("Manuais fixos no sistemas não podem ser excluídos, ");
			System.out.println("só é possível excluir manuais que foram cadastrados pelo usuário.");
			
		}
	}
}