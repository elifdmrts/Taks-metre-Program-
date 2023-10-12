import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double km,tutar,minTutar,acılıs;
        Scanner untıl=new Scanner(System.in);
        System.out.print("Gidilen mesafe:  ");
        km=untıl.nextInt();
        acılıs=10;
        tutar=(acılıs)+(km*2.20);

        if(tutar<20){
            System.out.println("Tutar: 20TL");
        }
else {System.out.println("Tutar= "+tutar+"TL");
}
    }
}