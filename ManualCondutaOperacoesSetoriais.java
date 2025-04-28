import java.util.Scanner;

public class ManualCondutaOperacoesSetoriais {

    Scanner leia = new Scanner(System.in);

    String[] manuaisPadrao = new String[2];
	String[] titulosManuaisPadrao = new String[2];

	String[] manuaisCadastro = new String[2];
	String[] titulosManuaisCadastro = new String[2];

    int contadorCadastro = 0;

    public ManualCondutaOperacoesSetoriais(){

        titulosManuaisPadrao[0] = " ";

        manuaisPadrao[0] = " ";

        titulosManuaisPadrao[1] = " ";

        manuaisPadrao[1] = " ";

    }

    public void cadastrarManual(){

        if (contadorCadastro < 2) {

			System.out.println("Titulo do Manual de Operação: ");
			titulosManuaisCadastro[contadorCadastro] = leia.nextLine();

			System.out.println(" ");

			System.out.println("Conteúdo do Manual de Operação: ");
			manuaisCadastro[contadorCadastro] = leia.nextLine();
			System.out.println(" ");

			contadorCadastro++;

		} else {

			System.out.println("Número máximo de manuais atingido!");

		}

    }


    
}
