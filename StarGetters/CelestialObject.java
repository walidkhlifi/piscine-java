public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject( ){
        this.x=0.0;
        this.y=0.0;
        this.z=0.0;
        this.name="Soleil";
    }
    public CelestialObject(String s,double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
        this.name=s;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }
    public String getName(){
        return this.name;
    }
    ///////
    public void setX(double ex){
        this.x=ex;
    }
    public void setY(double ey){
        this.x=ey;
    }
    public void setZ(double ez){
        this.x=ez;
    }
    public void setName(String ename){
        this.name=ename;
    }
    
}