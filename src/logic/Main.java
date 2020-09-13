package logic;

public class Main 
{
	private static Buffer buffer; 
	
	private static int NUMERO_THREADS=10;
	

	
	public static void main(String[] args)
	{
		Cliente[] clientes = new Cliente[NUMERO_THREADS];
		Servidor[]servidores = new Servidor [NUMERO_THREADS];
		for(int i =0; i< NUMERO_THREADS; i++)
		{
			clientes[i] = new Cliente(0, buffer);
			servidores[i] = new Servidor(buffer);
			clientes[i].start();
		}
		
		
	}
}
