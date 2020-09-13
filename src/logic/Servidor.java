package logic;

public class Servidor extends Thread 
{
	
	public static Buffer buffer;
	

	
	public Servidor(Buffer buffer){
		
		this.buffer = buffer;
	}
	
	

	
	public synchronized void leerMensaje(){
		
		buffer.leerMensaje();
	}

}
