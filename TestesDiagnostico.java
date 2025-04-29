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
