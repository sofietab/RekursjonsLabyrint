import java.util.ArrayList;
class Opening extends Hvit{

  public Opening (Labyrinth lab, int rad, int kolonne){
    super(lab, rad, kolonne);
}


public String charToTegn(){
  return ".";
}
public void gaa(Rute forrige, ArrayList sti){
  Tuppel denne = new Tuppel(rad, kolonne);
  ArrayList<Tuppel> nySti = new ArrayList<>(sti);
  nySti.add(denne);
  labyrint.settSti(nySti);

  System.out.println("fant utgang!" + " kordinat" + kolonne +" "+ rad);

}

}
