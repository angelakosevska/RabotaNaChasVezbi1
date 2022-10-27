package vezba6;

public class Smetka {

	public static void main(String[] args) {
		String article1="chokolado";
		String price1 ="50";
		String quantity="5";
		String article2="sok";
		String price2="35";
		String unit="denar";
		
		int chokoPrice=  Integer.parseInt(price1)*Integer.parseInt(quantity);
		int juicePrice= Integer.parseInt(price2) * Integer.parseInt(quantity);
		int totalPrice= chokoPrice + juicePrice;
		
		System.out.println("Smetka: ");
		System.out.println("Edno "+ article1+"-"+price1+" "+unit+"i. ");
		System.out.println(price1+" x "+quantity+" = "+chokoPrice );
		System.out.println("Eden "+ article2+"-"+price2+" "+unit+"i. ");
		System.out.println(price2+" x "+quantity+" = "+juicePrice );
		System.out.println("Vkupna cena: "+ totalPrice);
	}

}
