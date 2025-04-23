import java.util.Scanner;

public class ManualOperacao {
    
        Scanner leia = new Scanner(System.in);
        
        String[] manuaisPadrao = new String[2];
        String[] titulosManuaisPadrao = new String[2];
        
        String[] manuaisCadastro = new String[2];
        String[] titulosManuaisCadastro = new String[2];

        public ManualOperacao() {

        	titulosManuaisPadrao[0] = "=== Manual de Operação de Geradores Elétricos ===\\n\\n\" +n";
        	
            	manuaisPadrao[0] = "Objetivo:\n" +
						        "Apresentar as instruções para instalação, operação e manutenção segura e eficiente de geradores elétricos.\n\n" +
						
						        "1. Instruções Gerais:\n" +
						        "- Certifique-se de que o gerador é compatível com a aplicação.\n" +
						        "- Leia o manual completo antes da instalação.\n" +
						        "- Apenas pessoal treinado deve realizar operações ou manutenção.\n\n" +
						
						        "2. Instalação:\n" +
						        "- Instalar o gerador em local coberto, seco e ventilado.\n" +
						        "- Fixar sobre base nivelada e rígida para evitar vibração.\n" +
						        "- Verificar alinhamento entre motor primário e o gerador.\n" +
						        "- Conectar aterramento de forma adequada.\n" +
						        "- Realizar as conexões elétricas conforme o esquema de ligação.\n\n" +
						
						        "3. Partida e Parada:\n" +
						        "- Antes da partida, verificar nível de óleo e combustível (se for acionado por motor a combustão).\n" +
						        "- Verificar se não há vazamentos ou obstruções.\n" +
						        "- Durante a parada, desligar as cargas antes de desligar o grupo gerador.\n\n" +
						
						        "4. Operação:\n" +
						        "- Monitorar tensão, corrente, frequência e temperatura.\n" +
						        "- Operar o gerador dentro dos limites especificados.\n" +
						        "- Evitar sobrecargas ou subfrequências.\n\n" +
						
						        "5. Manutenção:\n" +
						        "- Realizar inspeções periódicas conforme o manual técnico.\n" +
						        "- Lubrificar os rolamentos conforme a recomendação do fabricante.\n" +
						        "- Verificar o estado das escovas e anéis coletores (se aplicável).\n" +
						        "- Limpar regularmente o estator e rotor, mantendo-os livres de poeira e óleo.\n\n" +
						
						        "6. Segurança:\n" +
						        "- Sempre desligar o gerador antes de qualquer intervenção.\n" +
						        "- Usar EPI apropriado para eletricidade.\n" +
						        "- Evitar contato com partes móveis e quentes durante a operação.\n\n" +
						
						        "7. Normas Aplicadas:\n" +
						        "- NBR 10295: Aplicações de geradores síncronos.\n" +
						        "- IEC 60034: Padrões internacionais para máquinas rotativas.\n" +
						        "- Instruções da WEG para grupos geradores e geradores industriais.\n\n" +
						
						        "==========================================\n";

            
            
            titulosManuaisPadrao[1] = "=== Manual de Operação de Geradores Elétricos ===\n\n";
            
            manuaisPadrao[1] =  "Objetivo:\n" +
						        "Apresentar as instruções para instalação, operação e manutenção segura e eficiente de geradores elétricos.\n\n" +
						
						        "1. Instruções Gerais:\n" +
						        "- Certifique-se de que o gerador é compatível com a aplicação.\n" +
						        "- Leia o manual completo antes da instalação.\n" +
						        "- Apenas pessoal treinado deve realizar operações ou manutenção.\n\n" +
						
						        "2. Instalação:\n" +
						        "- Instalar o gerador em local coberto, seco e ventilado.\n" +
						        "- Fixar sobre base nivelada e rígida para evitar vibração.\n" +
						        "- Verificar alinhamento entre motor primário e o gerador.\n" +
						        "- Conectar aterramento de forma adequada.\n" +
						        "- Realizar as conexões elétricas conforme o esquema de ligação.\n\n" +
						
						        "3. Partida e Parada:\n" +
						        "- Antes da partida, verificar nível de óleo e combustível (se for acionado por motor a combustão).\n" +
						        "- Verificar se não há vazamentos ou obstruções.\n" +
						        "- Durante a parada, desligar as cargas antes de desligar o grupo gerador.\n\n" +
						
						        "4. Operação:\n" +
						        "- Monitorar tensão, corrente, frequência e temperatura.\n" +
						        "- Operar o gerador dentro dos limites especificados.\n" +
						        "- Evitar sobrecargas ou subfrequências.\n\n" +
						
						        "5. Manutenção:\n" +
						        "- Realizar inspeções periódicas conforme o manual técnico.\n" +
						        "- Lubrificar os rolamentos conforme a recomendação do fabricante.\n" +
						        "- Verificar o estado das escovas e anéis coletores (se aplicável).\n" +
						        "- Limpar regularmente o estator e rotor, mantendo-os livres de poeira e óleo.\n\n" +
						
						        "6. Segurança:\n" +
						        "- Sempre desligar o gerador antes de qualquer intervenção.\n" +
						        "- Usar EPI apropriado para eletricidade.\n" +
						        "- Evitar contato com partes móveis e quentes durante a operação.\n\n" +
						
						        "7. Normas Aplicadas:\n" +
						        "- NBR 10295: Aplicações de geradores síncronos.\n" +
						        "- IEC 60034: Padrões internacionais para máquinas rotativas.\n" +
						        "- Instruções da WEG para grupos geradores e geradores industriais.\n\n" +
						
						        "==========================================\n";

        }

}
