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

}
