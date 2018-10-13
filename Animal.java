public class Animal extends Thread {
    private Animal other;
    private int counter = 0;
    private String nameOfThread;

    public Animal(String me) {
        this.nameOfThread = me;
    }

    public void setOpponent(Animal opponent) {
        other = opponent;
    }

    public void run() {
        while((counter++) < 5_000) {
            System.out.println(nameOfThread);
        }

        if(!other.isAlive()) {
            System.out.printf("Побеждает %s ", nameOfThread);
        }
    }
}
