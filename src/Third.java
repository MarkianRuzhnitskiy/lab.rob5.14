import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        double array[] = new double[3];
        double x = 0;
        for (int i = 0; i <3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введіть цифру: ");
            if (sc.hasNextDouble()){
                array[i] = sc.nextDouble();
                if (array[i] > x) {
                    x = array[i];
                }
            } else {
                System.out.println("Не правильна цифра!");
                break;
            }
        }
        System.out.println("Максимальна цифра " + x );
    }
}
