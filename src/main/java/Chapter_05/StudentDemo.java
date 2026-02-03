package Chapter_05;

class Student {
    private final String name;
    private final double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double average() {
        return totalMarks() / marks.length;
    }

    public double totalMarks() {
        double totalMarks = 0.0;
        for (double mark: marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student omit = new Student("Omit", new double[]{97.45, 95.75, 100});
        double totalMarks = omit.totalMarks();
        double average = omit.average();

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average = " + average);
    }
}
