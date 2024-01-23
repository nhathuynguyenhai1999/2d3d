package ClassDesigner;

public class Class2d {
    private float x;
    private float y;

    public Class2d(){

    }
    public Class2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
    public float[] getXY(){
        float[] dp = new float[2];
        dp[0] = this.x;
        dp[1] = this.y;
        return dp;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Class2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
