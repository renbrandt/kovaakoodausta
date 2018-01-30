package fi.academy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SanaLaskuri {

   class Tiedot {
        int riveja;
        int sanoja;
        int merkkeja;

        public Tiedot(int riveja, int sanoja, int merkkeja) {
            this.riveja = riveja;
            this.sanoja = sanoja;
            this.merkkeja = merkkeja;
        }
    }

    public static void main(String[] args) {
        SanaLaskuri laskuri = new SanaLaskuri();
        //Tiedot ti = laskuri.new Tiedot(1,2,3);
        String tiedostonNimi = "src/fi/academy/Sanalaskuri.java";
        Tiedot tiedot = laskuri.kasitteleTiedosto(tiedostonNimi);
        System.out.println(String.format("Tiedosto: %s\n\t %d %d %d",
                tiedostonNimi,
                tiedot.riveja,
                tiedot.sanoja,
                tiedot.merkkeja));
    }

    private Tiedot kasitteleTiedosto(String tiedosto) {
        int riveja, sanoja, merkkeja;
        riveja = sanoja = merkkeja = 0;
        try (FileReader fr = new FileReader(tiedosto);
        BufferedReader lukija = new BufferedReader(fr)){
            String rivi;
            while((rivi = lukija.readLine()) != null) {

                riveja++;
                merkkeja += rivi.length();
                sanoja += rivi.split("\\s").length;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Tiedot(riveja, sanoja, merkkeja);
    }
}
