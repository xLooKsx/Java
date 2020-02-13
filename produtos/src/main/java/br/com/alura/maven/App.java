package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Produto produto = new Produto("jujuba", 3.50);
    	System.out.println("O produto é "+produto.getNome()+", com um preço de "+produto.getPreco());
    }
}
