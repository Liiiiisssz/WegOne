package com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ManualOperacao {

	Scanner leia = new Scanner(System.in);

	Traducoes tradutor;

	int contadorCadastro = 2;
	int contadorCadastroEN = 2;
	int contadorCadastroDE = 2;
	int pesquisaCodigo;
	int indiceCadastro;
	int codigo;

	private int id;
    private String titulo;
    private String conteudo;
    private String idioma;
    

	public ManualOperacao(Traducoes tradutor) {

		this.tradutor = tradutor;
	}


	public void cadastrarManual(String idioma) {

		System.out.println(tradutor.get("tituloManualOp"));
		String titulo = leia.nextLine();

		System.out.println(tradutor.get("conteudoManualOp"));
		String conteudo = leia.nextLine();

		String sql = "INSERT INTO manual_operacao (titulo, conteudo, idioma) VALUES (?, ?, ?)";

		try (Connection conn = Conexao.getConexao(); 
			PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, titulo);
			stmt.setString(2, conteudo);
			stmt.setString(3, idioma);

			int rowsAffected = stmt.executeUpdate();

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

		System.out.println(tradutor.get("tituloPesq"));
		String pesquisa = leia.nextLine();

		String sql = "SELECT * FROM manual_operacao WHERE titulo LIKE ?";

		try (Connection conn = Conexao.getConexao();
			PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, "%" + pesquisa + "%");
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println(tradutor.get("encontrado"));
				System.out.println("Título: " + rs.getString("titulo"));
				System.out.println("Conteúdo: " + rs.getString("conteudo"));
				System.out.println("Idioma: " + rs.getString("idioma"));
			} else {
				System.out.println(tradutor.get("nEncontrado"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(tradutor.get("erroPesqDB"));
		}

		System.out.println(tradutor.get("enter"));
		leia.nextLine();
	}


	public void pesquisaManualCodigo() { //pesquisa CODIGO em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacao.length; i++) {

			if (manualOperacaoConteudo[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("codigoPesq"));
		 while (true) {
                try {
                    pesquisaCodigo = leia.nextInt();  
                   
                    if (pesquisaCodigo >= 0 && pesquisaCodigo <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }
		
		
		boolean encontrado = false;

		System.out.println(" ");

		if (titulosManuaisOperacao[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
			System.out.println(" ");
			System.out.println(titulosManuaisOperacao[pesquisaCodigo]);

			System.out.println(manualOperacaoConteudo[pesquisaCodigo]);
			encontrado = true;

		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}

		System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();
		leia.nextLine();

	}

	public void pesquisaManualCodigoEN() { //pesquisa CODIGO em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacaoEN.length; i++) {

			if (manualOperacaoConteudoEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("codigoPesq"));

		 while (true) {
                try {
                    pesquisaCodigo = leia.nextInt();  
                   
                    if (pesquisaCodigo >= 0 && pesquisaCodigo <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }
		
		
		boolean encontrado = false;

		System.out.println(" ");

		if (titulosManuaisOperacaoEN[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
			System.out.println(" ");
			System.out.println(titulosManuaisOperacaoEN[pesquisaCodigo]);

			System.out.println(manualOperacaoConteudoEN[pesquisaCodigo]);
			encontrado = true;

		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}

		System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();
		leia.nextLine();

	}

	public void pesquisaManualCodigoDE() { //pesquisa CODIGO em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacaoDE.length; i++) {

			if (manualOperacaoConteudoDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("codigoPesq"));
		
		 while (true) {
                try {
                    pesquisaCodigo = leia.nextInt();  
                   
                    if (pesquisaCodigo >= 0 && pesquisaCodigo <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }
		
		
		boolean encontrado = false;

		System.out.println(" ");

		if (titulosManuaisOperacaoDE[pesquisaCodigo] != null) {

			System.out.println(tradutor.get("encontrado"));
			System.out.println(" ");
			System.out.println(titulosManuaisOperacaoDE[pesquisaCodigo]);

			System.out.println(manualOperacaoConteudoDE[pesquisaCodigo]);
			encontrado = true;

		}

		if (!encontrado) {

			System.out.println(tradutor.get("nEncontrado"));

		}

		System.out.println(" ");
        System.out.println(tradutor.get("enter"));
        leia.nextLine();
		leia.nextLine();

	}





	public void editarManual() { //editar em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacao.length; i++) {

			if (manualOperacaoConteudo[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));

		 while (true) {

                try {
                      codigo = leia.nextInt();
                      indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

		System.out.println(" ");

		if (titulosManuaisOperacao[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisOperacao[indiceCadastro] = leia.nextLine();
			titulosManuaisOperacao[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualOperacaoConteudo[indiceCadastro] = leia.nextLine();

			System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

	public void editarManualEN() { //editar em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacaoEN.length; i++) {

			if (manualOperacaoConteudoEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
		
		 while (true) {
                try {
                      codigo = leia.nextInt();
                      indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

		System.out.println(" ");

		if (titulosManuaisOperacaoEN[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisOperacaoEN[indiceCadastro] = leia.nextLine();
			titulosManuaisOperacaoEN[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualOperacaoConteudoEN[indiceCadastro] = leia.nextLine();

			System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}

	public void editarManualDE() { //editar em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacaoDE.length; i++) {

			if (manualOperacaoConteudoDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("edit"));
		
		 while (true) {
                try {
                      codigo = leia.nextInt();
                      indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

		System.out.println(" ");

		if (titulosManuaisOperacaoDE[indiceCadastro] != null) {

			System.out.println(tradutor.get("newTitulo"));
			titulosManuaisOperacaoDE[indiceCadastro] = leia.nextLine();
			titulosManuaisOperacaoDE[indiceCadastro] = leia.nextLine();

			System.out.println(tradutor.get("newConteudo"));
			manualOperacaoConteudoDE[indiceCadastro] = leia.nextLine();

			System.out.println(" ");
			System.out.println(tradutor.get("editSucesso"));

		} else {

			System.out.println(tradutor.get("nEncontrado"));

		}

	}





	public void excluirManual() { //excluir em PT

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacao.length; i++) {

			if (manualOperacaoConteudo[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
		
		  while (true) {
                try {
                     codigo = leia.nextInt();
                     indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

			if (titulosManuaisOperacao[indiceCadastro] != null) {

				for (int i = codigo; i < 3; i++) {
                titulosManuaisOperacao[i] = titulosManuaisOperacao[i + 1];
                manualOperacaoConteudo[i] = manualOperacaoConteudo[i + 1];
            }

            titulosManuaisOperacao[3] = null;
            manualOperacaoConteudo[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastro--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

			} else {

				System.out.println(tradutor.get("delNEncontrado"));

		}

	}

	public void excluirManualEN() { //excluir em INGLES

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacaoEN.length; i++) {

			if (manualOperacaoConteudoEN[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
		
		  while (true) {
                try {
                     codigo = leia.nextInt();
                	 indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

			if (titulosManuaisOperacaoEN[indiceCadastro] != null) {

				for (int i = codigo; i < 3; i++) {
                titulosManuaisOperacaoEN[i] = titulosManuaisOperacaoEN[i + 1];
                manualOperacaoConteudoEN[i] = manualOperacaoConteudoEN[i + 1];
            }

            titulosManuaisOperacaoEN[3] = null;
            manualOperacaoConteudoEN[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastroEN--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

			} else {

				System.out.println(tradutor.get("delNEncontrado"));

		}

	}

	public void excluirManualDE() { //excluir em ALEMÃO

		System.out.println(tradutor.get("codigosCad"));
		for (int i = 0; i < titulosManuaisOperacaoDE.length; i++) {

			if (manualOperacaoConteudoDE[i] != null) {
				System.out.println(i);
			}
		}

		System.out.println(" ");

		System.out.println(tradutor.get("excluir"));
		
		  while (true) {
                try {
                     codigo = leia.nextInt();
                     indiceCadastro = codigo;  
                   
                    if (indiceCadastro >= 0 && indiceCadastro <= 3) {
                        break;  
                    } else {
                        System.out.println(tradutor.get("invalido"));
                    }

                } catch (InputMismatchException e) {
                   
                    System.out.println(tradutor.get("entradaInvalid"));
                    leia.nextLine();
                }
            }

			if (titulosManuaisOperacaoDE[indiceCadastro] != null) {

				for (int i = codigo; i < 3; i++) {
                titulosManuaisOperacaoDE[i] = titulosManuaisOperacaoDE[i + 1];
                manualOperacaoConteudoDE[i] = manualOperacaoConteudoDE[i + 1];
            }

            titulosManuaisOperacaoDE[3] = null;
            manualOperacaoConteudoDE[3] = null;

            System.out.println(tradutor.get("delSucesso"));

            contadorCadastroDE--;

            System.out.println(" ");
            System.out.println(tradutor.get("enter"));
            leia.nextLine();
            leia.nextLine();

			} else {

				System.out.println(tradutor.get("delNEncontrado"));

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