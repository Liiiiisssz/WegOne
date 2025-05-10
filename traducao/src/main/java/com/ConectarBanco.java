package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarBanco {

    public static void main(String[] args) {

        String url = "mysql://root:AqJhQqUfxqRDnzePcrJXllhWngUzxuwe@ballast.proxy.rlwy.net:15606/railway";
        String usuario = "root";
        String senha = "AqJhQqUfxqRDnzePcrJXllhWngUzxuwe";

        try {

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");

            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");

            while (rs.next()) {
                System.out.println("Nome: " + rs.getString("nome"));
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

