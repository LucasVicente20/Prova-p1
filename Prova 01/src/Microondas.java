
public class Microondas {

	public String ligado;
	public String portaFechada;

	public String ligar() {
		
		ligado = "ligado";
		if(portaFechada =="SIM"){

		return ligado;
		}else {
			System.out.println("NAO PODE LIGAR");
		}
		return ligado;
		
	 	
		

	}

	public String desligar() {

		ligado = "desligado";
		return ligado;
	}

	public String abrirPorta() {

		portaFechada = "NAO";
		return portaFechada;

	}

	public String fecharPorta() {

		portaFechada = "SIM";
		return portaFechada;

	}

	

}
