package ateriointi;

public class Main {

	public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        System.out.println("Opettaja:");
        opettaja.aterioi();
        
        AterioivaOtus opiskelija = new Opiskelija();
        System.out.println("Opiskelija:");
        opiskelija.aterioi();
        
        AterioivaOtus rehtori = new Rehtori();
        System.out.println("Rehtori:");
        rehtori.aterioi();
	}

}
