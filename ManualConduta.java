import java.util.Scanner;

public class ManualConduta {

    Scanner leia = new Scanner(System.in);

    String[] manuaisConduta = new String[2];
    String[] titulosManuaisConduta = new String[2];

    String[] manuaisCadastroConduta = new String[2];
    String[] titulosManuaisCadastroConduta = new String[2];

    public ManualConduta() {

        titulosManuaisConduta[0] = "bla bla";

        manuaisConduta[0] = "bla bla";

        titulosManuaisConduta[0] = "bla bla";

        manuaisConduta[0] = "bla bla";

    }

    public void cadastrarManual() {

        int contador = 0;

        	if (contador < 2) {
        		
                 System.out.print("Titulo do Manual de Conduta: ");
                 titulosManuaisCadastroConduta[contador] = leia.nextLine();
                 
                 System.out.println(" ");

                 System.out.println("Conteúdo do Manual de Conduta: ");
                 manuaisCadastroConduta[contador] = leia.nextLine();
                 System.out.println(" ");

                 contador++;
                 
            }

    }

    public void pesquisarManual() {

        System.out.println("--Pesquisar um manual--");
        System.out.println("");

    }

    public void editarManual() {

    }

    public void excluirManual() {

    }

}
