import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What shape do you want to draw? (line, triangle, rectangle): ");
        String shape = input.nextLine();
        switch (shape){
            case "line":
                System.out.println(line());
                break;
            case "triangle":
                System.out.println(triangle());
                break;
            case "rectangle":
                System.out.println(rectangle());
                break;
        }
    }

    public static String line() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Type in lenght: ");
        int n = input.nextInt();
        while (i < n) {
            System.out.print("o");
            i++;
        } return "";
    }

    public static String triangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in height: ");
        int h = input.nextInt();
        int k = 1;
        int l = 0;
        String txt = "";
        while (h > 0 && k <= h) {

            if (l < k) {
                txt = txt + "o";
                System.out.println(txt);
                k++;


            } else {
                System.out.println(txt);
                k++;
                l = 0;
            }
        } return "";
    }
    public static String rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in side a: ");
        int a = input.nextInt();
        System.out.println("Type in side b: ");
        int b = input.nextInt();

        for (int m = a; m > 0; m--) {
            int o = b;
            while (o > 0) {
                System.out.print("o");
                o--;
            }
            System.out.println("");
        } return "";
    }

}
