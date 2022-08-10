import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class HovedProgram{
    // 2021  Versjon 1.0
    public static void main(String[] args) {
        String filnavn = null;
        if (args.length > 0) {
            filnavn = args[0];
        } else {
            System.out.println("FEIL! Riktig bruk av programmet: "
                               +"java Oblig6 <Labyrintfil>");
            return;
        }
        File fil = new File(filnavn);
        Labyrinth l = null;
        try {
            l = new Labyrinth(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        //l.skrivUt();
        //l.finnUtveiFra(5, 3);
        //l.finnUtveiFra(5, 1);
      //  les start-koordinater fra standard input
        Scanner inn = new Scanner(System.in);
        System.out.println("Skriv inn koordinater <kolonne> <rad> ('a' for aa avslutte)");
        String[] ord = inn.nextLine().split(" ");
        while (!ord[0].equals("a")) {
            try {
                int startKol = Integer.parseInt(ord[0]);
                int startRad = Integer.parseInt(ord[1]);
                System.out.println("Utveier:");
                ArrayList<ArrayList<Tuppel>> utveier = l.finnUtveiFra(startKol, startRad);
                for (ArrayList<Tuppel> lis: utveier) {
                    for(Tuppel t: lis)
                        System.out.println(t);
                    System.out.println();
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Ugyldig input!");
            }
            System.out.println("Skriv inn nye koordinater ('a' for aa avslutte)");
            ord = inn.nextLine().split(" ");

        }
    }
}
