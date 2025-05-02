package com;
import java.util.Scanner;

public class ProcedimentoSeguranca {

    Scanner leia = new Scanner(System.in);

    Traducoes tradutor;

    String[] procedimentoSeguranca = new String[4];
	String[] titulosProcedimentoSeguranca = new String[4];

    int contadorCadastro = 2;

    public ProcedimentoSeguranca(Traducoes tradutor) {

        this.tradutor = tradutor;

        titulosProcedimentoSeguranca[0] = "Manual de seguranca motor weg W22";

        procedimentoSeguranca[0] = "_______________________________________________________________________\n" +
                                "|--               MANUAL DE SEGURANÇA - MOTOR WEG W22                --|\n" +
                                "|_____________________________________________________________________|\n" +
                                "|-- OBJETIVO: Procedimento seguro para inspeção e manutenção do motor --|\n" +
                                "|   WEG W22, garantindo a integridade do operador e do equipamento.    |\n" +
                                "|_____________________________________________________________________|\n" +
                                "|                                                                     |\n" +
                                "| 1. INSTRUÇÕES GERAIS:                                               |\n" +
                                "|                                                                     |\n" +
                                "| - Somente técnicos qualificados podem intervir no equipamento.      |\n" +
                                "| - Leia atentamente o manual do fabricante antes de qualquer ação.   |\n" +
                                "| - Nunca opere o motor sem as proteções instaladas.                  |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 2. DESLIGAMENTO SEGURO:                                             |\n" +
                                "|                                                                     |\n" +
                                "| - Desligue a alimentação principal do quadro de energia.            |\n" +
                                "| - Aplique bloqueio e etiquetagem (LOTO).                            |\n" +
                                "| - Aguarde 10 minutos para descarregar capacitores.                  |\n" +
                                "| - Verifique ausência de tensão com detector CAT III/IV.             |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 3. EPI OBRIGATÓRIO:                                                 |\n" +
                                "|                                                                     |\n" +
                                "| - Luvas isolantes                                                   |\n" +
                                "| - Óculos de proteção                                                |\n" +
                                "| - Calçado de segurança dielétrico                                   |\n" +
                                "| - Detector de tensão                                                |\n" +
                                "| - Capacete com viseira                                              |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 4. INSPEÇÃO:                                                        |\n" +
                                "|                                                                     |\n" +
                                "| - Verificar temperatura, vibração e ruídos.                         |\n" +
                                "| - Inspecionar bornes, carcaça e ventilação.                         |\n" +
                                "| - Limpar com materiais não inflamáveis.                             |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 5. NORMAS APLICADAS:                                                |\n" +
                                "|                                                                     |\n" +
                                "| - NR-10, NR-12                                                      |\n" +
                                "| - NBR IEC 60034-1                                                   |\n" +
                                "| - Manual Técnico WEG W22                                            |\n" +
                                "|                                                                     |\n" +
                                "|_____________________________________________________________________|\n";

        titulosProcedimentoSeguranca[1] = "Manual de seguranca inversor weg CFW500";

        procedimentoSeguranca[1] = "_______________________________________________________________________\n" +
                                "|--          MANUAL DE SEGURANÇA - INVERSOR WEG CFW500              --|\n" +
                                "|_____________________________________________________________________|\n" +
                                "|-- OBJETIVO: Garantir a segurança na parametrização e manutenção     --|\n" +
                                "|   do inversor de frequência WEG CFW500, evitando acidentes.         |\n" +
                                "|_____________________________________________________________________|\n" +
                                "|                                                                     |\n" +
                                "| 1. INSTRUÇÕES GERAIS:                                               |\n" +
                                "|                                                                     |\n" +
                                "| - Leia o manual do inversor antes de qualquer procedimento.         |\n" +
                                "| - Apenas profissionais habilitados devem operar o equipamento.      |\n" +
                                "| - Nunca toque na placa eletrônica com tensão presente.              |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 2. DESLIGAMENTO E PREPARAÇÃO:                                       |\n" +
                                "|                                                                     |\n" +
                                "| - Desligar o disjuntor de entrada do painel elétrico.               |\n" +
                                "| - Aplicar bloqueio e etiquetagem (LOTO).                            |\n" +
                                "| - Aguardar 15 minutos após desligamento.                            |\n" +
                                "| - Confirmar ausência de tensão nos terminais R/S/T e U/V/W.         |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 3. EPI OBRIGATÓRIO:                                                 |\n" +
                                "|                                                                     |\n" +
                                "| - Luvas e ferramentas isoladas (1000V)                              |\n" +
                                "| - Óculos de proteção                                                |\n" +
                                "| - Calçado de segurança                                              |\n" +
                                "| - Detector de tensão                                                |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 4. PARAMETRIZAÇÃO SEGURA:                                           |\n" +
                                "|                                                                     |\n" +
                                "| - Utilizar HMI do inversor ou software WEG com cabo isolado.        |\n" +
                                "| - Verificar se a carga está desconectada durante os ajustes.        |\n" +
                                "| - Validar parâmetros antes de reenergizar o sistema.                |\n" +
                                "|                                                                     |\n" +
                                "|---------------------------------------------------------------------|\n" +
                                "|                                                                     |\n" +
                                "| 5. NORMAS APLICADAS:                                                |\n" +
                                "|                                                                     |\n" +
                                "| - NR-10                                                            |\n" +
                                "| - NBR IEC 61800-5-1                                                 |\n" +
                                "| - Manual Técnico CFW500 WEG                                        |\n" +
                                "|                                                                     |\n" +
                                "|_____________________________________________________________________|\n";

    }
    
