import java.util.Scanner;

public class TelaInicial {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ManualCondutaOperacoesSetoriais manualCondutaOpSet = new ManualCondutaOperacoesSetoriais();
        ManualOperacao manualOperacao = new ManualOperacao();
        ManutencaoReparos manutencaoReparos = new ManutencaoReparos();
        ProcedimentoSeguranca procedimentoSeguranca = new ProcedimentoSeguranca();
        TestesDiagnostico testesDiagnostico = new TestesDiagnostico();

        int decisaoInicial;
        int tipoOrientacao;
        int tipoPesquisa;

        do {

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
            System.out.println("  |-- 1.  Cadastrar Orientação     --|");
            System.out.println("  |----------------------------------|");
            System.out.println("  |-- 2.  Pesquisar Orientação     --|");
            System.out.println("  |----------------------------------|");
            System.out.println("  |-- 3.  Editar Orientação        --|");
            System.out.println("  |----------------------------------|");
            System.out.println("  |-- 4.  Excluir Orientação         |");
            System.out.println("  |----------------------------------|");
            System.out.println("  |-- 5. ✕ ENCERRAR PROGRAMA ✕    --|");
            System.out.println("  |__________________________________|");

            System.out.println(" ");

            System.out.println("  --O que deseja realizar?-- ");
            decisaoInicial = lerNumero(leia, "  --Resposta: ");

            System.out.println(" ");

            switch (decisaoInicial) {

                case 1:

                    System.out.println("___________________________________________________");
                    System.out.println("|--           CADASTRAR ORIENTAÇÃO              --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  1. Manual de Operação                      --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  2. Procedimento de Segurança               --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  3. Manutenção e Reparos                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  4. Testes e Diagnóstico                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-- 5. Manual de Conduta e Operações Setoriais  --|");
                    System.out.println("|_________________________________________________|");
                    System.out.println("|-- 6.          VOLTAR AO INÍCIO ⌂              --|");
                    System.out.println("|_________________________________________________|");

                    System.out.println(" ");

                    tipoOrientacao = lerNumero(leia, " -- Escolha o tipo de orientação a ser cadastrado -- ");

                    switch (tipoOrientacao) {

                        case 1: // manualOperação
                            System.out.println(" ");
                            manualOperacao.cadastrarManual();
                            break;

                        case 2: // procedimentoSeguranca
                            System.out.println(" ");
                            procedimentoSeguranca.cadastrarManual();
                            break;

                        case 3: // manutencaoReparos
                            System.out.println(" ");
                            manutencaoReparos.cadastrarManual();
                            break;

                        case 4: // testesDiagnostico
                            System.out.println(" ");
                            testesDiagnostico.cadastrarManual();
                            break;

                        case 5: // manualCondutaOperacoesSetoriais
                            System.out.println(" ");
                            manualCondutaOpSet.cadastrarManual();
                            break;

                        case 6: // VoltarInicio
                            System.out.println(" ");
                            break;

                        default:
                            System.out.println(" ");
                            System.out.println("--  ✕ Opção inválida! ✕  --");
                            break;
                    }

                    break;

                case 2: // pesquisa
                    System.out.println("___________________________________________________");
                    System.out.println("|--           PESQUISAR ORIENTAÇÃO              --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  1. Manual de Operação                      --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  2. Procedimento de Segurança               --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  3. Manutenção e Reparos                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  4. Testes e Diagnóstico                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-- 5. Manual de Conduta e Operações Setoriais  --|");
                    System.out.println("|_________________________________________________|");
                    System.out.println("|-- 6.          VOLTAR AO INÍCIO ⌂              --|");
                    System.out.println("|_________________________________________________|");
                    System.out.println(" ");

                    tipoOrientacao = lerNumero(leia, " -- Escolha o tipo de orientação a ser pesquisado -- ");

                    break;

                case 3: // editar
                    System.out.println("___________________________________________________");
                    System.out.println("|--              EDITAR ORIENTAÇÃO              --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  1. Manual de Operação                      --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  2. Procedimento de Segurança               --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  3. Manutenção e Reparos                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  4. Testes e Diagnóstico                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-- 5. Manual de Conduta e Operações Setoriais  --|");
                    System.out.println("|_________________________________________________|");
                    System.out.println("|-- 6.          VOLTAR AO INÍCIO ⌂              --|");
                    System.out.println("|_________________________________________________|");
                    System.out.println(" ");

                    tipoOrientacao = lerNumero(leia, " -- Escolha o tipo de orientação a ser editado -- ");

                    break;

                case 4: // excluir
                    System.out.println("___________________________________________________");
                    System.out.println("|--             EXCLUIR ORIENTAÇÃO              --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  1. Manual de Operação                      --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  2. Procedimento de Segurança               --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  3. Manutenção e Reparos                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--  4. Testes e Diagnóstico                    --|");
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-- 5. Manual de Conduta e Operações Setoriais  --|");
                    System.out.println("|_________________________________________________|");
                    System.out.println("|-- 6.          VOLTAR AO INÍCIO ⌂              --|");
                    System.out.println("|_________________________________________________|");
                    System.out.println(" ");

                    tipoOrientacao = lerNumero(leia, " -- Escolha o tipo de orientação a ser excluído -- ");

                    break;

                case 5:
                    System.out.println("--  Encerrando Sistema  --");
                    break;

                default:
                    System.out.println("-- ✕  Opção Inválida ✕  --");
                    break;
            }
        } while (decisaoInicial != 5);

        leia.close();
    }

    public static int lerNumero(Scanner leia, String mensagem) {

        int numero = -1;
        boolean entradaValida = false;

        while (!entradaValida) {

            System.out.print(mensagem);

            try {

                numero = leia.nextInt();
                leia.nextLine();

                entradaValida = true;

            } catch (Exception e) {

                System.out.println(" -- Entrada inválida! Por favor, insira um número válido. --");
                leia.nextLine();

            }
        }

        return numero;
    }
}
