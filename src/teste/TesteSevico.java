package teste;

public class TesteSevico {
	public static void main(String[] args) {
		
		Servico servico = new Servico() {
			public void validar(String msg) {
				super.validar(msg);
				System.out.println("teste");
			}
		};
		servico.salvar();
		
	}
}
