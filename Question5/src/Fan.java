
public class Fan {
	private int speed;
	private boolean on;
	private double radius;
    private String color=null;
    public static final int SLOW=1,MEDIUM=2,FAST=3;
    public String str="";
    public static String strspeed="";
    public Fan(int speed,boolean on,double radius,String color){
    	this.speed=speed;
    	this.radius=radius;
    	this.on=on;
    	this.color=color;
    }
    public int getSpeed(){
    	return speed;
    }
    public boolean getOn(){
    	return on;
    }
    public double getRadius(){
    	return radius;
    }
    public String getColor(){
    	return color;
    }
    public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	Fan(){
         speed=1;
         on=false;
         radius=5;
         color="bule";
    }
    public String toString(){
    	strspeed=null;
    	switch(speed){
        case 1:strspeed="SLOW";break;
        case 2:strspeed="MEDIUM";break;
        case 3:strspeed="FAST";break;
        }
    	if(on==true){
    		return str="Fan speed: "+strspeed
    				+", color: "+color
    				+", radius: "+radius;
    	}
    	else {
    		return str="Fan color: "+color
    				+", radius: "+radius
    				+" Fan is off";
    	}
    }

}
