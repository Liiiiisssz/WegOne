package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://ballast.proxy.rlwy.net:15606/railway";
    private static final String USUARIO = "root";
    private static final String SENHA = "AqJhQqUfxqRDnzePcrJXllhWngUzxuwe";

    public static Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);

            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
}
