package ManschaftsMitglieder;

public abstract class Info {
    private String vorName;
    private String nachName;
    private String type;
    private String SpezifischeEigenschaften;
    public Info(String type,String vorName,String nachName){
        this.type=type;
        this.vorName=vorName;
        this.nachName=nachName;


    }
    public String getVorName(){
        return vorName;
    }
    public String getNachName(){
        return nachName;
    }
   /* public String toString(){
        return this.vorName+""+this.nachName;
    }*/
    public String gettype(){
        return type;
    }


    public abstract String getSpezifischeEigenschaften();
   public abstract double berechneJahresGehalt();

}
