package logic;

public class Mensaje 
{
	private String mensaje;
	
	private Cliente cliente;

	
	public Mensaje(String mensaje, Cliente cliente)
	{
		this.mensaje = mensaje;
		this.cliente = cliente;
	}
	
	public String darMensaje()
	{
		return mensaje;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	
	
}
