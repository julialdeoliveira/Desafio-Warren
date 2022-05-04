public class desafio1 {
	
	public static void main(String[] args) {
		
		int n;
		int nn;
		int inverso;

		for( n = 10; n < 1000000; n++) {
			nn = n;
			inverso = 0;

			while (nn > 0) {
				inverso = (inverso * 10) + (nn % 10);
				nn = nn / 10;
			}
			int soma = inverso + n;
			if (soma % 2 != 0) {
				if (inverso > n) {
					System.out.println(soma);
				}
			}
		}
	}
}