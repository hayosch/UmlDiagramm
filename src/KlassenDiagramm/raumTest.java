package KlassenDiagramm;

import javax.sound.midi.Track;

public class raumTest {
    public static void main(String[] args) {
        Professor prof=new Professor("Konstanten Koll");
        Professor prof2=new Professor("Michael Stark");
        Raum rau=new Raum('C','2',"30");
        Raum rau2=new Raum('C','2',"40",prof);
        Raum rau3=new Raum('C','2',"41",prof2);
        Raum rau4=new Raum('C','2',"02");
        Raum rau5=new Raum('C','2',"03");

        raumVerwaltung n=new raumVerwaltung();
        n.addRaum(rau);
       n.addRaum(rau2);
        n.addRaum(rau3);
        n.addRaum(rau4);
        n.addRaum(rau5);
        n.ausgabeRaumliste();

    }
}
