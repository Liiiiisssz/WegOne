import java.util.Scanner;

public class TelaInicial {

    public static String[] Orientacoes_titulos = new String[20];
    public static String[] Orientacoes_tipos = {"Manual Operações", "Procedimento de Segurança", "Manutenção e Reparos",
                                                "Testes e Diagnósticos", "Manual de Conduta e Operações Setoriais"};
   
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ManualOperacao manualOpCadastro = new ManualOperacao();

        int decisaoInicial;
        int tipoOrientacao;
        int tipoPesquisa;
        int orientacaoCodigo;

        String orientacaoTitulo;




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
                System.out.println(" ");
                System.out.println("___________________________________________________");
                System.out.println("|--           CADASTRAR ORIENTAÇÃO              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  1. Manual de Operação👾                     --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  2. Procedimento de Segurança🪪              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  3. Manutenção e Reparos🔧                   --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  4. Testes e Diagnóstico🗣️                  --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|-- 5. Manual de Conduta e Operações Setoriais📒 --|");
                System.out.println("|_________________________________________________|");


                System.out.println(" ");

                System.out.println(" -- Escolha o tipo de orientação a ser cadastrado -- ");
                System.out.print(" --Resposta: ");
                tipoOrientacao = leia.nextInt();

                switch(tipoOrientacao){

                    case 1: //manualOperacao
                        System.out.println(" ");

                        manualOpCadastro.cadastrarManual();

                        break;
                    
                    case 2: //procedimentoSeguranca
                        System.out.println(" ");

                        break;

                    case 3: //manutencaoReparos
                        System.out.println(" ");

                        break;

                    case 4: //testesDiagnostico
                        System.out.println(" ");

                        break;

                    case 5: //manualCondutaOperacoesSetoriais
                        System.out.println(" ");

                        break;

                    default:
                        System.out.println(" ");
                        System.out.println("Opção inválida!");
                        break;

                }

            break;
    

            case 2: //pesquisa
                System.out.println("___________________________________________________");
                System.out.println("|--           PESQUISAR ORIENTAÇÃO              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  1. Manual de Operação👾                     --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  2. Procedimento de Segurança🪪              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  3. Manutenção e Reparos🔧                   --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  4. Testes e Diagnóstico🗣️                  --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|-- 5. Manual de Conduta e Operações Setoriais📒 --|");
                System.out.println("|_________________________________________________|");

                System.out.println(" ");

                System.out.println(" -- Escolha o tipo de orientação a ser cadastrado -- ");
                System.out.print(" --Resposta: ");
                tipoOrientacao = leia.nextInt();

