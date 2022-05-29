public class Treadmill {
     Person person = new Person();
     Cat cat = new Cat();
    Robot robot = new Robot();
 final int DISTANCE = 100;

    public void abilityTest(int a) {
    if (a >= DISTANCE) {
        System.out.println("Учасник со способностью пробежать < "+ a + " > метров "+" пробежал");
    }
    else {
        System.out.println("Учасник со способностью пробежать < "+ a + " > метров "+" не смог пробежать");
    }
    }


}
