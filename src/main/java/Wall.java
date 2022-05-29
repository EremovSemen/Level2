public class Wall {
     Person person = new Person();
     Cat cat = new Cat();
     Robot robot = new Robot();
    static final int HEIGHT = 1;

    public void abilityTest(int a) {
        if (a >= HEIGHT) {
            System.out.println( "Учасник со способностью прыгнуть на < "+ a + " > метров "+" перепрыгнул");
        }
        else {
            System.out.println("Учасник со способностью прыгнуть на < "+ a + " > метров "+ " не смог перепрыгнуть");
        }
    }
}
