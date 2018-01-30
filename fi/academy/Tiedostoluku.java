package fi.academy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


public class Tiedostoluku {
    public static void main(String[] args) {
        Scanner lukija = new Scanner (System.in);

        Path dir = Paths.get(".");
        Stream<Path> virta = null;
        try {
            virta = Files.list(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        virta.filter(Files::isRegularFile)
                .map(p->p.getFileName())
                .forEach(System.out::println);

        System.out.println("mikä tiedosto:");

    String tiedosto = lukija.nextLine();
    String tulos = null;

    int rivit = 0;
    int merkit = 0;
    int sanat = 0;

    try (FileReader fr = new FileReader(tiedosto);
    BufferedReader in = new BufferedReader(fr)){
        StringBuilder teksti = new StringBuilder();
        String rivi;
        while ((rivi = in.readLine()) != null) {
            teksti.append(rivi).append("\n");
            rivit++;
            merkit = merkit +rivi.length();


        }
        tulos = teksti.toString();
        String [] palat = tulos.split("\\s");
        sanat += palat.length;

        System.out.println(tulos);
    } catch (FileNotFoundException ex) {
        System.out.println("Virhe: tiedostoa ei löytynyt");
    } catch (IOException ex) {
        System.out.println("Virhe: muu virhe lukiessa");
    }
        System.out.println(merkit +" merkkiä");
        System.out.println(rivit+" riviä");
        System.out.println(sanat+" sanaa");

}
}
