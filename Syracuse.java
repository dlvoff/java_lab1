import java.util.Scanner;

public class Syracuse {
    public static void main(String[] args) {
        System.out.println("Введите любое натуральное число");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        in.close();
        int n = 0;
        while (s>1){
            if (s%2==0){
                s = s/2;
            }
            else{
                s = s*3 + 1;
            }
            n += 1;
        }
        System.out.println("Ответ: "+ String.valueOf(n));
    }
}