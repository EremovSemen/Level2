public class Actions {


    public static void main(String[] args) {
        Person person = new Person();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        int[] guis = new int[3];
        guis[0] = person.run(500);
        guis[1] = cat.run(50);
        guis[2] = robot.run(15);

        int[] round2 = new int[3];
        round2[0] = person.jump(2);
        round2[1] = cat.jump(1);
        round2[2] = robot.jump(4);
        for (int i = 0; i < guis.length; i++) {
            treadmill.abilityTest(guis[i]);
            for (int j = 0; j < round2.length; j++) {
                if (guis[i] > treadmill.DISTANCE) {
                    wall.abilityTest(round2[j]);
                    break;
                }
        }
        }




    }
}
