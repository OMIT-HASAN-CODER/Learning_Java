package Chapter_02;

public class StringDemo {
    public static void main(String[] args) {
        String nationalAnthemLineOne
                = "My Bengal of Precious Gold, I love you. ";
        String nationalAnthemLineTwo
                = "Forever your skies, your air set my heart in tune\n" +
                "As if it were a flute.";

        String nationalAnthem = nationalAnthemLineOne + nationalAnthemLineTwo;
        System.out.println(nationalAnthem);
    }
}
