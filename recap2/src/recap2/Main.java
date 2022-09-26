package recap2;

public class Main {

	public static void main(String[] args) {
		double myList[]= {1.2,2.3,3.4,6.5};
		double total=0;
		double max=myList[0];
		
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println("TOPLAM = " +total);
		System.out.println("EN BÜYÜK SAYI =" +max);

		
	}

}
