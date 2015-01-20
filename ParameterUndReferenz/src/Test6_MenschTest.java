
public class Test6_MenschTest {
	
	public static void main(String[] args) {
		Test6_Mensch mensch1 = new Test6_Mensch();
		Test6_Mensch mensch2 = null;
		Test6_Mensch mensch3 = null;
		
		mensch1.setGewicht(50);
		
		mensch2 = mensch1;
		//mensch3 = mensch1;
		
		//mensch3 = new Test6_Mensch();
		
		System.out.println(mensch1.getGewicht());
		System.out.println(mensch2.getGewicht());
		System.out.println(mensch3.getGewicht());
		
		mensch1.setGewicht(100);
		
		System.out.println(mensch1.getGewicht());
		System.out.println(mensch2.getGewicht());
		System.out.println(mensch3.getGewicht());
	}

}
