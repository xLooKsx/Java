
public class TesteConexao {

	public static void main(String[] args) {
		
		
		try(Conexao conexao = new Conexao() ){
		    conexao.leDados();
		} catch( Exception ex){
		    System.out.println("Deu erro na conex�o");
		}

	}

}
