public class Pixel extends Point {

    Pixel(int x, int y, String colorName,String codeColor) {
        this.x = x;
        this.y = y;
        this.colorName =  colorName;
        this.codeColor = codeColor;
    }


    public boolean check() {
        if(x == y && codeColor.equals("#0000FF"))
            return true;
        else
            return  false;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                ", Ten Mau='" + colorName + '\'' +
                ", Ma Mau='" + codeColor + '\'' +
                '}';
    }
}
