package ManschaftsMitglieder;

public class Trainer extends Info {
    private Spieler lieblingsSpiele;
    public Trainer(String typ,String vorName,String nachName,
                   Spieler lieblingsSpiele){
        super("Trainer",vorName,nachName);
        this.lieblingsSpiele=lieblingsSpiele;
    }
    public Spieler getLieblingsSpiele(){
        return lieblingsSpiele;
    }
    @Override
    public String getSpezifischeEigenschaften(){
        return "Lieblingsspieler:"  + lieblingsSpiele ;
    }
    @Override
    public double berechneJahresGehalt(){
        return 1980000.00;
    }

}
