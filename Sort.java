import java.util.ArrayList;

class Sort extends Rute{



  public Sort (Labyrinth lab, int rad, int kolonne){
    super(lab, rad, kolonne);
}

public String charToTegn(){
  return "#";
}
public void gaa(Rute forrige, ArrayList sti){
//System.out.println("sort rute " + rad +" "+kolonne);
  return;
}
public void finnUtvei(){
  Tuppel denne = new Tuppel(rad, kolonne);
  ArrayList<Tuppel> nySti = new ArrayList<>();
  nySti.add(denne);
}
}
