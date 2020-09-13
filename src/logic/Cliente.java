package logic;

public class Cliente extends Thread
{
	
	public static Buffer buffer;
	
	public int id;
	
	public int cantidad;
	
	public Cliente(int cantidad, Buffer buffer)
	{
		this.cantidad = cantidad;
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
	
	public void run(){
		
		try {
			generarMensaje("La cantidad de mensajes del cliente "+id+" es de: "+ cantidad);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	
	
}
