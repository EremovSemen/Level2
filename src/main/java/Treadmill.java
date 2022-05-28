public class Treadmill {
    static Person person = new Person();
    static Cat cat = new Cat();
    static Robot robot = new Robot();
static final int DISTANCE = 100;

    public static void print() {
        if (person.run(500) >= DISTANCE) {
            System.out.println("Человек пробежал дистанцию");
        }
        else {
            System.out.println("Человек не пробежал дистанцию");
        }
        if (cat.run(30) >= DISTANCE) {
            System.out.println("Кот пробежал дистанцию");
        }
        else {
            System.out.println("Кот не пробежал дистанцию");
        }
        if (robot.run(15) >= DISTANCE) {
            System.out.println("Робот пробежал дистанцию");
        }
        else {
            System.out.println("Робот не пробежал дистанцию");
        }

    }

}
