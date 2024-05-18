package model;

public class Wedstrijd {
    public String naamTegenstander;
    public int voorDoelpunten;
    public int tegenDoelpunten;

    public Wedstrijd() {
        this.naamTegenstander = "onbekend";
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public Wedstrijd(String naamTegenstander) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public int bepaalWedstrijdpunten(){
        if (voorDoelpunten > tegenDoelpunten){
            return 3;
        } else if (voorDoelpunten == tegenDoelpunten) {
            return 2;
        } else {
            return 0;
        }
    }

    public void printUitslag(){
        System.out.printf("Uitslag van de wedstrijd tegen: %s %d - %d \n", naamTegenstander, voorDoelpunten, tegenDoelpunten);
    }

    public void printWedstrijdPunten(){
        System.out.printf("Dit levert %d wedstrijdpunten op.\n", bepaalWedstrijdpunten());
    }

}
