public class Robot implements Abilities {


    @Override
    public int run(int run) {
        System.out.println("Робот может пробежать: " + run + " метров");
        return run;
    }

    @Override
    public int jump(int jump) {
        System.out.println("Робот может подпрыгнуть на: " + jump + " метров");
        return jump;
    }
}
