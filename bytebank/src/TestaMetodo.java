public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaIzabele = new Conta(1332,25896);
		contaDaIzabele.deposita(100);
		contaDaIzabele.deposita(50);
		System.out.println(contaDaIzabele.getSaldo());

		boolean conseguiuRetirar = contaDaIzabele.saca(20);
		System.out.println(contaDaIzabele.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(1332,123456);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaIzabele);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDaIzabele.getSaldo());
	}

}