package fi.academy;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Hakemistolistaus {

    public static void main(String[] args) {

        Path dir = Paths.get("./src/fi/academy");
        Stream<Path> virta = null;
        try {
            virta = Files.list(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        virta.filter(Files::isRegularFile)
                .map(p->p.getFileName())
                .forEach(System.out::println);
        }

/*
        File polku = new File(".");
        String[] tiedostot = polku.list();
        for (int i = 0; i < tiedostot.length; i++) {

            System.out.println((new File(tiedostot[i]).getName()));
        }
    }*/

}

