import java.util.Scanner;
public class PaintPro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What shape do you want to draw? (triangleR, triangleE, rectangle)");
        String shape = input.nextLine();
        switch (shape){
            case "triangleR":
                System.out.println(triangleR());
                break;
            case "triangleE":
                System.out.println(triangleE());
                break;
            case "rectangle":
                System.out.println(rectangle());
                break;
        }
    }
    public static String rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in side a: ");
        int a = input.nextInt();
        System.out.println("Type in side b: ");
        int b = input.nextInt();
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if(i == 0 || i == a - 1 || j == 0 || j == b - 1){
                    System.out.print("o");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }return "";
    }
    public static String triangleR(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in height: ");
        int h = input.nextInt();
        for(int i = 0; i < h; i++){
            for(int j = 0; j <= h; j++){
                if(j == 0 || i == h - 1 || j == i){
                    System.out.print("o");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }return "";
    }
    public static String triangleE(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in height: ");
        int h = input.nextInt();
        for(int i = 0; i < h; i++){
            for (int j = 0; j < 2 * h - 1; j++) {
                if (j == h - i - 1 || j == h + i - 1 || i == h - 1) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }return "";
    }
}