                switch(tipoOrientacao){
                    
                    case 1: //manualOperacao
                        System.out.println("_________________________________");
                        System.out.println("|--  PESQUISAR MANUAL DE OPERAÇÃO 🔎   --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 1. Título 📖               --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 2. Código 🔢               --|");
                        System.out.println("|_______________________________|");
                    
                        System.out.println(" ");
                        System.out.println(" -- Insira o tipo de pesquisa --");
                        System.out.print(" --Resposta: ");
                        tipoPesquisa = leia.nextInt();
            
                        switch(tipoPesquisa){
            
                            case 1:
                                System.out.print("Insira o título da orientação: ");
                                orientacaoTitulo = leia.nextLine();
            
                                break;
            
                            case 2:
                                System.out.print("Insira o código da orientação: ");
                                orientacaoCodigo = leia.nextInt();
            
                                break;
            
                        }

                        break;

                    case 2: //procedimentoSeguranca
                        System.out.println("_________________________________");
                        System.out.println("|--  PESQUISAR PROCEDIMENTO DE SEGURANÇA 🔎   --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 1. Título 📖               --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 2. Código 🔢               --|");
                        System.out.println("|_______________________________|");
                    
                        System.out.println(" ");
                        System.out.println(" -- Insira o tipo de pesquisa --");
                        System.out.print(" --Resposta: ");
                        tipoPesquisa = leia.nextInt();
            
                        switch(tipoPesquisa){
            
                            case 1:
                                System.out.print("Insira o título da orientação: ");
                                orientacaoTitulo = leia.nextLine();
            
                                break;
            
                            case 2:
                                System.out.print("Insira o código da orientação: ");
                                orientacaoCodigo = leia.nextInt();
            
                                break;
            
                        }

                        break;

                    case 3: //manutencaoReparos
                        System.out.println("_________________________________");
                        System.out.println("|--  PESQUISAR MANUTENÇÃO E REPAROS 🔎   --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 1. Título 📖               --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 2. Código 🔢               --|");
                        System.out.println("|_______________________________|");
                    
                        System.out.println(" ");
                        System.out.println(" -- Insira o tipo de pesquisa --");
                        System.out.print(" --Resposta: ");
                        tipoPesquisa = leia.nextInt();
            
                        switch(tipoPesquisa){
            
                            case 1:
                                System.out.print("Insira o título da orientação: ");
                                orientacaoTitulo = leia.nextLine();
            
                                break;
            
                            case 2:
                                System.out.print("Insira o código da orientação: ");
                                orientacaoCodigo = leia.nextInt();
            
                                break;
            
                        }

                        break;

                    case 4: //testesDiagnostico
                        System.out.println("_________________________________");
                        System.out.println("|--  PESQUISAR TESTES E DIAGÓSTICOS 🔎   --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 1. Título 📖               --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 2. Código 🔢               --|");
                        System.out.println("|_______________________________|");
                    
                        System.out.println(" ");
                        System.out.println(" -- Insira o tipo de pesquisa --");
                        System.out.print(" --Resposta: ");
                        tipoPesquisa = leia.nextInt();
            
                        switch(tipoPesquisa){
            
                            case 1:
                                System.out.print("Insira o título da orientação: ");
                                orientacaoTitulo = leia.nextLine();
            
                                break;
            
                            case 2:
                                System.out.print("Insira o código da orientação: ");
                                orientacaoCodigo = leia.nextInt();
            
                                break;
            
                        }

                        break;

                    case 5: //manualCondutaOperacoesSetoriais
                        System.out.println("_________________________________");
                        System.out.println("|--  PESQUISAR MANUAL DE CONDUTA E OPERAÇÕES SETORIAIS 🔎   --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 1. Título 📖               --|");
                        System.out.println("|-------------------------------|");
                        System.out.println("|-- 2. Código 🔢               --|");
                        System.out.println("|_______________________________|");
                    
                        System.out.println(" ");
                        System.out.println(" -- Insira o tipo de pesquisa --");
                        System.out.print(" --Resposta: ");
                        tipoPesquisa = leia.nextInt();
            
                        switch(tipoPesquisa){
            
                            case 1:
                                System.out.print("Insira o título da orientação: ");
                                orientacaoTitulo = leia.nextLine();
            
                                break;
            
                            case 2:
                                System.out.print("Insira o código da orientação: ");
                                orientacaoCodigo = leia.nextInt();
            
                                break;
            
                        }

                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            break;

            
            case 3: //editar
                System.out.println("___________________________________________________");
                System.out.println("|--              EDITAR ORIENTAÇÃO              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  1. Manual de Operação�                     --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  2. Procedimento de Segurança🪪              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  3. Manutenção e Reparos🔧                   --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  4. Testes e Diagnóstico🗣️                  --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|-- 5. Manual de Conduta e Operações Setoriais📒 --|");
                System.out.println("|_________________________________________________|");
                System.out.println(" ");

                System.out.println(" -- Escolha o tipo de orientação a ser editado -- ");
                System.out.print(" --Resposta: ");
                tipoOrientacao = leia.nextInt();

                switch(tipoOrientacao){

                    case 1:

                        break;
                    
                    case 2:

                        break;

                    case 3:
                    
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    default:
                        break;

                }
                break;
            
            case 4: //excluir
                System.out.println("___________________________________________________");
                System.out.println("|--             EXCLUIR ORIENTAÇÃO              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  1. Manual de Operação👾                     --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  2. Procedimento de Segurança🪪              --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  3. Manutenção e Reparos🔧                   --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|--  4. Testes e Diagnóstico🗣️                  --|");
                System.out.println("|-------------------------------------------------|");
                System.out.println("|-- 5. Manual de Conduta e Operações Setoriais📒 --|");
                System.out.println("|_________________________________________________|");
                System.out.println(" ");

                System.out.println(" -- Escolha o tipo de orientação a ser excluido -- ");
                System.out.print(" --Resposta: ");
                tipoOrientacao = leia.nextInt();

                switch(tipoOrientacao){

                    case 1:

                        break;
                    
                    case 2:

                        break;

                    case 3:
                    
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    default:
                        System.out.println("");
                        break;

                }
                break;

            case 5: //encerrar
                System.out.println("-- Encerrando Sistema ... 👾 --");
                break;

            default:
                System.out.println("-- ❌ Opção Inválida ❌ --");

            } 

        leia.close();

    }
}