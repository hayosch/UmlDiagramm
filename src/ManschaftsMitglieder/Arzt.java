package ManschaftsMitglieder;

public class Arzt extends Info{
    private String fachRichtung;
    public Arzt(String type,String vorName,String nachName,String fachRichtung){
        super("Arzt",vorName, nachName);
        this.fachRichtung=fachRichtung;
    }
    public String getFachRichtung(){
        return fachRichtung;
    }
    @Override
    public String getSpezifischeEigenschaften(){
        return "Fachrichtung:"+fachRichtung;
    }
    @Override
    public double berechneJahresGehalt(){
        return 120000.00;
    }
}
