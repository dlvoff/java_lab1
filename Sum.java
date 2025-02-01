import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Введите количество значений");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int sum = 0;
        int sign = 1;
        while (i<n){
            sum += in.nextInt()*sign;
            sign *= -1;
            i++;
        }
        in.close();
        System.out.println("Ответ: "+ String.valueOf(sum));
    }
}