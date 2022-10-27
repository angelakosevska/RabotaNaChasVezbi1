package vezba5;

public class Temperatura {

	public static void main(String[] args) {
		String unit="stepen";
		String value="2.5";
		double temperature= Double.parseDouble(value);
		System.out.println("Temperaturata iznesuva "+(int)(temperature*10)+" "+unit+"i.");
	}

}
