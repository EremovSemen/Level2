public class Actions {


    public static void main(String[] args) {
        System.out.println("Преодаление стены: ");
        Wall.print();
        System.out.println();
        System.out.println("Преодаление беговой дорожки: ");
        Treadmill.print();
        System.out.println();
        System.out.println("Далее идет проверка преодаления препятствий через массив: ");

        Check check = new Check();
        check.checkAbilities();



    }
}
