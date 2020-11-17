import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input quality:");
        int n = sc.nextInt();

        Pixel[] arr = new Pixel[n];
        for(int i=0;i<n;i++) {
            arr[i]=new Pixel();
            arr[i].inputColor();
            arr[i].inputPoint();

        }
        for (int i=0;i<n;i++) {
            if(arr[i].check() == true)
                System.out.println(arr[i]);
        }

    }
}
