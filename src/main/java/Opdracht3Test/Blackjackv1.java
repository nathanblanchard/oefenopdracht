package Opdracht3Test;

import java.util.Scanner;

/**
 * NOTITIES
 * Welkomstbericht
 * Aantal spelers onder input1 gezet
 *
 * Work in progress..
 * kom hier nog niet zo gemakkelijk uit hoe dit verder aan te pakken/te weinig tijd
 */

public class Blackjackv1 {

    public static void main(String[] args) {

        System.out.println("Welkom in het Casino!" + "\n");

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Met hoeveel spelers wilt u Blackjack spelen?:");
        Integer input1 = Integer.valueOf(sc.nextLine());
        System.out.println(input1);

        int quantityPlayers = input1;
        System.out.println("U heeft gekozen om met " + input1 + " spelers Blackjack te spelen." + "\n");

    }
}