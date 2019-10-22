
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

    public Gerente(){

        this.autenticador = new AutenticacaoUtil();
    }
	
	public double getBonificacao() {
	    return super.getSalario() + (super.getSalario() *  0.1);
	}

	public boolean autentica(int senha) {
	    return autenticador.autentica(senha);
	}

	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}
	
	
}
