package fiap;
import java.sql.*;
import java.util.*;

public class TesteBD {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		//Carro cb = new Carro();
		CarroDAO cdao = new CarroDAO(con);
		
		//Testando método inserir
		//cb.setPlaca("GTA2001");
		//cb.setCor("Preto");
		//cb.setDescricao("Carro 3");
		//System.out.println(cdao.inserir(cb));
		
		//Testando método alterar
		//cb.setPlaca("JKK1900");
		//cb.setCor("Branco");
		//cb.setDescricao("Carro 1");
		//System.out.println(cdao.alterar(cb));
		
		//testando método excluir
		//cb.setPlaca("JKK1900");
		//System.out.println(cdao.alterar(cb));
		
		//testando método listarTodos
		ArrayList<Carro> lista = cdao.listarTodos();
		if (lista != null) {
			for (Carro carro : lista) {
				System.out.println("Placa: " + carro.getPlaca());
				System.out.println("Cor: " + carro.getCor());
				System.out.println("Descricao: " + carro.getDescricao());
			}
		}
		
		Conexao.fecharConexao(con);
	}

}
