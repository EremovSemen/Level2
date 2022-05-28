public class Person implements Abilities {


    @Override
    public int run(int run) {

        System.out.println("Человек может пробежать: " + run + " метров");
        return run;
    }

    @Override
    public int jump(int jump) {
        System.out.println("Человек может подпрыгнуть на: " + jump + " метров");
        return jump;
    }
}
