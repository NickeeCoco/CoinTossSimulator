import java.util.Random;

public class Coin {

    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println("Initial side up: " + coin.getSideUp());

        for(int toss = 1; toss <= 20; toss++) {
            coin.toss();
            System.out.println("Side up after toss " + toss + ": " + coin.getSideUp());
        }

        System.out.println("Final heads count: " + coin.getHeadsCount());
        System.out.println("Final tails count: " + coin.getTailsCount());
    }

    private String sideUp;
    private int headsCount;
    private int tailsCount;

    public Coin() {
        toss();
    }

    private void toss() {
        Random r = new Random();
        int random = r.nextInt(2);

        if(random == 0) {
            this.setSideUp("heads");
            this.incHeadsCount();
        } else {
            this.setSideUp("tails");
            this.incTailsCount();
        }
    }

    public String getSideUp() {
        return this.sideUp;
    }

    public void setSideUp(String side) {
        this.sideUp = side;
    }

    public int getHeadsCount() {
        return this.headsCount;
    }

    public int getTailsCount() {
        return this.tailsCount;
    }

    public void incHeadsCount() {
        this.headsCount++;
    }

    public void incTailsCount() {
        this.tailsCount++;
    }
}
