package ManschaftsMitglieder;

public class MitGliederTest {
    public static void main(String[] args) {
        InfoTabelle tabelle= new InfoTabelle();
        Spieler spieler=new Spieler("spieler","Götze","Mario","MittelFeld",5);
        Spieler spieler2=new Spieler("spieler","Aubameyang","Perre-Emerik","Sturm",18);
        Trainer trainer=new Trainer("trainer","Tuchel","Thomas",spieler2);
        Arzt arzt=  new Arzt("Arzt","Braun","Markus","Orthopädie");
        tabelle.addMitGlieder(spieler);
        tabelle.addMitGlieder(spieler2);
        tabelle.addMitGlieder(trainer);
        tabelle.addMitGlieder(arzt);
        tabelle.printInfo();
    }

}
