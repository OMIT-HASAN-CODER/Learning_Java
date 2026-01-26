package Chapter_03;

import java.util.Scanner;

public class MonthToDayConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Month: ");
        int month = input.nextInt();

        String mothName = switch (month) {
          case 1 -> "January";
          case 2 -> "February";
          case 3 -> "March";
          case 4 -> "April";
          case 5 -> "May";
          case 6 -> "June";
          case 7 -> "July";
          case 8 -> "August";
          case 9 -> "September";
          case 10 -> "October";
          case 11 -> "November";
          case 12 -> "December";
          default -> "Invalid month";
        };

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                System.out.println("Enter year: ");
                int year = input.nextInt();

                if (year % 4 == 0) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> 0;
        };

        System.out.println(mothName + " have " + days + " days ");
    }
}
