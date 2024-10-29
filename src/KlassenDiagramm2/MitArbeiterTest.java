package KlassenDiagramm2;

public class MitArbeiterTest {
    public static void main(String[] args) {
        Manager k=new Manager(1000,30,"lubna");
        GeschaeftsFuehrer n=new GeschaeftsFuehrer("Heba",2000,40,60);
        Manager h=new Manager(3000,20,"Anas");
        Arbeiter l=new Arbeiter("Leen",18,35,8,9);
k.berechneGehalt();
        System.out.println(k);
        System.out.println(n);
        System.out.println(h);
        System.out.println(l);
    }
}
