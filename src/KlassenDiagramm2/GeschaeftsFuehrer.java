package KlassenDiagramm2;

public class GeschaeftsFuehrer extends Manager{
    private double zulage;
    public GeschaeftsFuehrer(String name, double festGehalt, double provision, double zulage){
        super(festGehalt, provision, name);
        this.zulage=zulage;
    }
    @Override
    public double berechneGehalt(){
        return 3;
    }
}
