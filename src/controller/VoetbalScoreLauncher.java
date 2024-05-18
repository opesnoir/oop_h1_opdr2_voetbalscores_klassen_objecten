package controller;

import model.Wedstrijd;
import java.util.Scanner;

public class VoetbalScoreLauncher {
    public static void main(String[] args) {

        Wedstrijd eersteWedstrijd = new Wedstrijd("Pec", 5,0);
        eersteWedstrijd.printUitslag();
        eersteWedstrijd.printWedstrijdPunten();

        Scanner input = new Scanner(System.in);
        System.out.println("Wat is de naam van de tegenstander?");
        String inputNaamTegenstander = input.next();

        Wedstrijd tweedeWedstrijd = new Wedstrijd(inputNaamTegenstander);
        System.out.println("Wat is het aantal doelpunten voor jullie?");
        tweedeWedstrijd.voorDoelpunten = input.nextInt();
        System.out.println("Wat is het aantal doelpunten voor de tegenstanders?");
        tweedeWedstrijd.tegenDoelpunten = input.nextInt();

        tweedeWedstrijd.printUitslag();
        tweedeWedstrijd.printWedstrijdPunten();
    }
}
