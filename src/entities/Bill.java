package entities;

public class Bill {
	public char gender;
	public int beer, barbecue, softDrink;
	
	public double feeding() {
		return beer * 5 + barbecue * 7 + softDrink * 3;
	}
	
	public double cover() {
		if (feeding() > 30) {
			return 0;
		} else {
			return 4;
		}
	}
	
	public double ticket() {
		if (gender == 'M') {
			return 10;
		} else {
			return 8;
		}
	}
	
	public double total() {
		return ticket() + cover() + feeding();
	}
	
	public String toString() {
		return String.format("RELATÓRIO%nConsumo = %.2f %nCouvert = %.2f %nIngresso = %.2f %n%nValor a pagar = $ %.2f", 
				feeding(), cover(), ticket(), total());
	}
}
