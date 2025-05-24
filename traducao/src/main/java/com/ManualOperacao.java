package com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManualOperacao {

	Scanner leia = new Scanner(System.in);

	Traducoes tradutor;

	private int id;
    private String titulo;
    private String conteudo;
    private String idioma;
    

	public ManualOperacao(Traducoes tradutor) {
		this.tradutor = tradutor;
	}


	public void cadastrarManual(String idioma) {
		System.out.println(tradutor.get("tituloManualOp"));
		titulo = leia.nextLine();

		System.out.println(tradutor.get("conteudoManualOp"));
		conteudo = leia.nextLine();

		String sql = "INSERT INTO manual_operacao (titulo, conteudo, idioma) VALUES (?, ?, ?)";

		try (Connection conn = Conexao.getConexao(); 
			PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, titulo);
			stmt.setString(2, conteudo);
			stmt.setString(3, idioma);

			int rowsAffected = stmt.executeUpdate();
			System.out.println(" ");

			if (rowsAffected > 0) {
				System.out.println(tradutor.get("sucessoDB"));
			} else {
				System.out.println(tradutor.get("DBnAfetado"));
			}
		} catch (SQLException e) {
			System.out.println(tradutor.get("erroDB"));
			e.printStackTrace();
		}
	}


	public void pesquisaManualTitulo() {
		listarManuais();
		System.out.println(" ");
		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		String sql = "SELECT * FROM manual_operacao WHERE titulo LIKE ?";

		System.out.println(" ");

		try (Connection conn = Conexao.getConexao();
			PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, "%" + pesquisa + "%");
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println(tradutor.get("encontrado"));
				System.out.println(" ");
				System.out.println("Título: " + rs.getString("titulo"));
				System.out.println(" ");
				System.out.println("Idioma: " + rs.getString("idioma"));
				System.out.println(" ");
				System.out.println("Conteúdo: " + rs.getString("conteudo"));
				
			} else {
				System.out.println(tradutor.get("nEncontrado"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(tradutor.get("erroPesqDB"));
		}

		System.out.println(" ");
		System.out.println(tradutor.get("enter"));
		leia.nextLine();
	}


	public void pesquisaManualCodigo() {
		listarManuais();
		System.out.println(" ");
		System.out.println(tradutor.get("codigoPesq"));

		int pesquisaCodigo = -1;
		while (true) {
			try {
				pesquisaCodigo = leia.nextInt();
				leia.nextLine();
				break;
			} catch (InputMismatchException e) {
				System.out.println(tradutor.get("entradaInvalid"));
				leia.nextLine();
			}
		}

		String sql = "SELECT * FROM manual_operacao WHERE id = ?";

		System.out.println(" ");

		try (Connection conn = Conexao.getConexao();
			PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setInt(1, pesquisaCodigo);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println(tradutor.get("encontrado"));
				System.out.println(" ");
				System.out.println("Título: " + rs.getString("titulo"));
				System.out.println(" ");
				System.out.println("Idioma: " + rs.getString("idioma"));
				System.out.println(" ");
				System.out.println("Conteúdo: " + rs.getString("conteudo"));
				
			} else {
				System.out.println(tradutor.get("nEncontrado"));
			}

		} catch (SQLException e) {
			System.out.println(tradutor.get("erroPesqDB"));
			e.printStackTrace();
		}

		System.out.println(" ");
		System.out.println(tradutor.get("enter"));
		leia.nextLine();
	}


	public void editarManual() {
		listarManuais();
		System.out.println(" ");
		System.out.println(tradutor.get("edit"));

		int codigo = -1;
		while (true) {
			try {
				codigo = leia.nextInt();
				leia.nextLine(); 
				break;
			} catch (InputMismatchException e) {
				System.out.println(tradutor.get("entradaInvalid"));
				leia.nextLine();
			}
		}

		String selectSQL = "SELECT * FROM manual_operacao WHERE id = ?";
		try (Connection conn = Conexao.getConexao();
			PreparedStatement selectStmt = conn.prepareStatement(selectSQL)) {

			selectStmt.setInt(1, codigo);
			ResultSet rs = selectStmt.executeQuery();
			System.out.println(" ");

			if (rs.next()) {
				System.out.println(tradutor.get("newTitulo"));
				String novoTitulo = leia.nextLine();

				System.out.println(" ");

				System.out.println(tradutor.get("newConteudo"));
				String novoConteudo = leia.nextLine();

				String updateSQL = "UPDATE manual_operacao SET titulo = ?, conteudo = ? WHERE id = ?";
				try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
					updateStmt.setString(1, novoTitulo);
					updateStmt.setString(2, novoConteudo);
					updateStmt.setInt(3, codigo);

					int linhasAfetadas = updateStmt.executeUpdate();
					System.out.println(" ");

					if (linhasAfetadas > 0) {
						System.out.println(tradutor.get("editSucesso"));
					} else {
						System.out.println(tradutor.get("DBnAfetado"));
					}
				}

			} else {
				System.out.println(tradutor.get("nEncontrado"));
			}

		} catch (SQLException e) {
			System.out.println(tradutor.get("erroDB"));
			e.printStackTrace();
		}

		System.out.println(" ");
		System.out.println(tradutor.get("enter"));
		leia.nextLine();
	}


	public void excluirManual() {
		listarManuais();
		System.out.println(" ");
		System.out.println(tradutor.get("excluir"));

		int codigo = -1;
		while (true) {
			try {
				codigo = leia.nextInt();
				leia.nextLine(); 
				break;
			} catch (InputMismatchException e) {
				System.out.println(tradutor.get("entradaInvalid"));
				leia.nextLine(); 
			}
		}

		String selectSQL = "SELECT * FROM manual_operacao WHERE id = ?";
		try (Connection conn = Conexao.getConexao();
			PreparedStatement selectStmt = conn.prepareStatement(selectSQL)) {

			selectStmt.setInt(1, codigo);
			ResultSet rs = selectStmt.executeQuery();

			if (rs.next()) {
				String deleteSQL = "DELETE FROM manual_operacao WHERE id = ?";
				try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL)) {
					deleteStmt.setInt(1, codigo);
					int linhasAfetadas = deleteStmt.executeUpdate();

					if (linhasAfetadas > 0) {
						System.out.println(tradutor.get("delSucesso"));
					} else {
						System.out.println(tradutor.get("DBnAfetado"));
					}
				}

			} else {
				System.out.println(tradutor.get("delNEncontrado"));
			}

		} catch (SQLException e) {
			System.out.println(tradutor.get("erroDB"));
			e.printStackTrace();
		}

		System.out.println(" ");
		System.out.println(tradutor.get("enter"));
		leia.nextLine();
	}


	public void listarManuais() {
		String sql = "SELECT id, titulo FROM manual_operacao ORDER BY id";

		try (Connection conn = Conexao.getConexao();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery()) {

			System.out.println(tradutor.get("listaOrien"));
			System.out.println("---------------------");
			System.out.printf("%-5s | %s%n", "ID", "Título");
			System.out.println("---------------------");

			while (rs.next()) {
				id = rs.getInt("id");
				titulo = rs.getString("titulo");
				System.out.printf("%-5d | %s%n", id, titulo);
			}
			System.out.println("---------------------");

		} catch (SQLException e) {
			System.out.println(tradutor.get("erroLista"));
			e.printStackTrace();
		}
	}

	//getters e setters
	public int getId() { 
		return id; 
	}
    public void setId(int id) { 
		this.id = id; 
	}

    public String getTitulo() { 
		return titulo; 
	}
    public void setTitulo(String titulo) { 
		this.titulo = titulo; 
	}

    public String getConteudo() { 
		return conteudo; 
	}
    public void setConteudo(String conteudo) { 
		this.conteudo = conteudo; 
	}

    public String getIdioma() { 
		return idioma; 
	}
    public void setIdioma(String idioma) { 
		this.idioma = idioma; 
	}
}