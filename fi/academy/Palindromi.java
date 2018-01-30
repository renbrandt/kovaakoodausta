package fi.academy;

import java.util.Scanner;

public class Palindromi {
    private Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Syötä palindromiehdokas");
        Palindromi palindromi = new Palindromi();
        String teksti = palindromi.lueTeksti();


        boolean onko = palindromi.onkoPalindromi2(teksti);
        if (onko) {
            System.out.println(teksti + " on palindromi");
        } else {
            System.out.println(teksti +" ei ole palindromi");
        }
    }

    public String lueTeksti() {
        String luettu = lukija.nextLine();
        return luettu;
    }

    public boolean onkoPalindromi1(String kandidaatti) {
            kandidaatti = kandidaatti.toLowerCase();
            StringBuilder kopio = new StringBuilder(kandidaatti);
            String kopioKaannettu = kopio.reverse().toString();
            if (kandidaatti.equals(kopioKaannettu))
                return true;
            return false;
    }

    public boolean onkoPalindromi2(String kandidaatti) {
        kandidaatti = kandidaatti.toLowerCase();
        for (int i = 0; i < kandidaatti.length()/2; i++) {
            char alku = kandidaatti.charAt(i);
            char loppu = kandidaatti.charAt(kandidaatti.length()-(i+1));
            if (alku != loppu) {
                return false;
            }

        } return true;
    }

}
