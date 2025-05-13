package com;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) {
        try (Connection conn = ConectarBanco.Conectar()) {
            if (conn != null && !conn.isClosed()) {
              
            }
        } catch (SQLException e) {
           
            System.out.println(e.getMessage());
        }
    }

}