import java.util.Scanner;


public class TelaInicial {


    public static String[] Orientacoes_titulos = new String[20];
    public static String[] Orientacoes_tipos = {"Manual Operações", "Procedimento de Segurança", "Manutenção e Reparos",
                                                "Testes e Diagnósticos", "Manual de Conduta e Operações Setoriais"};
   
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
       
        int decisaoInicial;

        System.out.println(" ");

        System.out.println("                ▄█▄▄▄█▄       ");
        System.out.println("         ▄▀    ▄|─▄─▄─|▄    ▀▄");
        System.out.println("         █▄▄█  ▀|─▀─▀─|▀  █▄▄█");
        System.out.println("          ||    ▀▀███▀▀    || ");
        System.out.println("         ████ ▄█████████▄ ████");

        System.out.println(" ");


        System.out.println("    -- Bem vindo(a) ao Sistema de --");
        System.out.println("    --Cadastro de Orientações WEG!--");

        System.out.println(" ");
       
        System.out.println("  ____________________________________");
        System.out.println("  |-- 1.  Cadastrar Orientação ✒️  --|");
        System.out.println("  |----------------------------------|");
        System.out.println("  |-- 2.  Pesquisar Orientação 🔎   --|");
        System.out.println("  |----------------------------------|");
        System.out.println("  |-- 3.  Editar Orientação 💻      --|");
        System.out.println("  |----------------------------------|");
        System.out.println("  |-- 4.  Excluir Orientação ❌       |");
        System.out.println("  |----------------------------------|");
        System.out.println("  |-- 5. ❌ ENCERRAR PROGRAMA ❌     --|");
        System.out.println("  |__________________________________|");
      

       
        System.out.println(" ");


        System.out.println("  --O que deseja realizar?-- ");
        System.out.print("  --Resposta: ");
        decisaoInicial = leia.nextInt();
       
        System.out.println(" ");
       
        switch(decisaoInicial) {
       
        case 1:
            System.out.println("CADASTRAR ORIENTAÇÃO");


            break;
       
        case 2:
            System.out.println("Pesquisar Orientação");

            break;
           
        case 3:
            System.out.println("Editar Orientação");


            break;
           
        case 4:
            System.out.println("Excluir Orientação");


            break;
        }
    }
}