package Chapter_05;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        String[] cities = {"Dhaka", "Chittagong", "Khulna", "Mymensingh", "Rajshahi", "Rangpur", "Sylhet"};
        StringJoiner joiner = new StringJoiner(", ");
        for (String city : cities) {
            joiner.add(city);
        }

        System.out.println("Divisions of Bangladesh: " + joiner);
    }
}
