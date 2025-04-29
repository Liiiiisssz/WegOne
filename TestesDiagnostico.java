import java.util.Scanner;

public class TestesDiagnostico {

    Scanner leia = new Scanner(System.in);

    String[] testeDiagnostico = new String[4];
	String[] titulosTestesDiagnostico = new String[4];

    int contadorCadastro = 2;

    public TestesDiagnostico(){

        titulosTestesDiagnostico[0] = "Teste de diagnostico para inversores de frequencia ";

        testeDiagnostico[0] = 

                "_______________________________________________________________________\n" +
				"|--        TESTE DE DIAGNÓSTICO PARA INVERSORES DE FREQUÊNCIA       --|\n" +
				"|_____________________________________________________________________|\n" +
			    "|-- OBJETIVO DO TESTE:                                              --|\n" +
				"| - Verificar o funcionamento correto do inversor de frequência WEG.  |\n" +
				"| - Diagnosticar falhas no sistema, como problemas de controle e      |\n" +
				"|   falhas nos componentes de potência ou no motor.                   |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. PREPARAÇÃO PARA O TESTE:                                         |\n" +
				"|                                                                     |\n" +
				"| - Desligue a alimentação do inversor e aguarde a dissipação da      |\n" +
				"|   carga residual.                                                   |\n" +
				"| - Verifique o inversor visualmente para danos físicos.              |\n" +
				"| - Certifique-se de que o motor está conectado corretamente.         |\n" + 
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
				"|                                                                     |\n" +                                                             
				"| 2. TESTE DE ISOLAMENTO:                                             |\n" +
				"|                                                                     |\n" +
				"| - Utilize um megômetro para testar o isolamento do motor.           |\n" +
				"| - Certifique-se de que a resistência de isolamento esteja dentro    |\n" +
				"|   das especificações.                                               |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
                "| 3. TESTE DE CONTROLE:                                               |\n" +
				"|                                                                     |\n" +
				"| - Conecte-se ao inversor usando o software de diagnóstico WEG.      |\n" +
				"| - Verifique as entradas e saídas de controle.                       |\n" +
				"| - Teste as frequências de saída.                                    |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
				"| 4. DIAGNÓSTICO DE FALHAS DE HARDWARE:                               |\n" +
				"|                                                                     |\n" +
				"| - Verifique os módulos de potência e procure por falhas.            |\n" +
				"| - Verifique os códigos de erro no display do inversor.              |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
				"| 5. TESTE DE MOTOR:                                                  |\n" +
				"|                                                                     |\n" +
				"| - Desconecte o motor e meça a resistência do enrolamento.           |\n" +
				"| - Compare os valores com as especificações do motor.                |\n" +
				"|                                                                     |\n" +
                "|---------------------------------------------------------------------|\n"+
                "|                                                                     |\n" +
				"| 6. RESULTADO E AÇÃO CORRETIVA:                                      |\n" +
				"|                                                                     |\n" +
				"| - Caso falhas sejam identificadas, consulte as instruções de        |\n" +
				"|   manutenção para ação corretiva.                                   |\n" +
				"|_____________________________________________________________________|\n" ;


      titulosTestesDiagnostico[1] =  " "
      testeDiagnostico[1] = " "

            

    }
    
    public void cadastrarManual() {

        if (contadorCadastro < 4) {

            System.out.println("Titulo do Teste Diagnóstico: ");
            titulosTestesDiagnostico[contadorCadastro] = leia.nextLine();

            System.out.println(" ");

            System.out.println("Conteúdo do Teste Diagnóstico: ");
            testeDiagnostico[contadorCadastro] = leia.nextLine();
            System.out.println(" ");

            contadorCadastro++;

        } else {

            System.out.println("Número máximo de procedimentos atingidos!");

        }

    }

     public void pesquisarManualTitulo() {

        System.out.println("Digite o título para pesquisa: ");
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < titulosTestesDiagnostico.length; i++) {

            if (titulosTestesDiagnostico[i] != null) {

                if (titulosTestesDiagnostico[i].contains(pesquisa)) {

                    System.out.println("Manual encontrado: ");
                    System.out.println(titulosTestesDiagnostico[i]);
                    System.out.println(testeDiagnostico[i]);
                    encontrado = true;

                }
            }
        }

        if (!encontrado) {

            System.out.println("Nenhum manual econtrado.");

        }
    }

    public void pesquisaManualCodigo() {

        System.out.println("Digite o código a ser pesquisado: ");
        int pesquisaCodigo = leia.nextInt();

        boolean encontrado = false;

        if (titulosTestesDiagnostico[pesquisaCodigo] != null) {

            System.out.println("Manual encontrado: ");
            System.out.println(titulosTestesDiagnostico[pesquisaCodigo]);

            System.out.println(testeDiagnostico[pesquisaCodigo]);
            encontrado = true;

        }

        if (!encontrado) {

            System.out.println("Nenhum manual encontrado.");

        }
    }

    public void editarManual() {

        System.out.println("Digite o código do manual para edição: ");
        int codigo = leia.nextInt();

        int indiceCadastro = codigo;

        if (titulosTestesDiagnostico[indiceCadastro] != null) {

            System.out.println("Novo título: ");
            titulosTestesDiagnostico[indiceCadastro] = leia.nextLine();
            titulosTestesDiagnostico[indiceCadastro] = leia.nextLine();

            System.out.println("Novo conteúdo: ");
            testeDiagnostico[indiceCadastro] = leia.nextLine();

            System.out.println("Manual atualizado com sucesso!"); 

        } else {

            System.out.println("Manual não encontrado.");

        }

    }

     public void excluirManual() {

        System.out.println("Digite o código do manual para exclusão: ");
        int codigo = leia.nextInt();

        int indiceCadastro = codigo;

        if (titulosTestesDiagnostico[indiceCadastro] != null) {

            titulosTestesDiagnostico[indiceCadastro] = null;
            testeDiagnostico[indiceCadastro] = null;

            System.out.println("Manual excluído com suceso!");

        } else {

            System.out.println("Manual já foi excluido ou não foi encontrado.");

        }

    }
}
