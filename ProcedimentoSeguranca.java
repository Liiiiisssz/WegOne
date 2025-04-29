import java.util.Scanner;

public class ProcedimentoSeguranca {

    Scanner leia = new Scanner(System.in);

    String[] procedimentoSeguranca = new String[4];
	String[] titulosProcedimentoSeguranca = new String[4];

    int contadorCadastro = 2;

    public ProcedimentoSeguranca(){

        titulosProcedimentoSeguranca[0] = " ";

        procedimentoSeguranca[0] = " ";

        titulosProcedimentoSeguranca[1] = " ";

        procedimentoSeguranca[1] = " ";

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
                    System.ut.println(procedimentoSeguranca[i]);
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
            procedimentoSeguranca[indiceCadastro] = leia.nextLine;

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