package logic;

public class Buffer 
{
	private int tamano; 
	
	private Mensaje[] mensajes;
	
	private int contadorClientes;
	
	public Buffer(int tamano)
	{
		this.tamano = tamano; 
		mensajes = new Mensaje[tamano];
		contadorClientes = 0;
	}
	
	public int darTamano()
	{
		return tamano;
	}
	
	public Mensaje[] getMensajes(){
		return mensajes;
	}
	
	public void clienteEntro(Mensaje mensaje)
	{
		contadorClientes++;
		mensajes[contadorClientes] = mensaje;
	}
	
	public void clienteSalio()
	{
		contadorClientes--;
	}
	
	public int cuantosClientesHay()
	{
		return contadorClientes;
	}
}
