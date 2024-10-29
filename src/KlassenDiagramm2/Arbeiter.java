package KlassenDiagramm2;

public class Arbeiter extends MitArbeiter {
    private double stundenLohn,anzahlStunden,ueberStundenZuschlag,anzahlUberStunden;

    public Arbeiter(String name, double stundenLohn, double anzahlStunden,
                    double ueberStundenZuschlag, double anzahlUberStunden){
        super(name);
        this.stundenLohn=stundenLohn;
        this.anzahlStunden=anzahlStunden;
        this.anzahlUberStunden=anzahlUberStunden;
        this.ueberStundenZuschlag=ueberStundenZuschlag;
    }
    public void setAnzahlUberStunden(double anzahlUberStunden){
        this.anzahlUberStunden=anzahlUberStunden;
    }

    @Override
    public double berechneGehalt() {
        return 0;
    }
}
