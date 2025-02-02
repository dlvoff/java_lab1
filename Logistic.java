import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        System.out.println("Введите количество дорог");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int n_max = -1;
        for(int i = 1;i<=n;i++){
            System.out.println("Введите количество туннелей");
            in = new Scanner(System.in);
            int m = in.nextInt();
            System.out.println("Введите высоты туннелей");
            int min = 1000000;
            for(int j = 1;j<m;j++){
                in = new Scanner(System.in);
                if(in.nextInt()<min){
                    min = in.nextInt();
                }
            }
            if (min>max){
                max = min;
                n_max = i;
            }
        }
        in.close();
        System.out.println(n_max+" "+max);
    }
}