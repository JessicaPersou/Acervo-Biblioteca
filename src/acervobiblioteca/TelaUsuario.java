package acervobiblioteca;

import java.util.Scanner;

public class TelaUsuario {

	public static void main(String[] args) {
		
		String login, senha;
		int opcaoA;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Biblioteca Generation");
		
		//criar objeto cliente
		Cliente c1 = new Cliente();
		
		//realizar login
		System.out.print("Login: ");
		login = ler.next();
		System.out.print("Senha: ");
		senha = ler.next();
		
		
		
		//se usu�rio e senha corretos
		if(login.equals("teste")&&senha.equals("123")) // o == n�o funciona para variavel string
		{
			System.out.println("Bem vinde "+login+"!");
			
			//chamar m�todo consultarAcervo 
			c1.consultarAcervo();  //ATEN��O! M�TODO N�O TEM NADA AINDA
			
			//Depois que mostrar o acervo, mostrar as op��es de a��o
			System.out.println("Digite 1 para RETIRAR o livro. "
					+ "\nDigite 2 para DEVOLVER o livro."
					+ "\nInforme a op��o desejada: ");
			opcaoA = ler.nextInt();
			//Se opcao 1, chamar m�todo retirarLivro
			if(opcaoA==1)
			{
				c1.retirarLivro(); //ATEN��O! M�TODO N�O TEM NADA AINDA
			}
			//Se opcao 2, chamar m�todo devolverLivro
			else if(opcaoA==2)
			{
				c1.devolverLivro();
			}
			
		}
		
		//se a senha for incorreta
		else
		{
			System.out.println("Login ou senha incorretos. Tente novamente.");
		}
		
	}

}
