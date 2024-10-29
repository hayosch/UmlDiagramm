package KlassenDiagramm2;

public class Manager extends MitArbeiter {
    private double festGehalt,provision,umsatz;
    public Manager(double festGehalt,double provision,String name){
        super(name);
        this.festGehalt=festGehalt;
        this.provision=provision;

    }
    public void setUmsatz(double umsatz){
        this.umsatz=umsatz;
    }
    public double berechneGehalt(){
       return 1;
    }

}
