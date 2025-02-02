import java.util.Scanner;

public class TwiceEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        if(a>99 && a<1000){
            if ((((a/100)*(a/10)*(a%10))%2==0)&&(((a/100)+(a/10)+(a%10))%2==0)){
                System.out.println("Дважды чётное");
            }
            else{
                System.out.println("Не дважды чётное");
            }
        }
        else{
                System.out.println("Ошибка ввода");
        }
    }
}