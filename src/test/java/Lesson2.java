public class Lesson2 {

    public static void ArrayEx(String[][] arr) throws MyArraySizeException, MyArrayDataException {
       int[][] reeder = new int[2][2];
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    reeder[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не правильный формат ячейки < " + arr[i][j] + " > подаваемого на вход массива");
                }
                    System.out.println(reeder[i][j]);
                    sum += reeder[i][j];
                if (arr.length != reeder.length) {
                    throw new MyArraySizeException();
                }
            }
            }
        System.out.println("Сумма эллементов массива:");
        System.out.println(sum);



    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arr = new String[2][2];
        arr[0][0] = "1";
        arr[0][1] = "2";
        arr[1][0] = "Строка";
        arr[1][1] = "4";
        System.out.println();
        try {
            ArrayEx(arr);
        } catch ( MyArraySizeException a) {
            a.exept();
        }



    }
}
