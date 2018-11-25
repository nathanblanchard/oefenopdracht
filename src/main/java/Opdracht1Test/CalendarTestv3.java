/**
 * NOTITIES
 *
 * Work in progress.
 * Invulscherm werkt nog niet, de ingevoerde data moet naar LocalDate gaan.
 * Maand en jaar handmatig in de code aanpassen bij LocalDate werkt wel.
 * Bij LocalDate maandnummer wijzigen naar januari 2018, februari 2018, oktober 2018, en november 2018 werkt enigszins.
 * omdat de maandag en donderdag zijn gedaan. Dit moet sneller en korter kunnen.
 * 1e dag van de maand en het aantal maanden wordt opgehaald.
 */

package Opdracht1Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalendarTestv3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type een jaargetal:");
        int jaarNummer = input.nextInt();
        System.out.println("Het jaar dat je hebt ingevuld is: " + jaarNummer);

        System.out.println("Type een maandnummer:");
        int maandNummer = input.nextInt();
        System.out.println("Het maandnummer dat je hebt ingevuld is: " + maandNummer);

        LocalDate date = LocalDate.of(2018, 1, 1);
        date.lengthOfMonth();
        date.getDayOfWeek();
        // print maand
        System.out.println("Maand ingetypt: " + date.getMonth());
        System.out.println("Eerste dag van de maand is: " + date.getDayOfWeek());

        StringBuilder sb1 = new StringBuilder();
        sb1.append(date.getDayOfWeek());

        //print dagen in de week Stringbuilder oefening
        StringBuilder sb = new StringBuilder();
        sb.append("Su  ");
        sb.append("Mo  ");
        sb.append("Tu  ");
        sb.append("We  ");
        sb.append("Th  ");
        sb.append("Fr  ");
        sb.append("Sa  ");
        System.out.println(sb.toString());

        //MONDAY
        for (int a = 0; a <= 6; a++) {
            if ("MONDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(a)));
            }
        }
        System.out.print("\n");
        for (int b = 7; b <= 13; b++) {
            if ("MONDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(b)));
            }
        }
        System.out.print("\n");
        for (int c = 14; c <= 20; c++) {
            if ("MONDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(c)));
            }
        }
        System.out.print("\n");
        for (int d = 21; d <= 27; d++) {
            if ("MONDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(d)));
            }
        }
        System.out.print("\n");
        for (int e = 28; e <= 30; e++) {
            if ("MONDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d  ");
                System.out.print(dateFormatter.format(date.plusDays(e)));
            }
        }

        //THURSDAY
        for (int a = 0; a <= 6; a++) {
            if ("THURSDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(a)));
            }
        }
        System.out.print("\n");
        for (int b = 7; b <= 13; b++) {
            if ("THURSDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(b)));
            }
        }
        System.out.print("\n");
        for (int c = 14; c <= 20; c++) {
            if ("THURSDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(c)));
            }
        }
        System.out.print("\n");
        for (int d = 21; d <= 27; d++) {
            if ("THURSDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(d)));
            }
        }
        System.out.print("\n");
        for (int e = 28; e <= 30; e++) {
            if ("THURSDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d  ");
                System.out.print(dateFormatter.format(date.plusDays(e)));
            }
        }

    }
}