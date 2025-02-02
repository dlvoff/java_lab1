import java.util.Scanner;

public class Treasure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in = new Scanner(System.in);
        int y = in.nextInt();
        int x_0 = 0;
        int y_0 = 0;
        String dir = "";
        int i = 0;
        while (true){
            in = new Scanner(System.in);
            dir = in.nextLine();
            if (dir.equals("стоп")) {
                break;
            }
            in = new Scanner(System.in);
            switch (dir) {
                case "север":
                    y_0+=in.nextInt();
                    break;
                case "юг":
                    y_0-=in.nextInt();
                    break;
                case "восток":
                    x_0+=in.nextInt();
                    break;
                case "запад":
                    x_0-=in.nextInt();
                    break;
                default:
                    break;
            }
            i++;
            if ((x==x_0)&&(y==y_0)){
                System.out.println(i);
                break;
            }
        }
        in.close();
    }
}