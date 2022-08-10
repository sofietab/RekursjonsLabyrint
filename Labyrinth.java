import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;


class Labyrinth  {

private Rute[][] labyrint;
private int antallKolonner;
private int antallRader;
private static File fil;
private ArrayList<ArrayList<Tuppel>> stier = new ArrayList<ArrayList<Tuppel>>();


public Labyrinth(File fil)throws FileNotFoundException{
  this.fil=fil;
  System.out.println("konstruktør");
lesFraFil(this.fil);
}
private void lesFraFil(File fil)throws FileNotFoundException{
  System.out.println("lesfrafil");
  Scanner data = new Scanner(fil);
  String[] str = data.nextLine().split(" ");
        antallRader = Integer.parseInt(str[0]);
        antallKolonner = Integer.parseInt(str[1]);

        //System.out.println(antallRader + antallKolonner);

        labyrint = new Rute[antallRader][antallKolonner];


        for (int r = 0; r < antallRader; r++) {
            String linje = data.nextLine();
            for (int kol = 0; kol < antallKolonner; kol++) {

                if (linje.charAt(kol)== '.' ){
                  //System.out.println("1.if");
                  if (kol==0||kol==antallKolonner-1||r ==0||r==antallRader-1){
                    //System.out.println("2.if");
                    Opening ny = new Opening(this, r, kol);
                    labyrint [r][kol] = ny;
                    //System.out.println(ny.charToTegn());
                  }
                    else{
                    //  System.out.println("1.else");
                    Hvit ny = new Hvit(this, r, kol);
                    labyrint [r][kol] = ny;
                    //System.out.println(ny.charToTegn());
                }
              }
              else{
                //System.out.println("2.else");
                Sort ny = new Sort(this, r, kol);
                labyrint [r][kol] = ny;
                //System.out.println(ny.charToTegn());
              }



            }
        }
finnNabo();
    }
public void skrivUt(){
  for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++) {
                    System.out.print(labyrint[i][j].charToTegn());






}
System.out.println();
}
System.out.println();
}



public void finnNabo(){

  for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++){

              Rute denne = labyrint[i][j];
            if (j!=0){
              Rute opp=labyrint[i][j-1];
              denne.settOpp(opp);
            }
            if (j!=antallKolonner-1){
              Rute ned=labyrint[i][j+1];
              denne.settNed(ned);
            }
            if (i!=0){
              Rute venstre=labyrint[i-1][j];
              denne.settVenstre(venstre);
            }
            if (i!=antallRader-1){
              Rute hoyre=labyrint[i+1][j];
              denne.settHoyre(hoyre);
            }

            }

  }
}
public ArrayList finnUtveiFra(int kolonne, int rad){
  Rute denne = labyrint[rad][kolonne];
  denne.finnUtvei();
  return stier;
}

public void settSti(ArrayList<Tuppel> ferdig){
stier.add(ferdig);
}
}
