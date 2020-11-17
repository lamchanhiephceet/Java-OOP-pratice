import java.util.Scanner;

public class Point extends Color {
    protected int x,y;
    public Point(){}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void inputPoint(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x:");
        int x = scanner.nextInt();
        setX(x);
        System.out.println("Input y:");
        int y = scanner.nextInt();
        setY(y);
    }
}
