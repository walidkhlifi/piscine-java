public class Star extends CelestialObject{
    private double magnitude;

    public double getMagnitude(){
        return this.magnitude;
    }
    public void setMagnitude(double x){
        magnitude=x;
    }
    public Star(){     
    }
    public Star(String name,double x,double y,double z,double magnitude, int m){
        super(name,x,y,z,m);
        this.magnitude=magnitude;        
    }
    @Override
    public int hashCode(){
         return java.util.Objects.hash(super.hashCode(),this.magnitude);
    }
    @Override
    public boolean equals(Object object){
        if (!(object instanceof Star)){
            return false;
        } 
        Star o = (Star) object;
        return super.equals(o) && this.magnitude==o.magnitude;
    }
    @Override
    public String toString(){
        return String.format("%s shines at the %.3f magnitude",this.name,this.magnitude);
    }


}