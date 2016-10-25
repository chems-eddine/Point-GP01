package sample;

public class POINTg01{
    private double x;
    private double y;
    public POINTg01(){

        this.x=0;
        this.y=0;

    }
    public POINTg01(double x){

        this.x=x;
        this.y=x;
    }
public POINTg01(double x,double y){

    this.x=x;
    this.y=y;
}
    public double getX(){

        return this.x;
    }
    public double getY(){

        return this.y;
    }
    public double symetrie(){

        return -this.x;
    }
}
