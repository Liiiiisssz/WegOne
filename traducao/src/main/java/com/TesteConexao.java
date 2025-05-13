package com;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = Conexao.getConexao()) {
            if (conn != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (RuntimeException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
