import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        String array1[] = new String[5];
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Уведіть слово: ");
            String x = scanner.next();
            array1[i] = x;
            array1[i] = array1[i].substring(0, 1);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
