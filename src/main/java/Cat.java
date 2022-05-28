public class Cat implements Abilities {


        @Override
        public int run(int run) {
                System.out.println("Кот может пробежать: " + run + " метров");
                return run;
        }

        @Override
        public int jump(int jump) {
                System.out.println("Кот может подпрыгнуть на: " + jump + " метров");
                return jump;
        }
}
