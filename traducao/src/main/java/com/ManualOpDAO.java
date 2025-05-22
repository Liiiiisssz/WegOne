package com;

import java.sql.*;

public class ManualOpDAO {
    
    public void cadastrarManual(String titulo, String conteudo, String idioma) {
        String sql = "INSERT INTO manual_operacao (titulo, conteudo, idioma) VALUES (?, ?, ?)";
            
        try (Connection conn = Conexao.getConexao(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                
            stmt.setString(1, titulo);
            stmt.setString(2, conteudo);
            stmt.setString(3, idioma);
                
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Manual de operação cadastrado com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar manual de operação.");
        }
    }
}
