public class Main {
    public static void main(String[] args) {
    Animal chicken = new Animal("Хурица");
    Animal egg = new Animal("Яички");

		chicken.setOpponent(egg);
		egg.setOpponent(chicken);

		chicken.start();
		egg.start();

		try {
        chicken.join();
        egg.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

}
