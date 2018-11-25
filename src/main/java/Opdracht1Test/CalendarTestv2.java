/**
 * NOTITIES
 *
 * Work in progress.
 */

package Opdracht1Test;

import java.time.LocalDate;
import java.util.Scanner;

public class CalendarTestv2 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, 7, 1);
        date.lengthOfMonth();

        // scanner poging test print year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int month = scanner.nextInt();
        System.out.println("			" + " " + date.getMonth());
        System.out.println(date.getMonth());

        StringBuilder sb1 = new StringBuilder();
        sb1.append(date.getDayOfWeek());

        //print weekdagen Stringbuilder oefening
        StringBuilder sb = new StringBuilder();
        sb.append("Su ");
        sb.append("Mo ");
        sb.append("Tu ");
        sb.append("We ");
        sb.append("Th ");
        sb.append("Fr ");
        sb.append("Sa");
        System.out.println(sb.toString());

        //[rows y][columns x]
        String [][] string = new String [5][1];

        //stop getallen in je array board
        string[0][0] = "1  2  3  4  5  6  7";
        string[1][0] = "8  9  10 11 12 13 14";
        string[2][0] = "15 16 17 18 19 20 21";
        string[3][0] = "22 23 24 25 26 27 28";
        string[4][0] = "29 30 31";

        //de buitenste loop gaat langs alle rows
        for (int i = 0; i < string.length ; i++) {

            //de binnen loop gaat langs alle kolommen
            for (int j = 0; j <string[0].length ; j++) {
                System.out.println(string[i][j]);
            }
        }
    }
}