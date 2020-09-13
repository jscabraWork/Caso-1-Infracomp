package logic;

public class Servidor extends Thread 
{
	
	public static Buffer buffer;
	

	
	public Servidor(Buffer buffer){
		
		this.buffer = buffer;
	}
	
	

	
	public synchronized void leerMensaje(){
		
		while(buffer.getMensajes().length >0){
		buffer.leerMensaje();
		Thread.yield();
		
		}
	}
	
	public void run()
	{
		leerMensaje();
	}
	

}