    public void cadastrarManual() {

        if (contadorCadastro < 4) {

            System.out.println(tradutor.get("tituloProcedSeg"));
            titulosProcedimentoSeguranca[contadorCadastro] = leia.nextLine();

            System.out.println(" ");

            System.out.println(tradutor.get("conteudoProcedSeg"));
            procedimentoSeguranca[contadorCadastro] = leia.nextLine();
            System.out.println(" ");

            contadorCadastro++;

        } else {

			System.out.println(tradutor.get("numeroMax"));

        }
    }

    public void pesquisarManualTitulo() {

		System.out.println(tradutor.get("tituloPesq"));
        String pesquisa = leia.nextLine();

        boolean encontrado = false;

        System.out.println(" ");

        for (int i = 0; i < titulosProcedimentoSeguranca.length; i++) {

            if (titulosProcedimentoSeguranca[i] != null) {

                if (titulosProcedimentoSeguranca[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
                    System.out.println(" ");
                    System.out.println(titulosProcedimentoSeguranca[i]);
                    System.out.println(procedimentoSeguranca[i]);
                    encontrado = true;

                }
            }
        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }
    }

    public void pesquisaManualCodigo() {

		System.out.println(tradutor.get("codigoPesq"));
        int pesquisaCodigo = leia.nextInt();

        boolean encontrado = false;

        System.out.println(" ");

        if (titulosProcedimentoSeguranca[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
            System.out.println(" ");
            System.out.println(titulosProcedimentoSeguranca[pesquisaCodigo]);

            System.out.println(procedimentoSeguranca[pesquisaCodigo]);
            encontrado = true;

        }

        if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

        }
    }

    public void editarManual() {

		System.out.println(tradutor.get("edit"));
        int codigo = leia.nextInt();

        int indiceCadastro = codigo;

        System.out.println(" ");

        if (titulosProcedimentoSeguranca[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
            titulosProcedimentoSeguranca[indiceCadastro] = leia.nextLine();
            titulosProcedimentoSeguranca[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
            procedimentoSeguranca[indiceCadastro] = leia.nextLine();

            System.out.println(" ");
			System.out.println(tradutor.get("editSucesso")); 

        } else {

			System.out.println(tradutor.get("nEncontrado"));

        }

    }

    public void excluirManual() {

		System.out.println(tradutor.get("excluir"));
        int codigo = leia.nextInt();

        int indiceCadastro = codigo;

        if (titulosProcedimentoSeguranca[indiceCadastro] != null) {

            for (int i = codigo; i < 3; i++) {
                titulosProcedimentoSeguranca[i] = titulosProcedimentoSeguranca[i + 1];
                procedimentoSeguranca[i] = procedimentoSeguranca[i + 1];
            }

            titulosProcedimentoSeguranca[3] = null;
            procedimentoSeguranca[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastro--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

        } else {

            System.out.println(tradutor.get("delNEncontrado"));

        }

    }

}