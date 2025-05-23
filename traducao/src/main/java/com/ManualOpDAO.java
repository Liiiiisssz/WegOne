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

    public ManualOperacao pesquisarPorTitulo(String titulo) {
        String sql = "SELECT * FROM manual_operacao WHERE titulo LIKE ?";
        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + titulo + "%");
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                ManualOperacao manual = new ManualOperacao(null);
                manual.setId(rs.getInt("id"));
                manual.setTitulo(rs.getString("titulo"));
                manual.setConteudo(rs.getString("conteudo"));
                manual.setIdioma(rs.getString("idioma"));
                return manual;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao pesquisar manual por título.");
        }
        return null;
    }

}
