import java.util.Scanner;

public class Color {
    protected String colorName = "Blue", codeColor ="#0000FF";

    public Color() {
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void setCodeColor(String codeColor) {
        this.codeColor = codeColor;
    }

    public String getCodeColor() {
        return codeColor;
    }

    public String getColorName() {
        return colorName;
    }

    public void inputColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input color name:");
        String name = scanner.nextLine();
        setColorName(name);
        System.out.println("Input code name:");
        String code = scanner.nextLine();
        setCodeColor(code);
    }
}
