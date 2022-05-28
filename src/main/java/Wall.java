public class Wall {
    static Person person = new Person();
    static Cat cat = new Cat();
    static Robot robot = new Robot();
    static final int HEIGHT = 1;

    public static void print() {
        if (person.jump(2) >= HEIGHT) {
            System.out.println("Человек перепрыгнул стену");
        }
        else {
            System.out.println("Человек не перепрыгнул стену");
        }
        if (cat.jump(1) >= HEIGHT) {
            System.out.println("Кот перепрыгнул стену");
        }
        else {
            System.out.println("Кот не перепрыгнул стену");
        }
        if (robot.jump(0) >= HEIGHT) {
            System.out.println("Робот перепрыгнул стену");
        }
        else {
            System.out.println("Робот не перепрыгнул стену");
        }

    }
}
