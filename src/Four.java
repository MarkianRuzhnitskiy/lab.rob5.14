import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        String array[] = new String[2];
        for (int i = 0; i < 2; i++){
            Scanner name = new Scanner(System.in);
            System.out.print("Уведіть ім'я : ");
            if (name.hasNext()){
                array[i] = name.nextLine().toLowerCase();
            } else {
                System.out.println("Це не ім'я!");
            }
        }
        if (array[0].equals(array[1])){
            System.out.println("Однакові імена!");
        } else {
            System.out.println("Не однакові імена!");
        }
    }
}
