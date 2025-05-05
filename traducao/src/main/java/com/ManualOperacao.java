package com;
import java.util.Scanner;

public class ManualOperacao {

	Scanner leia = new Scanner(System.in);

	Traducoes tradutor;

	String[] manualOperacaoConteudo = new String[4];
	String[] titulosManuaisOperacao = new String[4];

	String[] manualOperacaoConteudoEN = new String[4];
	String[] titulosManuaisOperacaoEN = new String[4];

	String[] manualOperacaoConteudoDE = new String[4];
	String[] titulosManuaisOperacaoDE = new String[4];

	int contadorCadastro = 2;
	int contadorCadastroEN = 2;
	int contadorCadastroDE = 2;

	public ManualOperacao(Traducoes tradutor) {

		this.tradutor = tradutor;

		//manuais em PT
		titulosManuaisOperacao[0] = "Manual de operacao de motores eletricos";

		manualOperacaoConteudo[0] =
		        "_______________________________________________________________________\n" +
				"|--              MANUAL DE OPERAÇÃO DE MOTORES ELÉTRICOS            --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- OBJETIVO: Fornecer orientações sobre a instalação, operação e   --|\n" +
				"|   manutenção de motores elétricos, seguindo práticas recomendadas   |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. INSTRUÇÕES GERAIS:                                               |\n" +
				"|                                                                     |\n" +
				"| - Leia completamente o manual antes da instalação.                  |\n" +
				"| - Verifique os dados da placa do motor com a aplicação.             |\n" +
				"| - Apenas profissionais qualificados devem realizar procedimentos.   |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 2. INSTALAÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Local limpo, seco e bem ventilado.                                |\n" +
				"| - Fixação firme para evitar vibração.                               |\n" +
				"| - Ligação elétrica conforme o esquema do motor e normas aplicáveis. |\n" +
				"| - Conexão correta do aterramento.                                   |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 3. PARTIDA:                                                         |\n" +
				"|                                                                     |\n" +
				"| - Utilize sistemas de partida adequados:                            |\n" +
				"|   * Direta                                                          |\n" +
				"|   * Estrela-triângulo                                               |\n" +
				"|   * Soft starter                                                    |\n" +
				"|   * Inversor de frequência                                          |\n" +
				"| - Verifique e ajuste o sentido de rotação.                          |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. OPERAÇÃO:                                                        |\n" +
				"|                                                                     |\n" +
				"| - Monitorar temperatura, ruído e vibração.                          |\n" +
				"| - Não sobrecarregar o motor.                                        |\n" +
				"| - Respeitar os limites especificados pelo fabricante.               |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 5. MANUTENÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Lubrificação conforme tabela do fabricante.                       |\n" +
				"| - Utilizar graxa recomendada.                                       |\n" +
				"| - Manter limpeza das aletas e ventilador.                           |\n" +
				"| - Realizar inspeções nos rolamentos e conexões.                     |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SEGURANÇA:                                                       |\n" +
				"|                                                                     |\n" +
				"| - Desligar a energia antes de intervenções.                         |\n" +
				"| - Utilizar Equipamentos de Proteção Individual (EPI) adequados.     |\n" +
				"| - Seguir normas de segurança elétrica.                              |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SEGURANÇA:                                                       |\n" +
				"|                                                                     |\n" +
				"| - Desligar a energia antes de intervenções.                         |\n" +
				"| - Utilizar Equipamentos de Proteção Individual (EPI) adequados.     |\n" +
				"| - Seguir normas de segurança elétrica.                              |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 7. NORMAS APLICADAS:                                                |\n" +
				"|                                                                     |\n" +
				"| - Normas técnicas nacionais e internacionais relevantes.            |\n" +
				"| - Recomendações do fabricante para motores industriais.             |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n";

		titulosManuaisOperacao[1] = "Manual de operacao de geradores eletricos";

		manualOperacaoConteudo[1] = "_______________________________________________________________________\n" +
				"|--              MANUAL DE OPERAÇÃO DE GERADORES ELÉTRICOS          --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- OBJETIVO: Apresentar as instruções para instalação, operação e    |\n" +
				"|   manutenção segura e eficiente de geradores elétricos.             |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. INSTRUÇÕES GERAIS:                                               |\n" +
				"|                                                                     |\n" +
				"| - Certifique-se de que o gerador é compatível com a aplicação.      |\n" +
				"| - Leia o manual completo antes da instalação.                       |\n" +
				"| - Apenas pessoal treinado deve realizar operações ou manutenção.    |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 2. INSTALAÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Instalar o gerador em local coberto, seco e ventilado.            |\n" +
				"| - Fixar sobre base nivelada e rígida para evitar vibração.          |\n" +
				"| - Verificar alinhamento entre motor primário e o gerador.           |\n" +
				"| - Conectar aterramento de forma adequada.                           |\n" +
				"| - Realizar as conexões elétricas conforme o esquema de ligação.     |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 3. PARTIDA E PARADA:                                                |\n" +
				"|                                                                     |\n" +
				"| - Antes da partida, verificar nível de óleo e combustível           |\n" +
				"|   * (se for acionado por motor a combustão)                         |\n" +
				"| - Verificar se não há vazamentos ou obstruções.                     |\n" +
				"| - Conectar aterramento de forma adequada.                           |\n" +
				"| - Durante a parada, desligar as cargas antes de                     |\n" +
				"|   desligar o grupo gerador.                                         |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. OPERAÇÃO:                                                        |\n" +
				"|                                                                     |\n" +
				"| - Monitorar tensão, corrente, frequência e temperatura.             |\n" +
				"| - Operar o gerador dentro dos limites especificados.                |\n" +
				"| - Evitar sobrecargas ou subfrequências.                             |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 5. MANUTENÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Realizar inspeções periódicas conforme o manual técnico.          |\n" +
				"| - Lubrificar os rolamentos conforme a recomendação do fabricante.   |\n" +
				"| - Evitar sobrecargas ou subfrequências.                             |\n" +
				"| - Verificar o estado das escovas e anéis coletores (se aplicável).  |\n" +
				"| - Limpar regularmente o estator e rotor,                            |\n" +
				"|   mantendo-os livres de poeira e óleo.                              |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SEGURANÇA:                                                       |\n" +
				"|                                                                     |\n" +
				"| - Sempre desligar o gerador antes de qualquer intervenção.          |\n" +
				"| - Usar EPI apropriado para eletricidade.                            |\n" +
				"| - Evitar contato com partes móveis e quentes durante a operação.    |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 7. NORMAS APLICADAS:                                                |\n" +
				"|                                                                     |\n" +
				"| - NBR 10295: Aplicações de geradores síncronos.                     |\n" +
				"| - IEC 60034: Padrões internacionais para máquinas rotativas.        |\n" +
				"| - Instruções da WEG para grupos geradores e geradores industriais.  |\n" +
				"|---------------------------------------------------------------------|\n";


		//manuais em INGLES
		titulosManuaisOperacaoEN[0] = "Electric Motor Operation Manual";

		manualOperacaoConteudoEN[0] = " _______________________________________________________________________\n" +
				"|--             ELECTRIC MOTOR OPERATION MANUAL                       --|\n" +
				"|_______________________________________________________________________|\n" +
				"|-- PURPOSE: Provide guidelines for the installation, operation,      --|\n" +
				"|   and maintenance of electric motors, following recommended practices |\n" +
				"|_______________________________________________________________________|\n" +
				"|                                                                       |\n" +
				"| 1. GENERAL INSTRUCTIONS:                                              |\n" +
				"|                                                                       |\n" +
				"| - Read the entire manual before installation.                         |\n" +
				"| - Check motor nameplate data against the application.                 |\n" +
				"| - Only qualified professionals should perform procedures.             |\n" +
				"|                                                                       |\n" +
				"|-----------------------------------------------------------------------|\n" +
				"|                                                                       |\n" +
				"| 2. INSTALLATION:                                                      |\n" +
				"|                                                                       |\n" +
				"| - Clean, dry, and well-ventilated location.                           |\n" +
				"| - Firm mounting to avoid vibration.                                   |\n" +
				"| - Electrical connection according to motor diagram and regulations.   |\n" +
				"| - Correct grounding connection.                                       |\n" +
				"|                                                                       |\n" +
				"|-----------------------------------------------------------------------|\n" +
				"|                                                                       |\n" +
				"| 3. START-UP:                                                          |\n" +
				"|                                                                       |\n" +
				"| - Use appropriate starting systems:                                   |\n" +
				"|   * Direct-on-line                                                    |\n" +
				"|   * Star-delta                                                        |\n" +
				"|   * Soft starter                                                      |\n" +
				"|   * Frequency inverter                                                |\n" +
				"| - Check and adjust the direction of rotation.                         |\n" +
				"|                                                                       |\n" +
				"|-----------------------------------------------------------------------|\n" +
				"|                                                                       |\n" +
				"| 4. OPERATION:                                                         |\n" +
				"|                                                                       |\n" +
				"| - Monitor temperature, noise, and vibration.                          |\n" +
				"| - Do not overload the motor.                                          |\n" +
				"| - Respect the limits specified by the manufacturer.                   |\n" +
				"|                                                                       |\n" +
				"|-----------------------------------------------------------------------|\n" +
				"|                                                                       |\n" +
				"| 5. MAINTENANCE:                                                       |\n" +
				"|                                                                       |\n" +
				"| - Lubricate according to manufacturer's table.                        |\n" +
				"| - Use recommended grease.                                             |\n" +
				"| - Keep cooling fins and fan clean.                                    |\n" +
				"| - Inspect bearings and connections.                                   |\n" +
				"|                                                                       |\n" +
				"|-----------------------------------------------------------------------|\n" +
				"|                                                                       |\n" +
				"| 6. SAFETY:                                                            |\n" +
				"|                                                                       |\n" +
				"| - Disconnect power before any intervention.                           |\n" +
				"| - Use appropriate Personal Protective Equipment (PPE).                |\n" +
				"| - Follow electrical safety standards.                                 |\n" +
				"|                                                                       |\n" +
				"|-----------------------------------------------------------------------|\n" +
				"|                                                                       |\n" +
				"| 7. APPLICABLE STANDARDS:                                              |\n" +
				"|                                                                       |\n" +
				"| - Relevant national and international technical standards.            |\n" +
				"| - Manufacturer recommendations for industrial motors.                 |\n" +
				"|                                                                       |\n" +
				"|-----------------------------------------------------------------------|";

		titulosManuaisOperacaoEN[1] = "Manual de operacao de geradores eletricos";

		manualOperacaoConteudoEN[1] = "_______________________________________________________________________\n" +
				"|--              MANUAL DE OPERAÇÃO DE GERADORES ELÉTRICOS          --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- OBJETIVO: Apresentar as instruções para instalação, operação e    |\n" +
				"|   manutenção segura e eficiente de geradores elétricos.             |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. INSTRUÇÕES GERAIS:                                               |\n" +
				"|                                                                     |\n" +
				"| - Certifique-se de que o gerador é compatível com a aplicação.      |\n" +
				"| - Leia o manual completo antes da instalação.                       |\n" +
				"| - Apenas pessoal treinado deve realizar operações ou manutenção.    |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 2. INSTALAÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Instalar o gerador em local coberto, seco e ventilado.            |\n" +
				"| - Fixar sobre base nivelada e rígida para evitar vibração.          |\n" +
				"| - Verificar alinhamento entre motor primário e o gerador.           |\n" +
				"| - Conectar aterramento de forma adequada.                           |\n" +
				"| - Realizar as conexões elétricas conforme o esquema de ligação.     |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 3. PARTIDA E PARADA:                                                |\n" +
				"|                                                                     |\n" +
				"| - Antes da partida, verificar nível de óleo e combustível           |\n" +
				"|   * (se for acionado por motor a combustão)                         |\n" +
				"| - Verificar se não há vazamentos ou obstruções.                     |\n" +
				"| - Conectar aterramento de forma adequada.                           |\n" +
				"| - Durante a parada, desligar as cargas antes de                     |\n" +
				"|   desligar o grupo gerador.                                         |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. OPERAÇÃO:                                                        |\n" +
				"|                                                                     |\n" +
				"| - Monitorar tensão, corrente, frequência e temperatura.             |\n" +
				"| - Operar o gerador dentro dos limites especificados.                |\n" +
				"| - Evitar sobrecargas ou subfrequências.                             |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 5. MANUTENÇÃO:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Realizar inspeções periódicas conforme o manual técnico.          |\n" +
				"| - Lubrificar os rolamentos conforme a recomendação do fabricante.   |\n" +
				"| - Evitar sobrecargas ou subfrequências.                             |\n" +
				"| - Verificar o estado das escovas e anéis coletores (se aplicável).  |\n" +
				"| - Limpar regularmente o estator e rotor,                            |\n" +
				"|   mantendo-os livres de poeira e óleo.                              |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SEGURANÇA:                                                       |\n" +
				"|                                                                     |\n" +
				"| - Sempre desligar o gerador antes de qualquer intervenção.          |\n" +
				"| - Usar EPI apropriado para eletricidade.                            |\n" +
				"| - Evitar contato com partes móveis e quentes durante a operação.    |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 7. NORMAS APLICADAS:                                                |\n" +
				"|                                                                     |\n" +
				"| - NBR 10295: Aplicações de geradores síncronos.                     |\n" +
				"| - IEC 60034: Padrões internacionais para máquinas rotativas.        |\n" +
				"| - Instruções da WEG para grupos geradores e geradores industriais.  |\n" +
				"|---------------------------------------------------------------------|\n";
	
		//manuais em ALEMÃO
		titulosManuaisOperacaoDE[0] = "Handbuch für den Betrieb von Elektrogeneratoren";

		manualOperacaoConteudoDE[0] = "_______________________________________________________________________\n" +
				"|--               HANDBUCH FÜR DEN BETRIEB VON ELEKTROGENERATOREN     --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- ZIEL: Anweisungen für die sichere und effiziente Installation,   --|\n" +
				"|   den Betrieb und die Wartung von Elektrogeneratoren zu geben.      |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. ALLGEMEINE HINWEISE:                                             |\n" +
				"|                                                                     |\n" +
				"| - Stellen Sie sicher, dass der Generator mit der Anwendung         |\n" +
				"|   kompatibel ist.                                                   |\n" +
				"| - Lesen Sie das gesamte Handbuch vor der Installation.              |\n" +
				"| - Nur geschultes Personal sollte Wartungs- oder Betriebsmaßnahmen   |\n" +
				"|   durchführen.                                                      |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 2. INSTALLATION:                                                    |\n" +
				"|                                                                     |\n" +
				"| - Installieren Sie den Generator an einem trockenen, belüfteten     |\n" +
				"|   und überdachten Ort.                                              |\n" +
				"| - Befestigen Sie ihn auf einer ebenen und stabilen Basis, um       |\n" +
				"|   Vibrationen zu vermeiden.                                         |\n" +
				"| - Überprüfen Sie die Ausrichtung zwischen dem Primärmotor und dem   |\n" +
				"|   Generator.                                                        |\n" +
				"| - Stellen Sie die Erdung korrekt her.                                |\n" +
				"| - Stellen Sie elektrische Verbindungen gemäß dem Schaltplan her.    |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 3. START UND STOP:                                                  |\n" +
				"|                                                                     |\n" +
				"| - Überprüfen Sie vor dem Start den Öl- und Kraftstoffstand           |\n" +
				"|   * (falls mit Verbrennungsmotor betrieben)                          |\n" +
				"| - Überprüfen Sie, ob keine Lecks oder Blockierungen vorliegen.      |\n" +
				"| - Stellen Sie die Erdung korrekt her.                                |\n" +
				"| - Trennen Sie bei der Abschaltung zunächst die Lasten, bevor Sie    |\n" +
				"|   die Generatorgruppe ausschalten.                                  |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. BETRIEB:                                                         |\n" +
				"|                                                                     |\n" +
				"| - Überwachen Sie Spannung, Strom, Frequenz und Temperatur.          |\n" +
				"| - Betreiben Sie den Generator innerhalb der festgelegten Grenzen.   |\n" +
				"| - Vermeiden Sie Überlastungen oder Unterfrequenzen.                 |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 5. WARTUNG:                                                         |\n" +
				"|                                                                     |\n" +
				"| - Führen Sie regelmäßige Inspektionen gemäß dem technischen Handbuch|\n" +
				"|   durch.                                                            |\n" +
				"| - Schmieren Sie die Lager gemäß den Empfehlungen des Herstellers.   |\n" +
				"| - Vermeiden Sie Überlastungen oder Unterfrequenzen.                 |\n" +
				"| - Überprüfen Sie den Zustand der Kohlebürsten und Schleifringe      |\n" +
				"|   (falls zutreffend).                                               |\n" +
				"| - Reinigen Sie regelmäßig den Stator und Rotor und halten Sie      |\n" +
				"|   sie frei von Staub und Öl.                                        |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SICHERHEIT:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Schalten Sie den Generator vor jeder Intervention aus.           |\n" +
				"| - Verwenden Sie geeignete persönliche Schutzausrüstung (PSA).        |\n" +
				"| - Vermeiden Sie den Kontakt mit beweglichen und heißen Teilen       |\n" +
				"|   während des Betriebs.                                            |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 7. ANWENDBARE NORMEN:                                               |\n" +
				"|                                                                     |\n" +
				"| - NBR 10295: Anwendungen von Synchron-Generatoren.                  |\n" +
				"| - IEC 60034: Internationale Normen für drehende Maschinen.         |\n" +
				"| - WEG-Anweisungen für Generatorgruppen und industrielle Generatoren.|\n" +
				"|---------------------------------------------------------------------|\n";

		titulosManuaisOperacaoDE[1] = "Handbuch für den Betrieb von Elektromotoren";

		manualOperacaoConteudoDE[1] = "_______________________________________________________________________\n" +
				"|--               HANDBUCH FÜR DEN BETRIEB VON ELEKTROMOTOREN         --|\n" +
				"|_____________________________________________________________________|\n" +
				"|-- ZIEL: Anweisungen für die Installation, den Betrieb und die      --|\n" +
				"|   Wartung von Elektromotoren unter Berücksichtigung empfohlener     |\n" +
				"|   Praktiken zu geben.                                              |\n" +
				"|_____________________________________________________________________|\n" +
				"|                                                                     |\n" +
				"| 1. ALLGEMEINE HINWEISE:                                             |\n" +
				"|                                                                     |\n" +
				"| - Lesen Sie das Handbuch vollständig vor der Installation.          |\n" +
				"| - Überprüfen Sie die Daten des Motortyps mit der Anwendung.          |\n" +
				"| - Nur qualifiziertes Personal darf Arbeiten durchführen.            |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 2. INSTALLATION:                                                    |\n" +
				"|                                                                     |\n" +
				"| - Sauberer, trockener und gut belüfteter Installationsort.          |\n" +
				"| - Feste Befestigung, um Vibrationen zu vermeiden.                    |\n" +
				"| - Elektrische Anschlüsse gemäß dem Motorschema und den geltenden    |\n" +
				"|   Normen.                                                           |\n" +
				"| - Korrekte Erdung des Motors anschließen.                            |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 3. START:                                                           |\n" +
				"|                                                                     |\n" +
				"| - Verwenden Sie geeignete Startsysteme:                              |\n" +
				"|   * Direkt                                                          |\n" +
				"|   * Stern-Dreieck                                                    |\n" +
				"|   * Sanftanlasser                                                   |\n" +
				"|   * Frequenzumrichter                                              |\n" +
				"| - Überprüfen Sie und stellen Sie die Drehrichtung ein.              |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 4. BETRIEB:                                                         |\n" +
				"|                                                                     |\n" +
				"| - Überwachen Sie Temperatur, Geräusche und Vibrationen.             |\n" +
				"| - Überlasten Sie den Motor nicht.                                    |\n" +
				"| - Beachten Sie die vom Hersteller angegebenen Grenzwerte.           |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 5. WARTUNG:                                                         |\n" +
				"|                                                                     |\n" +
				"| - Schmierung gemäß der Herstellerempfehlung.                        |\n" +
				"| - Verwenden Sie empfohlenes Schmierfett.                             |\n" +
				"| - Reinigen Sie regelmäßig die Lüfter und Kühlrippen.                |\n" +
				"| - Führen Sie Inspektionen an den Lagern und Verbindungen durch.     |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 6. SICHERHEIT:                                                      |\n" +
				"|                                                                     |\n" +
				"| - Trennen Sie die Stromversorgung vor Arbeiten am Motor.            |\n" +
				"| - Verwenden Sie geeignete Persönliche Schutzausrüstung (PSA).        |\n" +
				"| - Befolgen Sie die geltenden Sicherheitsvorschriften für Elektrik.  |\n" +
				"|                                                                     |\n" +
				"|---------------------------------------------------------------------|\n" +
				"|                                                                     |\n" +
				"| 7. ANWENDBARE NORMEN:                                               |\n" +
				"|                                                                     |\n" +
				"| - Nationale und internationale technische Normen.                   |\n" +
				"| - Empfehlungen des Herstellers für industrielle Elektromotoren.     |\n" +
				"|---------------------------------------------------------------------|\n";

	}

