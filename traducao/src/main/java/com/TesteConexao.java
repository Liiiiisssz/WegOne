package com;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
    public static void main(String[] args) {
        try (Connection conn = Conexao.getConexao()) {
            if (conn != null) {
                System.out.println("Conexão estabelecida com sucesso!");

                // Criando uma tabela de teste
                String createTableSQL = "CREATE TABLE IF NOT EXISTS Teste (id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(100))";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(createTableSQL);

                // Confirmando a transação
                conn.commit();

                System.out.println("Tabela criada com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar operações no banco: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
