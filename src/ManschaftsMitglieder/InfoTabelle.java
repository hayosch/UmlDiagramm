package ManschaftsMitglieder;

public class InfoTabelle {
    private Info[] info;
    public InfoTabelle(){
       this.info =new Info[5];
    }
    public void addMitGlieder(Info mitglied) {
        for (int i = 0; i < info.length; i++) {
            if (info[i] == null) {
                info[i] = mitglied;
                break;
            }
        }
    }
    public void printInfo(){
        for (int i=0;i< info.length;i++){
            if(info[i] != null){
                System.out.println(info[i].gettype() + ", " +
                        info[i].getNachName() + ", " +
                        info[i].getVorName() + ", " +
                        info[i].getSpezifischeEigenschaften() + ", " +
                        info[i].berechneJahresGehalt());
            }
        }
    }
}
