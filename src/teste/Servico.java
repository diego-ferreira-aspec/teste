package teste;

public class Servico {
	public void salvar() {
		validar("salvar");
		System.out.println("salvo!");
	}
	
	public void validar(String msg) {
		System.out.println("validando... "+msg);
	}
}
