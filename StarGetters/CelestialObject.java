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

    public void setX(double ex){
        this.x=ex;
    }
    public double getX(){
        return this.x;
    }

    public void setY(double ey){
        this.x=ey;
    }
    public double getY(){
        return this.y;
    }

    public void setZ(double ez){
        this.x=ez;
    }
    public double getZ(){
        return this.z;
    }

    public void setName(String ename){
        this.name=ename;
    }
    public String getName(){
        return this.name;
    }

    
}