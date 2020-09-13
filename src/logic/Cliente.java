package logic;

public class Cliente extends Thread
{
	
	public static Buffer buffer;
	
	public Cliente(int cantidad, Buffer buffer)
	{
		
		this.buffer = buffer;
	}
	
	public void generarMensaje(String mensaje) throws InterruptedException
	{
		
		
		Mensaje x = new Mensaje(mensaje);
		if (buffer.cuantosClientesHay() <= buffer.darTamano()) 
		{
			buffer.clienteEntro(x);
		}
		else 
		{
			this.wait();
		}
	}
	
	
}
