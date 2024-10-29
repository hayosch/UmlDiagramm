package KlassenDiagramm2;
public class angestellter extends MitArbeiter {
  private double grungGehalt,ortsZuschlag,zulage;
  public angestellter(String name,double grungGehalt
  ,double ortsZuschlag,double zulage){
      super(name);
      this.grungGehalt=grungGehalt;
      this.ortsZuschlag=ortsZuschlag;
      this.zulage=zulage;
  }


  @Override
    public double berechneGehalt(){
      return 5;
  }
}
