package KlassenDiagramm;

public class Raum {
    private char trackt,etage;
    private String nummer;
    private Professor prof;
    private Professor nutzer;
    public Raum(char trackt, char etage, String nummer, Professor prof){
      //  super();
        this.trackt=trackt;
       this.etage=etage;
       this.nummer=nummer;
    }

    public Raum(char c, char etage, String number) {
    }

    public char getTrackt() {
        return trackt;
    }

    public char getEtage() {
        return etage;
    }

    public String getNummer() {
        return nummer;
    }
   public void setNutzer(Professor prof){
        this.prof=prof;
    }

  public Professor getNutzer(){
      return nutzer;
  }
  public void removeNutzer(){
        this.nutzer=null;
  }

}