	public void cadastrarManual() { //cadastro em PT

		if (contadorCadastro < titulosManuaisOperacao.length) {

			System.out.println(tradutor.get("tituloManualOp"));
			titulosManuaisOperacao[contadorCadastro] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManualOp"));
			manualOperacaoConteudo[contadorCadastro] = leia.nextLine();
			System.out.println(" ");

			contadorCadastro++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}

	public void cadastrarManualEN() { //cadastro em INGLES

		if (contadorCadastroEN < titulosManuaisOperacaoEN.length) {

			System.out.println(tradutor.get("tituloManualOp"));
			titulosManuaisOperacaoEN[contadorCadastroEN] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManualOp"));
			manualOperacaoConteudoEN[contadorCadastroEN] = leia.nextLine();
			System.out.println(" ");

			contadorCadastroEN++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}

	public void cadastrarManualDE() { //cadastro em ALEMÃO

		if (contadorCadastroDE < titulosManuaisOperacaoDE.length) {

			System.out.println(tradutor.get("tituloManualOp"));
			titulosManuaisOperacaoDE[contadorCadastroDE] = leia.nextLine();

			System.out.println(" ");

			System.out.println(tradutor.get("conteudoManualOp"));
			manualOperacaoConteudoDE[contadorCadastroDE] = leia.nextLine();
			System.out.println(" ");

			contadorCadastroDE++;

		} else {

			System.out.println(tradutor.get("numeroMax"));

		}

	}





	public void pesquisaManualTitulo() { //pesquisa TITULO em PT

		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		boolean encontrado = false;

		System.out.println(" ");

		for (int i = 0; i < titulosManuaisOperacao.length; i++) {

			if (titulosManuaisOperacao[i] != null) {

				if (titulosManuaisOperacao[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
					System.out.println(" ");
					System.out.println(titulosManuaisOperacao[i]);
					System.out.println(manualOperacaoConteudo[i]);
					encontrado = true;

				}
			}
		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}
	}

	public void pesquisaManualTituloEN() { //pesquisa TITULO em INGLES

		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		boolean encontrado = false;

		System.out.println(" ");

		for (int i = 0; i < titulosManuaisOperacaoEN.length; i++) {

			if (titulosManuaisOperacaoEN[i] != null) {

				if (titulosManuaisOperacaoEN[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
					System.out.println(" ");
					System.out.println(titulosManuaisOperacaoEN[i]);
					System.out.println(manualOperacaoConteudoEN[i]);
					encontrado = true;

				}
			}
		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}
	}

	public void pesquisaManualTituloDE() { //pesquisa TITULO em ALEMÃO

		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		boolean encontrado = false;

		System.out.println(" ");

		for (int i = 0; i < titulosManuaisOperacaoDE.length; i++) {

			if (titulosManuaisOperacaoDE[i] != null) {

				if (titulosManuaisOperacaoDE[i].contains(pesquisa)) {

					System.out.println(tradutor.get("encontrado"));
					System.out.println(" ");
					System.out.println(titulosManuaisOperacaoDE[i]);
					System.out.println(manualOperacaoConteudoDE[i]);
					encontrado = true;

				}
			}
		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}
	}

	public void pesquisaManualCodigo() { //pesquisa CODIGO em PT

		System.out.println(tradutor.get("codigoPesq"));
		int pesquisaCodigo = leia.nextInt();
		
		boolean encontrado = false;

		System.out.println(" ");

		if (titulosManuaisOperacao[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
			System.out.println(" ");
			System.out.println(titulosManuaisOperacao[pesquisaCodigo]);

			System.out.println(manualOperacaoConteudo[pesquisaCodigo]);
			encontrado = true;

		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}
	}

	public void pesquisaManualCodigoEN() { //pesquisa CODIGO em INGLES

		System.out.println(tradutor.get("codigoPesq"));
		int pesquisaCodigo = leia.nextInt();
		
		boolean encontrado = false;

		System.out.println(" ");

		if (titulosManuaisOperacaoEN[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
			System.out.println(" ");
			System.out.println(titulosManuaisOperacaoEN[pesquisaCodigo]);

			System.out.println(manualOperacaoConteudoEN[pesquisaCodigo]);
			encontrado = true;

		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}
	}

	public void pesquisaManualCodigoDE() { //pesquisa CODIGO em ALEMÃO

		System.out.println(tradutor.get("codigoPesq"));
		int pesquisaCodigo = leia.nextInt();
		
		boolean encontrado = false;

		System.out.println(" ");

		if (titulosManuaisOperacaoDE[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
			System.out.println(" ");
			System.out.println(titulosManuaisOperacaoDE[pesquisaCodigo]);

			System.out.println(manualOperacaoConteudoDE[pesquisaCodigo]);
			encontrado = true;

		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}
	}





	public void editarManual() { //editar em PT

		System.out.println(tradutor.get("edit"));
		int codigo = leia.nextInt();

		int indiceCadastro = codigo;

		System.out.println(" ");

		if (titulosManuaisOperacao[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisOperacao[indiceCadastro] = leia.nextLine();
			titulosManuaisOperacao[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualOperacaoConteudo[indiceCadastro] = leia.nextLine();

			System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

	public void editarManualEN() { //editar em INGLES

		System.out.println(tradutor.get("edit"));
		int codigo = leia.nextInt();

		int indiceCadastro = codigo;

		System.out.println(" ");

		if (titulosManuaisOperacaoEN[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisOperacaoEN[indiceCadastro] = leia.nextLine();
			titulosManuaisOperacaoEN[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualOperacaoConteudoEN[indiceCadastro] = leia.nextLine();

			System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

	public void editarManualDE() { //editar em ALEMÃO

		System.out.println(tradutor.get("edit"));
		int codigo = leia.nextInt();

		int indiceCadastro = codigo;

		System.out.println(" ");

		if (titulosManuaisOperacaoDE[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisOperacaoDE[indiceCadastro] = leia.nextLine();
			titulosManuaisOperacaoDE[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualOperacaoConteudoDE[indiceCadastro] = leia.nextLine();

			System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}





	public void excluirManual() { //excluir em PT

		System.out.println(tradutor.get("excluir"));
		int codigo = leia.nextInt();

			int indiceCadastro = codigo;

			if (titulosManuaisOperacao[indiceCadastro] != null) {

				for (int i = codigo; i < 3; i++) {
                titulosManuaisOperacao[i] = titulosManuaisOperacao[i + 1];
                manualOperacaoConteudo[i] = manualOperacaoConteudo[i + 1];
            }

            titulosManuaisOperacao[3] = null;
            manualOperacaoConteudo[3] = null;

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

	public void excluirManualEN() { //excluir em INGLES

		System.out.println(tradutor.get("excluir"));
		int codigo = leia.nextInt();

			int indiceCadastro = codigo;

			if (titulosManuaisOperacaoEN[indiceCadastro] != null) {

				for (int i = codigo; i < 3; i++) {
                titulosManuaisOperacaoEN[i] = titulosManuaisOperacaoEN[i + 1];
                manualOperacaoConteudoEN[i] = manualOperacaoConteudoEN[i + 1];
            }

            titulosManuaisOperacaoEN[3] = null;
            manualOperacaoConteudoEN[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastroEN--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

			} else {

				System.out.println(tradutor.get("delNEncontrado"));

		}

	}

	public void excluirManualDE() { //excluir em ALEMÃO

		System.out.println(tradutor.get("excluir"));
		int codigo = leia.nextInt();

			int indiceCadastro = codigo;

			if (titulosManuaisOperacaoDE[indiceCadastro] != null) {

				for (int i = codigo; i < 3; i++) {
                titulosManuaisOperacaoDE[i] = titulosManuaisOperacaoDE[i + 1];
                manualOperacaoConteudoDE[i] = manualOperacaoConteudoDE[i + 1];
            }

            titulosManuaisOperacaoDE[3] = null;
            manualOperacaoConteudoDE[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastroDE--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

			} else {

				System.out.println(tradutor.get("delNEncontrado"));

		}

	}

}