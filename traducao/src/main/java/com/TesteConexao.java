package com;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) {
        try (Connection conn = Conexao.getConexao()) {
            if (conn != null) {
                String nomeBanco = conn.getCatalog();  // pega o nome do database conectado
                System.out.println("Banco de dados atual: " + nomeBanco);
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar operações no banco: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
