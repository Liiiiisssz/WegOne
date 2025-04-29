import java.util.Scanner;

public class TestesDiagnostico {

    Scanner leia = new Scanner(System.in);

    String[] testeDiagnostico = new String[4];
	String[] titulosTestesDiagnostico = new String[4];

    int contadorCadastro = 2;

    public TestesDiagnostico(){

        titulosTestesDiagnostico[0] = " ";

        testeDiagnostico[0] = " ";

        titulosTestesDiagnostico[1] = " ";

        testeDiagnostico[1] = " ";

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
