public class SistemaInterno {
	
	private int senha = 111;
	
	public void autentica(Autenticavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);		
		if (autenticou) {
			System.out.println("Senha correta!");
		} else {
			System.out.println("Senha incorreta!");
		}
	}
}
