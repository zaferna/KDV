import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double KdvOranYuksek, KdvOranAz, KdvTutar, Tutar;
        KdvOranYuksek = 0.18;
        KdvOranAz = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.printf("Ucreti Giriniz...:");
        Tutar = input.nextDouble();
        Boolean Tutar1 = Tutar >= 1000;
        KdvTutar = Tutar1 ? KdvOranAz * Tutar : KdvOranYuksek * Tutar;

        System.out.printf("KDV'siz Fiyat:");
         System.out.println(Tutar);
        System.out.printf("KDV'li Fiyat:");
         System.out.println(KdvTutar+Tutar);
        System.out.printf("KDV Tutari:");
         System.out.println(KdvTutar);


    }

    }

