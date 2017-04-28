
public class Principal {

	public static void main(String[] args) {
		
		Microondas mic = new Microondas();
		
		mic.ligar();
		System.out.println(mic.ligado);
		mic.desligar();
		System.out.println(mic.ligado);
		mic.abrirPorta();
		System.out.println(mic.portaFechada);
		mic.ligar();
		System.out.println(mic.ligado);
		
	}

}
