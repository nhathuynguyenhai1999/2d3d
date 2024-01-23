package ClassDesigner;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Class2d class2d = new Class2d(2.5f, 2.0f);
        System.out.println("Lớp 2D :");
        System.out.println(Arrays.toString(class2d.getXY()));
        class2d.display();

        Class3d class3d = new Class3d(3.0f, 4.0f, 5.0f);
        System.out.println("Lớp 3D :");
        class3d.display();
    }
}
