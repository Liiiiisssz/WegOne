import java.util.Scanner;

public class ProcedimentoSeguranca {

    Scanner leia = new Scanner(System.in);

    String[] procedimentoSeguranca = new String[4];
	String[] titulosProcedimentoSeguranca = new String[4];

    int contadorCadastro = 2;

    public ProcedimentoSeguranca() {

        titulosProcedimentoSeguranca[0] = "Manual de seguranca motor weg W22";

        procedimentoSeguranca[0] = "_______________________________________________________________________\n" +
                                "|--               MANUAL DE SEGURANÇA - MOTOR WEG W22                --|\n" +
                                "|_____________________________________________________________________|\n" +
                                "|-- OBJETIVO: Procedimento seguro para inspeção e manutenção do motor --|\n" +
                                "|   WEG W22, garantindo a integridade do operador e do equipamento.    |\n" +
                                "|_____________________________________________________________________|\n" +
                                "|                                                                     |\n" +
                                "| 1. INSTRUÇÕES GERAIS:                                               |\n" +
                                "|                                                                     |\n" +
                                "| - Somente técnicos qualificados podem intervir no equipamento.      |\n" +
                                "| - Leia atentamente o manual do fabricante antes de qualquer ação.   |\n" +
                                "| - Nunca opere o motor sem as proteções instaladas.                  |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 2. DESLIGAMENTO SEGURO:                                             |\n" +
                                "|                                                                     |\n" +
                                "| - Desligue a alimentação principal do quadro de energia.            |\n" +
                                "| - Aplique bloqueio e etiquetagem (LOTO).                            |\n" +
                                "| - Aguarde 10 minutos para descarregar capacitores.                  |\n" +
                                "| - Verifique ausência de tensão com detector CAT III/IV.             |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 3. EPI OBRIGATÓRIO:                                                 |\n" +
                                "|                                                                     |\n" +
                                "| - Luvas isolantes                                                   |\n" +
                                "| - Óculos de proteção                                                |\n" +
                                "| - Calçado de segurança dielétrico                                   |\n" +
                                "| - Detector de tensão                                                |\n" +
                                "| - Capacete com viseira                                              |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 4. INSPEÇÃO:                                                        |\n" +
                                "|                                                                     |\n" +
                                "| - Verificar temperatura, vibração e ruídos.                         |\n" +
                                "| - Inspecionar bornes, carcaça e ventilação.                         |\n" +
                                "| - Limpar com materiais não inflamáveis.                             |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 5. NORMAS APLICADAS:                                                |\n" +
                                "|                                                                     |\n" +
                                "| - NR-10, NR-12                                                      |\n" +
                                "| - NBR IEC 60034-1                                                   |\n" +
                                "| - Manual Técnico WEG W22                                            |\n" +
                                "|                                                                     |\n" +
                                "|_____________________________________________________________________|\n";

        titulosProcedimentoSeguranca[1] = " ";

        procedimentoSeguranca[1] = " "

    }
    
    public void cadastrarManual() {

        if (contadorCadastro < 4) {

            System.out.println("Titulo do Procedimento de Segurança: ");
            titulosProcedimentoSeguranca[contadorCadastro] = leia.nextLine();

            System.out.println(" ");

            System.out.println("Conteúdo do Procedimento de Segurança: ");
            procedimentoSeguranca[contadorCadastro] = leia.nextLine();
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

        for (int i = 0; i < titulosProcedimentoSeguranca.length; i++) {

            if (titulosProcedimentoSeguranca[i] != null) {

                if (titulosProcedimentoSeguranca[i].contains(pesquisa)) {

                    System.out.println("Manual encontrado: ");
                    System.out.println(titulosProcedimentoSeguranca[i]);
                    System.out.println(procedimentoSeguranca[i]);
                    encontrado = true;

                }
            }
        }

        if (!encontrado) {

            System.out.println("Nenhu manual econtrado.");

        }
    }

    public void pesquisaManualCodigo() {

        System.out.println("Digite o código a ser pesquisado: ");
        int pesquisaCodigo = leia.nextInt();

        boolean encontrado = false;

        if (titulosProcedimentoSeguranca[pesquisaCodigo] != null) {

            System.out.println("Manual encontrado: ");
            System.out.println(titulosProcedimentoSeguranca[pesquisaCodigo]);

            System.out.println(procedimentoSeguranca[pesquisaCodigo]);
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

        if (titulosProcedimentoSeguranca[indiceCadastro] != null) {

            System.out.println("Novo título: ");
            titulosProcedimentoSeguranca[indiceCadastro] = leia.nextLine();
            titulosProcedimentoSeguranca[indiceCadastro] = leia.nextLine();

            System.out.println("Novo conteúdo: ");
            procedimentoSeguranca[indiceCadastro] = leia.nextLine();

            System.out.println("Manual atualizado com sucesso!"); 

        } else {

            System.out.println("Manual não encontrado.");

        }

    }

    public void excluirManual() {

        System.out.println("Digite o código do manual para exclusão: ");
        int codigo = leia.nextInt();

        int indiceCadastro = codigo;

        if (titulosProcedimentoSeguranca[indiceCadastro] != null) {

            titulosProcedimentoSeguranca[indiceCadastro] = null;
            procedimentoSeguranca[indiceCadastro] = null;

            System.out.println("Manual excluído com suceso!");

        } else {

            System.out.println("Manual já foi excluido ou não foi encontrado.");

        }

    }

}