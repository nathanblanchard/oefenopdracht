package Opdracht1Test;

import java.time.LocalDate;

public class CalendarTestv1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, 10, 1);

        // print maand.
        System.out.println(date.getMonth());

        //check 1e dag (ma/di/wo) van de maand vanuit LocalDate. Hiermee kun je
        //vaststellen waar je moet beginnen met het plaatsen in de Array van 6 bij 7.
        //        System.out.println(date.getDayOfWeek());
        StringBuilder sb1 = new StringBuilder();
        sb1.append(date.getDayOfWeek());
        System.out.println(sb1.toString());

        //print dagen in de week
        StringBuilder sb = new StringBuilder();
        sb.append("Su ");
        sb.append("Mo ");
        sb.append("Tu ");
        sb.append("We ");
        sb.append("Th ");
        sb.append("Fr ");
        sb.append("Sa");
        System.out.println(sb.toString());

        String[][] CalendarTest2 = new String[7][6];

        if ("SUNDAY".equals(sb1.toString())) {
        }

        for (int i = 1; i <= 7; i++) {
            switch (sb1.toString()) {
                case "MONDAY":
                    System.out.print("   " + i);
                    break;
                case "TUESDAY":
                    System.out.println("      " + i);
                    break;
                case "WEDNESDAY":
                    System.out.println("         " + i);
                    break;
                case "THURSDAY":
                    System.out.println("            " + i);
                    break;
                case "FRIDAY":
                    System.out.println("               " + i);
                    break;
                case "SATURDAY":
                    System.out.println("                  " + i);
                    break;
                default:
                    System.out.println("Geen idee");
                    break;
            }
        }
    }
}
