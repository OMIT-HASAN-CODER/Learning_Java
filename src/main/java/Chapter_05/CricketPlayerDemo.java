package Chapter_05;

class CricketPlayer {
    private static int totalScore;
    private String name;
    private int score;

    public CricketPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getTotalScore() {
        return totalScore;
    }

    public void addScore(int score) {
        this.score += score;
        totalScore += score;
    }

    public int getScore() {
        return score;
    }
}

public class CricketPlayerDemo {
    public static void main(String[] args) {
        CricketPlayer omit = new CricketPlayer("Omit");
        omit.addScore(1);
        omit.addScore(4);
        omit.addScore(6);
        omit.addScore(4);

        CricketPlayer hasan = new CricketPlayer("Hasan");
        hasan.addScore(0);
        hasan.addScore(1);
        hasan.addScore(2);
        hasan.addScore(4);

        CricketPlayer anik = new CricketPlayer("Anik");
        anik.addScore(6);
        anik.addScore(1);
        anik.addScore(4);
        anik.addScore(1);
        anik.addScore(1);
        anik.addScore(2);

        System.out.println(omit.getName() + " = " + omit.getScore());
        System.out.println(hasan.getName() + " = " + hasan.getScore());
        System.out.println(anik.getName() + " = " + anik.getScore());

        System.out.println("Total score = " + CricketPlayer.getTotalScore());
    }
}
