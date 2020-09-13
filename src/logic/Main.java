package logic;

public class Main 
{
	private static Buffer buffer; 
	
	private static int NUMERO_THREADS_CLIENTES=10;
	
	private static int NUMERO_THREADS_SERVIDORES =10;
	
	public static void main(String[] args)
	{
		Cliente[] clientes = new Cliente[NUMERO_THREADS_CLIENTES];
		
		for(int i =0; i< NUMERO_THREADS_CLIENTES; i++){
			clientes[i] = new Cliente(0, buffer);
			clientes[i].start();
		}
	}
}
