import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        String array[] = new String[5];

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Уведіть текст: ");
            String x = scanner.next();
            array[i] = x;
        }

        System.out.println(array[0].concat(array[1]).concat(array[2]).concat(array[3]).concat(array[4]));
    }
}
