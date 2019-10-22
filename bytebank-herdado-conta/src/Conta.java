

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero){
	    this.agencia = agencia;
	    this.numero = numero;
//	    this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
	    System.out.println("Estou criando uma conta");
	    total++;
	}
    
    public abstract void deposita(double valor);
    
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);    
            return true;
        }
        return false;
    }
    
    public static int getTotal(){
        return Conta.total;
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    
}
