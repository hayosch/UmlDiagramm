package KlassenDiagramm2;

public abstract class MitArbeiter {
    private String name;

    private int personalNummer,anzahlMitarbeiter;
    public MitArbeiter(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }
    public abstract double berechneGehalt();

}
