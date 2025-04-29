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

}
