package Chapter_05;

enum Day {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

enum Direction {
    EAST, WEST, NORTH, SOUTH
}

class EnumExample {
    public void displayDay(Day day) {
        if (day == Day.SATURDAY) {
            System.out.println("It's Saturday! Weekend!");
        } else if (day == Day.FRIDAY) {
            System.out.println("It's Friday! Weekend!");
        } else {
            System.out.println("Weekday!");
        }
    }

    public void displayMoth(Month month) {
        switch (month) {
            case OCTOBER:
                System.out.println(month + " Is The Birthday Month.");
                break;
            default:
                System.out.println(month + " Is Not the Birthday Month.");
                break;
        }
    }

    public void displayAllDirection() {
        Direction[] values = Direction.values();
        for (Direction direction : values) {
            System.out.println(direction);
        }
    }
}

public class EnumExampleDemo {
    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample();

        Day day = Day.SATURDAY;
        enumExample.displayDay(day);

        Month month = Month.OCTOBER;
        enumExample.displayMoth(month);

        enumExample.displayAllDirection();
    }
}
