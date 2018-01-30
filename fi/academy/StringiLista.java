package fi.academy;

import java.util.ArrayList;

public class StringiLista {

    public static void main(String[] args) {
        int ika = 0;
        ArrayList<Henkilo> henkilot = new ArrayList<>();


        Henkilo simo = new Henkilo("Simo", "Saaski", 12);
        henkilot.add(simo);
        Henkilo esko = new Henkilo("Esko", "Aho", 55);
        henkilot.add(esko);
        Henkilo sauli = new Henkilo("Sauli", "Saaski", 45);
        henkilot.add(sauli);
        Henkilo tarja = new Henkilo("Tarja", "Tarhamaki", 24);
        henkilot.add(tarja);
        Henkilo laura = new Henkilo("Laura", "Luumuinen", 22);
        henkilot.add(laura);


        for (int i = 0; i < henkilot.size() ; i++) {
            Henkilo tempHenkilo = new Henkilo("a", "b", 0);
            tempHenkilo = henkilot.get(i);
            ika += tempHenkilo.getIka();
            System.out.println(tempHenkilo);
        }
        boolean loytyyko;
        Henkilo temppi = new Henkilo ("matti", "Pekka", 22);

        if (henkilot.contains(temppi)) {
            System.out.println(temppi + " löytyy!");
        } else {
            System.out.println(temppi + " ei löydy");
        }
        System.out.println(ika);






    }
}


