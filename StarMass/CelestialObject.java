public class CelestialObject{
    public Integer mass;
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
    public CelestialObject(String s,double x,double y,double z, Integer mass){
        this.x=x;
        this.y=y;
        this.z=z;
        this.name=s;
        this.mass=mass;
    }
    public Integer getmass(){
        return this.mass;
    }
    public void setmass(Integer ss){
         this.mass=ss;
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
    public void setX(double ex){
        this.x=ex;
    }

    public void setY(double ey){
        this.y=ey;
    }

    public void setZ(double ez){
        this.z=ez;
    }

    public void setName(String ename){
        this.name=ename;
    }
    ////
    public static final double  KM_IN_ONE_AU=  150000000;

    public static double getDistanceBetween(CelestialObject a ,CelestialObject b){
        double result=Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y) + (a.z-b.z)*(a.z-b.z));
        return result;
    }    
    public static double getDistanceBetweenInKm(CelestialObject a ,CelestialObject b){
        double x= getDistanceBetween(a,b);
        return x*KM_IN_ONE_AU;
    }
    //
    @Override
    public String toString(){
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)",this.name,this.x,this.y,this.z);
    }
    @Override
    public boolean equals(Object object){
        if (!(object instanceof CelestialObject)){
            return false;
        }
        CelestialObject a=(CelestialObject) object;

        if (this.x==a.x && this.y==a.y && this.z==a.z && this.name.equals(a.name)){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(this.x, this.y, this.z, this.name);
    }

}