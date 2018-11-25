/**
 * NOTITIES
 * Work in progress...
 * Robijn wasverzachter, Brinta en Chinese groenten erin gezet.
 *
 * Nog te doen:
 * kortingen doorvoeren
 * kwark en luiers toevoegen
 * verwijderen van producten uitwerken
 */

package Opdracht2Test;

import java.util.Scanner;

public class Supermarktv1 {

    public static void main(String[] args) {

        System.out.println("Welkom in de supermarkt!" + "\n");

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Hoeveel Robijn Wasverzachter wilt u in uw winkelwagen doen?:");
        Integer inputQ1 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ1);

        System.out.println("Hoeveel Brinta wilt u kopen wilt u in uw winkelwagen doen?:");
        Integer inputQ2 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ2);

        System.out.println("Hoeveel pakken Chinese groenten wilt u in uw winkelwagen doen?:");
        Integer inputQ3 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ3);

        //input van de scanner naar totaal berekend
        int amountRobijn = inputQ1;
        double price1 = 3.00;
        double totaalAankoop1 = amountRobijn * price1;

        //input van de scanner naar totaal berekend
        int amountBrinta = inputQ2;
        double price2 = 2.50;
        double totaalAankoop2 = amountBrinta * price2;

        //input van de scanner naar totaal berekend
        int amountChineseGroenten = inputQ3;
        double price3 = 5.00;
        double totaalAankoop3 = amountChineseGroenten * price3;

        // klant, product1 en product2
        String custName = "U";
        String itemDesc1 = "Robijn";
        String itemDesc2 = "Brinta";
        String itemDesc3 = "Chinese Groenten";
        String message;

        // Declare and initialize numeric field: tax
        // Declare subtotal field
        double tax = 0.21;
        double total;
        double subtotal = (totaalAankoop1) + (totaalAankoop2) + (totaalAankoop3);

        // Beschrijving aankoop producten en hoeveelheden
        message = custName + " moet het volgende betalen aan de kassa: " + "\n"
                + inputQ1 + "x" + " " + itemDesc1 + " voor: € " + totaalAankoop1 + "\n"
                + inputQ2 + "x" + " " + itemDesc2 + " voor: € " + totaalAankoop2 + "\n"
                + inputQ3 + "x" + " " + itemDesc3 + " voor: € " + totaalAankoop3 + "\n"
        ;
        System.out.print(message);
        System.out.println("-----------------------");
        System.out.println("Subtotaal excl. btw: " + subtotal);

        // voeg btw 21% toe over het subtotaal
        total = subtotal * (1 + tax);
        System.out.println("Totaal incl. 21% btw: € " + total);
    }
}



