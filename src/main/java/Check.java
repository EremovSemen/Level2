public class Check {

    void checkAbilities() {
        Person person = new Person();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

//        int[] p = new int[3];
//        p[0] = person.run(500);
//        person.jump(2);
//        p[1] = cat.run(30);
//        cat.jump(1);
//        p[2] = robot.run(15);
//        robot.jump(4);
//        for (int i = 0; i < p.length; i++) {
//            if (p[i] > treadmill.DISTANCE) {
//                System.out.println(p[i] + " Смог пробежать дистанцию");
//                if (p[i] > wall.HEIGHT) {
//                    System.out.println(p[i] + " перепрыгнул стену");
//                }
//            }
//            else {
//                System.out.println(p[i] + " Не прошел испытание. В дальнеейших испытаниях не участвует");
//            }
//        }
        int[] p = new int[2];
        p[0] = person.run(500);
        p[1] = person.jump(2);
        if (p[0] > treadmill.DISTANCE) {
            System.out.println(" Человек смог пробежать дистанцию");
            if (p[1] > wall.HEIGHT) {
                System.out.println("Человек перепрыгнул стену");
            } else {
                System.out.println("Человек не перепрыгнул стену");
            }
        }
        else
        {
            System.out.println(" Не прошел первое испытание. В дальнеейших испытаниях не участвует");
        }
        System.out.println();

        int[] c = new int[2];
        c[0] =cat.run(30);
        c[1] = cat.jump(1);
        if (c[0] > treadmill.DISTANCE) {
            System.out.println(" Кот смог пробежать дистанцию");
            if (c[1] > wall.HEIGHT) {
                System.out.println("Кот перепрыгнул стену");
            } else {
                System.out.println("Кот не перепрыгнул стену");
            }
        }
        else
        {
            System.out.println("Кот не прошел первое испытание. В дальнеейших испытаниях не участвует");
        }
        System.out.println();
        int[] r = new int[2];
        r[0] = robot.run(150);
        r[1] =  robot.jump(4);
        if (r[0] > treadmill.DISTANCE) {
            System.out.println("Робот смог пробежать дистанцию");
            if (r[1] > wall.HEIGHT) {
                System.out.println("Робот перепрыгнул стену");
            } else {
                System.out.println("Робот не перепрыгнул стену");
            }
        }
        else
        {
            System.out.println("Робот не прошел первое испытание. В дальнеейших испытаниях не участвует");
        }
        System.out.println();
    }

    }


