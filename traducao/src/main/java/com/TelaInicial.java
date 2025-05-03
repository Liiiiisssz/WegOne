package com;
import java.io.IOException;
import java.util.Scanner;

public class TelaInicial {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Traducoes tradutor;

        String arquivo;

        int idioma;
        int decisaoInicial;
        int tipoOrientacao;
        int tipoPesquisa;

        System.out.println("Selecione o idioma:");
        System.out.println("1. pt - BR");
        System.out.println("2. en - US");
        System.out.println("3. de - DE");
        idioma = leia.nextInt();

        switch (idioma) {
            
            case 1:
                arquivo = "pt.json";
                break;

            case 2:
                arquivo = "en.json";
                break;

            case 3:
                arquivo = "de.json";
                break;

            default:
                System.out.println("Idioma inválido! Usando português por padrão.");
                arquivo = "pt.json";

        }

        try {

            tradutor = new Traducoes(arquivo);

            ManualCondutaOperacoesSetoriais manualCondutaOpSet = new ManualCondutaOperacoesSetoriais(tradutor);
            ManualOperacao manualOperacao = new ManualOperacao(tradutor);
            ManutencaoReparos manutencaoReparos = new ManutencaoReparos(tradutor);
            ProcedimentoSeguranca procedimentoSeguranca = new ProcedimentoSeguranca(tradutor);
            TestesDiagnostico testesDiagnostico = new TestesDiagnostico(tradutor);

            do{
                System.out.println(" ");

                System.out.println("                ▄█▄▄▄█▄       ");
                System.out.println("         ▄▀    ▄|─▄─▄─|▄    ▀▄");
                System.out.println("         █▄▄█  ▀|─▀─▀─|▀  █▄▄█");
                System.out.println("          ||    ▀▀███▀▀    || ");
                System.out.println("         ████ ▄█████████▄ ████");

                System.out.println(" ");

                System.out.println(tradutor.get("welcome"));

                System.out.println(" ");
                System.out.println("  ____________________________________");
                System.out.println(tradutor.get("menu1"));
                System.out.println("  |----------------------------------|");
                System.out.println(tradutor.get("menu2"));
                System.out.println("  |----------------------------------|");
                System.out.println(tradutor.get("menu3"));
                System.out.println("  |----------------------------------|");
                System.out.println(tradutor.get("menu4"));
                System.out.println("  |----------------------------------|");
                System.out.println(tradutor.get("menu5"));
                System.out.println("  |__________________________________|");

                System.out.println(" ");

                System.out.println(tradutor.get("realizar"));
                System.out.println(tradutor.get("resposta"));
                decisaoInicial = leia.nextInt();

                System.out.println(" ");

                switch (decisaoInicial) {

                    case 1:

                        System.out.println("___________________________________________________");
                        System.out.println(tradutor.get("cadastro"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualOp"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("procedSeg"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manutenRep"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("testDiag"));
                        System.out.println("|-------------------------------------------------|");
                        System.out.println(tradutor.get("manualCOS"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(tradutor.get("return"));
                        System.out.println("|_________________________________________________|");
                        System.out.println(" ");

                        System.out.println(tradutor.get("chooseCad"));
                        System.out.println(tradutor.get("resposta"));
                        tipoOrientacao = leia.nextInt();

                        if(arquivo.equals("pt.json")){ //cadastro PT

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
                                    System.out.println(tradutor.get("invalid"));
                                    break;
                            }

                        } else if (arquivo.equals("en.json")){ //cadastro INGLES

                            switch (tipoOrientacao) {

                                case 1: //manualOperação
                                    System.out.println(" ");
                                    manualOperacao.cadastrarManualEN();
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
                                    System.out.println(tradutor.get("invalid"));
                                    break;
                            }

                        } else if (arquivo.equals("de.json")){ //cadastro ALEMÃO

                            switch (tipoOrientacao) {

                                case 1: //manualOperação
                                    System.out.println(" ");
                                    manualOperacao.cadastrarManualDE();
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
                                    System.out.println(tradutor.get("invalid"));
                                    break;
                            }

                        }
                        

                break;

                case 2: //pesquisa
                    System.out.println("___________________________________________________");
                    System.out.println(tradutor.get("pesquisa"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manualOp"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("procedSeg"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manutenRep"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("testDiag"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manualCOS"));
                    System.out.println("|_________________________________________________|");
                    System.out.println(tradutor.get("return"));
                    System.out.println("|_________________________________________________|");
                    System.out.println(" ");

                    System.out.println(tradutor.get("choosePesq"));
                    System.out.println(tradutor.get("resposta"));
                    tipoOrientacao = leia.nextInt();

                    switch(tipoOrientacao){
                        
                        case 1: //manualOperacao
                            System.out.println("_________________________________________");
                            System.out.println(tradutor.get("pesqManualOp"));
                            System.out.println("|---------------------------------------|");
                            System.out.println(tradutor.get("pesqTitulo"));
                            System.out.println("|---------------------------------------|");
                            System.out.println(tradutor.get("pesqCodigo"));
                            System.out.println("|_______________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(tradutor.get("chooseTipoPesq"));
                            System.out.println(tradutor.get("resposta"));
                            tipoPesquisa = leia.nextInt();
                
                            if(arquivo.equals("pt.json")){ //PT

                                switch(tipoPesquisa){
                
                                case 1:
                                    System.out.println(" ");
                                    manualOperacao.pesquisaManualTitulo();
                                    break;
                
                                case 2:
                                    System.out.println(" ");
                                    manualOperacao.pesquisaManualCodigo();
                                    break;
                
                                }

                            } else if (arquivo.equals("en.json")){ //INGLES

                                switch(tipoPesquisa){
                
                                    case 1:
                                        System.out.println(" ");
                                        manualOperacao.pesquisaManualTituloEN();
                                        break;
                    
                                    case 2:
                                        System.out.println(" ");
                                        manualOperacao.pesquisaManualCodigoEN();
                                        break;
                    
                                }

                            } else if (arquivo.equals("de.json")){ //ALEMÃO

                                switch(tipoPesquisa){
                
                                    case 1:
                                        System.out.println(" ");
                                        manualOperacao.pesquisaManualTituloDE();
                                        break;
                    
                                    case 2:
                                        System.out.println(" ");
                                        manualOperacao.pesquisaManualCodigoDE();
                                        break;
                    
                                }

                            }
                            

                            break;

                        case 2: //procedimentoSeguranca
                            System.out.println("____________________________________________");
                            System.out.println(tradutor.get("pesqProcedSeg"));
                            System.out.println("|------------------------------------------|");
                            System.out.println(tradutor.get("pesqTitulo"));
                            System.out.println("|---------------------------------------|");
                            System.out.println(tradutor.get("pesqCodigo"));
                            System.out.println("|__________________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(tradutor.get("chooseTipoPesq"));
                            System.out.println(tradutor.get("resposta"));
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    System.out.println(" ");
                                    procedimentoSeguranca.pesquisarManualTitulo();
                                    break;
                
                                case 2:
                                    System.out.println(" ");
                                    procedimentoSeguranca.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 3: //manutencaoReparos
                            System.out.println("_______________________________________");
                            System.out.println(tradutor.get("pesqManutenRep"));
                            System.out.println("|-------------------------------------|");
                            System.out.println(tradutor.get("pesqTitulo"));
                            System.out.println("|---------------------------------------|");
                            System.out.println(tradutor.get("pesqCodigo"));
                            System.out.println("|_____________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(tradutor.get("chooseTipoPesq"));
                            System.out.println(tradutor.get("resposta"));
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    System.out.println(" ");
                                    manutencaoReparos.pesquisaManualTitulo();
                                    break;
                
                                case 2:
                                    System.out.println(" ");
                                    manutencaoReparos.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 4: //testesDiagnostico
                            System.out.println("_______________________________________");
                            System.out.println(tradutor.get("pesqTestDiag"));
                            System.out.println("|-------------------------------------|");
                            System.out.println(tradutor.get("pesqTitulo"));
                            System.out.println("|---------------------------------------|");
                            System.out.println(tradutor.get("pesqCodigo"));
                            System.out.println("|_____________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(tradutor.get("chooseTipoPesq"));
                            System.out.println(tradutor.get("resposta"));
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    System.out.println(" ");
                                    testesDiagnostico.pesquisarManualTitulo();
                                    break;
                
                                case 2:
                                    System.out.println(" ");
                                    testesDiagnostico.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 5: //manualCondutaOperacoesSetoriais
                            System.out.println("____________________________________");
                            System.out.println(tradutor.get("pesqManualCOS1"));
                            System.out.println(tradutor.get("pesqManualCOS2"));
                            System.out.println("|----------------------------------|");
                            System.out.println(tradutor.get("pesqTitulo"));
                            System.out.println("|---------------------------------------|");
                            System.out.println(tradutor.get("pesqCodigo"));
                            System.out.println("|__________________________________|");
                        
                            System.out.println(" ");
                            System.out.println(tradutor.get("chooseTipoPesq"));
                            System.out.println(tradutor.get("resposta"));
                            tipoPesquisa = leia.nextInt();
                
                            switch(tipoPesquisa){
                
                                case 1:
                                    System.out.println(" ");
                                    manualCondutaOpSet.pesquisaManualTitulo();
                                    break;
                
                                case 2:
                                    System.out.println(" ");
                                    manualCondutaOpSet.pesquisaManualCodigo();
                                    break;
                
                            }

                            break;

                        case 6: //VoltarInicio
                            System.out.println(" ");
                            break;

                        default://NenhumaOpçãoAcima
                            System.out.println(tradutor.get("invalid"));
                            break;

                    }

                    break;
                        
                case 3: //editar
                    System.out.println("___________________________________________________");
                    System.out.println(tradutor.get("edicao"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manualOp"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("procedSeg"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manutenRep"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("testDiag"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manualCOS"));
                    System.out.println("|_________________________________________________|");
                    System.out.println(tradutor.get("return"));
                    System.out.println("|_________________________________________________|");
                    System.out.println(" ");

                    System.out.println(tradutor.get("chooseEdit"));
                    System.out.print(" --Resposta: ");
                    tipoOrientacao = leia.nextInt();

                    switch(tipoOrientacao){

                        case 1: //manualOperacao
                            System.out.println(" ");
                            manualOperacao.editarManual();
                            break;
                        
                        case 2: //procedimentoSeguranca
                            System.out.println(" ");
                            procedimentoSeguranca.editarManual();
                            break;

                        case 3: //manutencaoReparos
                            System.out.println(" ");
                            manutencaoReparos.editarManual();
                            break;

                        case 4: //testesDiagnostico
                            System.out.println(" ");
                            testesDiagnostico.editarManual();
                            break;

                        case 5: //manualCondutaOperacoesSetoriais
                            System.out.println(" ");
                            manualCondutaOpSet.editarManual();
                            break;
                        
                        case 6: //VoltarInicio
                            System.out.println(" ");
                            break;

                        default://NenhumaOpçãoAcima
                            System.out.println(tradutor.get("invalid"));
                            break;

                    }

                    break;
                
                case 4: //excluir
                    System.out.println("___________________________________________________");
                    System.out.println(tradutor.get("exclusao"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manualOp"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("procedSeg"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manutenRep"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("testDiag"));
                    System.out.println("|-------------------------------------------------|");
                    System.out.println(tradutor.get("manualCOS"));
                    System.out.println("|_________________________________________________|");
                    System.out.println(tradutor.get("return"));
                    System.out.println("|_________________________________________________|");
                    System.out.println(" ");

                    System.out.println(tradutor.get("chooseExcluir"));
                    System.out.print(tradutor.get("resposta"));
                    tipoOrientacao = leia.nextInt();

                    switch(tipoOrientacao){

                        case 1: //manualOperacao
                            System.out.println(" ");
                            manualOperacao.excluirManual();
                            break;
                        
                        case 2: //procedimentoSeguranca
                            System.out.println(" ");
                            procedimentoSeguranca.excluirManual();
                            break;

                        case 3: //manutencaoReparos
                            System.out.println(" ");
                            manutencaoReparos.excluirManual();
                            break;

                        case 4: //testesDiagnostico
                            System.out.println(" ");
                            testesDiagnostico.excluirManual();
                            break;

                        case 5: //manualCondutaOperacoesSetoriais
                            System.out.println(" ");
                            manualCondutaOpSet.excluirManual();
                            break;

                        case 6: //VoltarInicio
                            System.out.println(" ");
                            break;

                        default://NenhumaOpçãoAcima
                            System.out.println(tradutor.get("invalid"));
                            break;

                    }

                    break;

                case 5: //encerrar
                    System.out.println(tradutor.get("encerrar"));
                    break;

                default: //nenhuma das opções
                    System.out.println(tradutor.get("invalid"));
                    break;

                }

            } while(decisaoInicial != 5);
            

        } catch (IOException e) {

            System.out.println("Erro ao carregar tradução!");

        }
            
        leia.close();    
    }
} 