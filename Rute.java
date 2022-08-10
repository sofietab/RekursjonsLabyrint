import java.util.ArrayList;

abstract class Rute {
Labyrinth labyrint;
int rad;
int kolonne;
Rute opp;
Rute ned;
Rute hoyre;
Rute venstre;

public Rute (Labyrinth lab, int rad, int kolonne){
  labyrint=lab;
  this.rad=rad;
  this.kolonne=kolonne;
  int[] kordinater={rad, kolonne};

}
//Labyrinth
//kordinater - rad kolonne
//naboer - nord - syd - øst - vest
//char to int
public abstract String charToTegn();
public abstract void gaa(Rute forrige, ArrayList sti);

public void settOpp(Rute opp){
  this.opp=opp;
}
public void settNed(Rute ned){
  this.ned=ned;
}
public void settVenstre(Rute venstre){
  this.venstre=venstre;
}
public void settHoyre(Rute hoyre){
  this.hoyre=hoyre;
}
public abstract void finnUtvei();


}
