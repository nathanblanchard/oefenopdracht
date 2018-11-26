/**
 * NOTITIES
 * Work in progress...
 * Robijn wasverzachter, Brinta, Chinese groenten, kwark en luiers erin gezet.
 * DecimalFormatter gebruikt om af te ronden op 2 decimalen
 * Strings productomschrijving en double price korter opgeschreven
 * korting robijn doorgevoerd met if/else
 * 4 halen 3 betalen luiers doorgevoerd met if/else
 *
 * Nog te doen:
 * loops gebruiken
 * woensdag aanbieding
 * verwijderen van producten uitwerken
 * totale korting showen
 * kassa wisselgeld
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
        Integer input1 = Integer.valueOf(sc.nextLine());
        System.out.println(input1);

        System.out.println("Hoeveel Brinta wilt u in uw winkelwagen doen?:");
        Integer input2 = Integer.valueOf(sc.nextLine());
        System.out.println(input2);

        System.out.println("Hoeveel pakken Chinese groenten wilt u in uw winkelwagen doen?:");
        Integer input3 = Integer.valueOf(sc.nextLine());
        System.out.println(input3);

        System.out.println("Hoeveel bakjes kwark wilt u in uw winkelwagen doen?:");
        Integer input4 = Integer.valueOf(sc.nextLine());
        System.out.println(input4);

        System.out.println("Hoeveel luiers wilt u in uw winkelwagen doen?:");
        Integer input5 = Integer.valueOf(sc.nextLine());
        System.out.println(input5);

        //productomschrijving product 1,2,3,4,5
        String itemDesc1 = "Robijn", itemDesc2 = "Brinta", itemDesc3 = "Chinese Groenten", itemDesc4 = "Kwark", itemDesc5 = "Luiers";

        //prijzen price1 (robijn), price2 (brinta), price 3 (chinese groenten), price 4 (kwark), price 5 (luiers)
        double price1 = 3.00, price2 = 2.50, price3 = 5.00, price4 = 2.00, price5 = 10.00;

        //input van de scanner naar totaal berekend

        //robijn 31% korting bij 2 flacons
        int quantityRobijn = input1;
        if (input1 == 2) {
            price1 = price1*0.69;
        } else if (input1 != 2) {
            price1 = price1*1;
        }

        double totaalAankoop1 = quantityRobijn * price1;

        int quantityBrinta = input2;
        double totaalAankoop2 = quantityBrinta * price2;

        int quantityChineseGroenten = input3;
        double totaalAankoop3 = quantityChineseGroenten * price3;

        int quantityKwark = input4;
        double totaalAankoop4 = quantityKwark * price4;

        //luiers 4 halen 3 betalen
        int quantityLuiers = input5;
        if (input5 == 4) {
            quantityLuiers = 3;
        } else if (input5 <4 || input5 > 4) {
            quantityLuiers = input5;
        }

        double totaalAankoop5 = quantityLuiers * price5;

        // Declare subtotal field
        double subtotal = (totaalAankoop1) + (totaalAankoop2) + (totaalAankoop3) + (totaalAankoop4)+ (totaalAankoop5);

        // Beschrijving aankoop producten en hoeveelheden
        String message = "U moet het volgende betalen aan de kassa: " + "\n"
                + input1 + "x" + " " + itemDesc1 + ": € " + totaalAankoop1 + "\n"
                + input2 + "x" + " " + itemDesc2 + ": € " + totaalAankoop2 + "\n"
                + input3 + "x" + " " + itemDesc3 + ": € " + totaalAankoop3 + "\n"
                + input4 + "x" + " " + itemDesc4 + ": € " + totaalAankoop4 + "\n"
                + input5 + "x" + " " + itemDesc5+ ": € " + totaalAankoop5 + "\n"
                ;
        System.out.print(message);
        System.out.println("------------------------------");
        System.out.println("Subtotaal excl. 21% btw: " + subtotal);
        System.out.println("------------------------------");

        // subtotaal mte 21% btw toegevoegd
        // totaal
        double tax = 0.21;
        double total = subtotal * (1 + tax);

        //formatteren naar 2 decimalen met DecimalFormat
        DecimalFormat dFormatter = new DecimalFormat("0.00");
        String formatted = dFormatter.format(total);
        System.out.print("Totaal incl. 21% btw: € "+ formatted);
    }
}




