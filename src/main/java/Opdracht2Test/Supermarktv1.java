/**
 * NOTITIES
 * Work in progress...
 * Robijn wasverzachter, Brinta, Chinese groenten, kwark en luiers erin gezet.
 * DecimalFormatter gebruikt om af te ronden op 2 decimalen
 *
 * Nog te doen:
 * kortingen doorvoeren, en op woensdagen aanbieding
 * korter opschrijven (sub)totaal dmv loop
 * verwijderen van producten uitwerken
 */

package Opdracht2Test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Supermarktv1 {

    public static void main(String[] args) {

        System.out.println("Welkom in de supermarkt!" + "\n");

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Hoeveel Robijn Wasverzachter wilt u in uw winkelwagen doen?:");
        Integer inputQ1 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ1);

        System.out.println("Hoeveel Brinta wilt u in uw winkelwagen doen?:");
        Integer inputQ2 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ2);

        System.out.println("Hoeveel pakken Chinese groenten wilt u in uw winkelwagen doen?:");
        Integer inputQ3 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ3);

        System.out.println("Hoeveel bakjes kwark wilt u in uw winkelwagen doen?:");
        Integer inputQ4 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ4);

        System.out.println("Hoeveel luiers wilt u in uw winkelwagen doen?:");
        Integer inputQ5 = Integer.valueOf(sc.nextLine());
        System.out.println(inputQ5);

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

        //input van de scanner naar totaal berekend
        int amountKwark = inputQ4;
        double price4 = 2.00;
        double totaalAankoop4 = amountKwark * price4;

        //input van de scanner naar totaal berekend
        int amountLuiers = inputQ5;
        double price5 = 10.00;
        double totaalAankoop5 = amountLuiers * price5;

        // klant, product1,2,3
        String custName = "U";
        String itemDesc1 = "Robijn";
        String itemDesc2 = "Brinta";
        String itemDesc3 = "Chinese Groenten";
        String itemDesc4 = "Kwark";
        String itemDesc5 = "Luiers";
        String message;

        // Declare and initialize numeric field: tax
        // Declare subtotal field
        double tax = 0.21;
        double total;
        double subtotal = (totaalAankoop1) + (totaalAankoop2) + (totaalAankoop3) + (totaalAankoop4)+ (totaalAankoop5);

        // Beschrijving aankoop producten en hoeveelheden
        message = custName + " moet het volgende betalen aan de kassa: " + "\n"
                + inputQ1 + "x" + " " + itemDesc1 + ": € " + totaalAankoop1 + "\n"
                + inputQ2 + "x" + " " + itemDesc2 + ": € " + totaalAankoop2 + "\n"
                + inputQ3 + "x" + " " + itemDesc3 + ": € " + totaalAankoop3 + "\n"
                + inputQ4 + "x" + " " + itemDesc4 + ": € " + totaalAankoop4 + "\n"
                + inputQ5 + "x" + " " + itemDesc5+ ": € " + totaalAankoop5 + "\n"
        ;
        System.out.print(message);
        System.out.println("------------------------------");
        System.out.println("Subtotaal excl. 21% btw: " + subtotal);
        System.out.println("------------------------------");

        // voeg btw 21% toe over het subtotaal
        total = subtotal * (1 + tax);

        //formatteren naar 2 decimalen met DecimalFormat
        DecimalFormat dFormatter = new DecimalFormat("0.00");
        String formatted = dFormatter.format(total);
        System.out.print("Totaal incl. 21% btw: € "+ formatted);
    }
}




