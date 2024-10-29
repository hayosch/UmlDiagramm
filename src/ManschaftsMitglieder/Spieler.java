package ManschaftsMitglieder;

public class Spieler extends Info{
    private String position;
    private int Spieleinsätze;
    public Spieler(String typ,String vorName,String nachName,String position,
                   int Spieleeinsätze){
        super("Spieler",vorName,nachName);
        this.position=position;
        this.Spieleinsätze=Spieleeinsätze;
    }
    public String getPosition(){
        return position;
    }
    public int getSpieleinsätze(){
        return Spieleinsätze;
    }
    @Override
    public String getSpezifischeEigenschaften(){
        return "Position:"+position+",Spieleinsätze:"+Spieleinsätze;
    }
    @Override
    public double berechneJahresGehalt(){
        return 2185000.00+2250000.00;
    }
}
