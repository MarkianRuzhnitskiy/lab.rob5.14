import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        String array[] = new String[2];
        String x = "";
        for (int i = 0; i < 2; i++){
            Scanner line = new Scanner(System.in);
            System.out.print("Уведіть рядок: ");
            array[i] = line.nextLine();
            if (x.length() < array[i].length()){
                x = array[i];
            }
        }
        if (array[1].length() == array[0].length()){
            System.out.println("Вони однакової довжини!");
        } else {
            System.out.println("Рядок " + x + " довший!");
        }
    }
}
