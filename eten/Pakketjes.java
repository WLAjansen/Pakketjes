import fruit.tropisch.kaki;
import fruit.appel;
import koeken.kokoskoeken;
import taarten.chocoladetaart;

public class Pakketjes {
    public static void main(String [] args) {
        System.out.println("Welkom bij de 'Package it' opdracht");

        appel appel = new appel();

        appel.geefPrijsAppel();

        appel.appelEmoji();

        kaki kaki = new kaki();

        kaki.geefPrijsKaki();

        kaki.kakiEmoji();

        kokoskoeken kokoskoeken = new kokoskoeken();

        kokoskoeken.geefPrijsKokoskoeken();

        kokoskoeken.kokoskoekenEmoji();

        chocoladetaart = new chocoladetaart();

        chocoladetaart.geefPrijsChocoladetaart();

        chocoladetaart.chocoladetaartEmoji();
    }
}
