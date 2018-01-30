package fi.academy;

public class PalindromiTesti {
    public static void main(String[] args) {
        String[] sanat = {"abba", "saippuakauppias", "sana", "er no", "er ro", "er,re", "sana anas"};
        Palindromi p = new Palindromi();

        for(String sana : sanat) {

            System.out.println(String.format("'%s' %s palindromi",
                    sana, p.onkoPalindromi2(sana) ? "on" : "ei ole"));
        }
        // Erilainen if -lause
        // EHTO ? jos TRUE : jos FALSE
        // int suurempi = 2 < 3 ? 3 : 2
        //int luku =4, luku2 = 5;
        //int pienempi = luku < luku ? luku : luku2;
    }
}
