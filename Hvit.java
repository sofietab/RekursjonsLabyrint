import java.util.ArrayList;
class Hvit extends Rute{



public Hvit (Labyrinth lab, int rad, int kolonne){
  super(lab, rad, kolonne);
}

public String charToTegn(){
  return ".";
}

public void gaa(Rute forrige, ArrayList sti){
  Tuppel denne = new Tuppel(rad, kolonne);
  ArrayList<Tuppel> nySti = new ArrayList<>(sti);
  nySti.add(denne);

  //System.out.println("hvit rute " + rad +" "+kolonne);
if (opp != null && opp!= forrige){
  //System.out.println("går opp");
  opp.gaa(this, nySti);
}
if (ned != null&& ned!= forrige){
  //System.out.println("går ned");
  ned.gaa(this, nySti);
}
if (hoyre != null&& hoyre!= forrige){
  //System.out.println("går hoyre");
  hoyre.gaa(this, nySti);
}
if (venstre != null&& venstre!= forrige){
  //System.out.println("går venstre");
  venstre.gaa(this, nySti);
}
}
public void finnUtvei(){
  //Tuppel denne = new Tuppel(rad, kolonne);
  ArrayList<Tuppel> nySti = new ArrayList<>();
  //nySti.add(denne);

gaa(this, nySti);
}
}
