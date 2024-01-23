package ClassDesigner;

public class Class3d extends Class2d {
    private float z;

    public Class3d(float x , float y, float z){
        super(x,y);
//        super();
        this.z = z;
    }
    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public double[] getXYZ(){
        return new double[]{this.getX(), this.getY(), this.getZ()};
    }
    public void display() {
        System.out.println("(" + getX() + ", " + getY() + ", " + z + ")");
    }
}
