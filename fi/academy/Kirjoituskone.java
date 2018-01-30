package fi.academy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Kirjoituskone {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter (new FileWriter("moikka.txt"))){


            System.out.println("Syötä tekstiä:");
            while(true) {
                String rivi = lukija.nextLine();
                if (rivi.equals("")) {
                    break;
                }

               writer.append(rivi).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
