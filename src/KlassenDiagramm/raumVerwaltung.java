package KlassenDiagramm;

public class raumVerwaltung {
private Raum[] raum;
    public raumVerwaltung(){
this.raum=new Raum[100];
    }


    public void addRaum(Raum r){
for (int i=0;i< raum.length;i++){
    if (raum[i] == null){
        raum[i]=r;
        break;
    }
}
    }
    public void ausgabeRaumliste(){
        for (int i=0;i< raum.length;i++){
            if(raum[i] != null){
                System.out.println(raum[i].getTrackt()+":"+raum[i].getEtage()+":"+raum[i].getNummer());
                if (raum[i].getNutzer() != null) {
                    System.out.print(" - Professor: " + raum[i].getNutzer().getName());
                }
                System.out.println();
            }
        }
    }
}
