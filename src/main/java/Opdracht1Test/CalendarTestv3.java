/**
 * NOTITIES
 *
 * Work in progress.
 * Fix: Invulscherm werkt nu wel, de ingevoerde data gaat naar LocalDate
 * April 2018, Juli 2018 werkt.
 * Januari 2018, februari 2018, oktober 2018, en november 2018 werken enigszins omdat
 * de 1e dag van de maand, zondag, maandag en donderdag zijn gedaan.
 * Dit moet vast sneller en korter kunnen.
 * 1e dag van de maand en het aantal maanden wordt opgehaald.
 */

package Opdracht1Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalendarTestv3 {

    public static void main(String[] args) {

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Type een 4 cijferig jaargetal (bijv. 2018):");
        Integer input1 = Integer.valueOf(sc.nextLine());
        System.out.println(input1);

        System.out.println("Type een maandnummer:");
        Integer input2 = Integer.valueOf(sc.nextLine());
        System.out.println(input2);

        //input van de scanner gaat naar LocalDate, dayOfMonth is al vastgesteld
        LocalDate date = LocalDate.of(input1, input2, 1);
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

        //SUNDAY
        for (int a = 0; a <= 6; a++) {
            if ("SUNDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(a)));
            }
        }
        System.out.print("\n");
        for (int b = 7; b <= 13; b++) {
            if ("SUNDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(b)));
            }
        }
        System.out.print("\n");
        for (int c = 14; c <= 20; c++) {
            if ("SUNDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(c)));
            }
        }
        System.out.print("\n");
        for (int d = 21; d <= 27; d++) {
            if ("SUNDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd  ");
                System.out.print(dateFormatter.format(date.plusDays(d)));
            }
        }
        System.out.print("\n");
        for (int e = 28; e <= 30; e++) {
            if ("SUNDAY".equals(sb1.toString())) {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d  ");
                System.out.print(dateFormatter.format(date.plusDays(e)));
            }
        }

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