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
            System.out.print("  --Resposta: ");
            decisaoInicial = leia.nextInt();

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

                    System.out.println(" -- Escolha o tipo de orientação a ser cadastrado -- ");
                    System.out.print(" --Resposta: ");
                    tipoOrientacao = leia.nextInt();

                    switch (tipoOrientacao) {

                        case 1: //manualOperação
                            System.out.println(" ");
                            manualOperacao.cadastrarManual();
                            break;

                        case 2: //procedimentoSeguranca
                            System.out.println(" ");
                            procedimentoSeguranca.cadastrarManual();
                            break;

                        case 3: //manutencaoReparos
                            System.out.println(" ");
                            manutencaoReparos.cadastrarManual();
                            break;

                        case 4: //testesDiagnostico
                            System.out.println(" ");
                            testesDiagnostico.cadastrarManual();
                            break;

                        case 5: //manualCondutaOperacoesSetoriais
                            System.out.println(" ");
                            manualCondutaOpSet.cadastrarManual();
                            break;

                        case 6: //VoltarInicio
                            System.out.println(" ");
                            break;


                        default:
                            System.out.println(" ");
                            System.out.println("--  ✕ Opção inválida! ✕  --");
                            break;
                        }

                break;
        

                case 2: //pesquisa
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

                    System.out.println(" -- Escolha o tipo de orientação a ser pesquisado -- ");
                    System.out.print(" --Resposta: ");
                    tipoOrientacao = leia.nextInt();

                    switch(tipoOrientacao){
                        
                        case 1: //manualOperacao
                            System.out.println("_________________________________________");
                            System.out.println("|--  PESQUISAR MANUAL DE OPERAÇÃO     --|");
                            System.out.println("|---------------------------------------|");
                            System.out.println("|-- 1. Título                         --|");
                            System.out.println("|---------------------------------------|");
                            System.out.println("|-- 2. Código                         --|");
                            System.out.println("|_______________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(" -- Insira o tipo de pesquisa --");
                            System.out.print(" --Resposta: ");
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    manualOperacao.pesquisaManualTitulo();
                                    break;
                
                                case 2:
                                    manualOperacao.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 2: //procedimentoSeguranca
                            System.out.println("____________________________________________");
                            System.out.println("|--  PESQUISAR PROCEDIMENTO DE SEGURANÇA --|");
                            System.out.println("|------------------------------------------|");
                            System.out.println("|-- 1. Título                            --|");
                            System.out.println("|------------------------------------------|");
                            System.out.println("|-- 2. Código                            --|");
                            System.out.println("|__________________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(" -- Insira o tipo de pesquisa --");
                            System.out.print(" --Resposta: ");
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    procedimentoSeguranca.pesquisarManualTitulo();
                                    break;
                
                                case 2:
                                    procedimentoSeguranca.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 3: //manutencaoReparos
                            System.out.println("_______________________________________");
                            System.out.println("|--  PESQUISAR MANUTENÇÃO E REPAROS --|");
                            System.out.println("|-------------------------------------|");
                            System.out.println("|-- 1. Título                       --|");
                            System.out.println("|-------------------------------------|");
                            System.out.println("|-- 2. Código                       --|");
                            System.out.println("|_____________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(" -- Insira o tipo de pesquisa --");
                            System.out.print(" --Resposta: ");
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    manutencaoReparos.pesquisaManualTitulo();
                                    break;
                
                                case 2:
                                    manutencaoReparos.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 4: //testesDiagnostico
                            System.out.println("_______________________________________");
                            System.out.println("|--  PESQUISAR TESTES E DIAGÓSTICOS --|");
                            System.out.println("|-------------------------------------|");
                            System.out.println("|-- 1. Título                       --|");
                            System.out.println("|-------------------------------------|");
                            System.out.println("|-- 2. Código                       --|");
                            System.out.println("|_____________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(" -- Insira o tipo de pesquisa --");
                            System.out.print(" --Resposta: ");
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    testesDiagnostico.pesquisarManualTitulo();
                                    break;
                
                                case 2:
                                    testesDiagnostico.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 5: //manualCondutaOperacoesSetoriais
                            System.out.println("____________________________________");
                            System.out.println("|--  PESQUISAR MANUAL DE CONDUTA --|");
                            System.out.println("|--  E OPERAÇÕES SETORIAIS       --|");
                            System.out.println("|----------------------------------|");
                            System.out.println("|-- 1. Título                    --|");
                            System.out.println("|----------------------------------|");
                            System.out.println("|-- 2. Código                    --|");
                            System.out.println("|__________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(" -- Insira o tipo de pesquisa --");
                            System.out.print(" --Resposta: ");
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    manualCondutaOpSet.pesquisaManualTitulo();
                                    break;
                
                                case 2:
                                    manualCondutaOpSet.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 6: //VoltarInicio
                            System.out.println(" ");
                            break;

                        default://NenhumaOpçãoAcima
                            System.out.println("-- ✕ Opção inválida! ✕ --");
                            break;

                    }

                    break;
                        
                case 3: //editar
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

                    System.out.println(" -- Escolha o tipo de orientação a ser editado -- ");
                    System.out.print(" --Resposta: ");
                    tipoOrientacao = leia.nextInt();

                    switch(tipoOrientacao){

                        case 1: //manualOperacao
                            manualOperacao.editarManual();
                            break;
                        
                        case 2: //procedimentoSeguranca
                            procedimentoSeguranca.editarManual();
                            break;

                        case 3: //manutencaoReparos
                            manutencaoReparos.editarManual();
                            break;

                        case 4: //testesDiagnostico
                            testesDiagnostico.editarManual();
                            break;

                        case 5: //manualCondutaOperacoesSetoriais
                            manualCondutaOpSet.editarManual();
                            break;
                        
                        case 6: //VoltarInicio
                            System.out.println(" ");
                            break;

                        default://NenhumaOpçãoAcima
                            System.out.println("-- ✕ Opção inválida! ✕ --");
                            break;

                    }

                    break;
                
                case 4: //excluir
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

                    System.out.println(" -- Escolha o tipo de orientação a ser excluido -- ");
                    System.out.print(" --Resposta: ");
                    tipoOrientacao = leia.nextInt();

                    switch(tipoOrientacao){

                        case 1: //manualOperacao
                            manualOperacao.excluirManual();
                            break;
                        
                        case 2: //procedimentoSeguranca
                            procedimentoSeguranca.excluirManual();
                            break;

                        case 3: //manutencaoReparos
                            manutencaoReparos.excluirManual();
                            break;

                        case 4: //testesDiagnostico
                            testesDiagnostico.excluirManual();
                            break;

                        case 5: //manualCondutaOperacoesSetoriais
                            manualCondutaOpSet.excluirManual();
                            break;

                        case 6: //VoltarInicio
                            System.out.println(" ");
                            break;

                        default://NenhumaOpçãoAcima
                            System.out.println("-- ✕ Opção inválida! ✕ --");
                            break;

                    }

                    break;

                case 5: //encerrar
                    System.out.println("--  Encerrando Sistema  --");
                    break;

                default: //Nenhuma das Opções
                    System.out.println("-- ✕  Opção Inválida ✕  --");
                    break;

                }

            } while (decisaoInicial != 5);
            
        leia.close();    
    }
} 