public class Planet extends CelestialObject{
    private Star centerStar ;
    public Planet(){
        super();
        centerStar=new Star();
    }
    public Planet(String name, double x, double y, double z , Star centerStar){
        super( name,  x,  y,  z );
        this.centerStar=centerStar;
    }
    public Star getCenterStar(){
        return this.centerStar;
    }
    public void setCenterStar(Star x){
         this.centerStar=x;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(super.hashCode(), this.centerStar);
    }
    @Override
    public boolean equals(Object object){
        if (!(object instanceof Planet)){
            return false;
        } 
        Planet o = (Planet) object;
        return super.equals(o) && this.centerStar.equals(o.centerStar);
    }
    @Override
    public String toString(){
        double d = getDistanceBetween(this, centerStar);
        return String.format("%s circles around %s at the %.3f AU",this.name , this.centerStar.name,d );
    }

}