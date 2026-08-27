import java.util.List;
import java.util.ArrayList;
public class Galaxy{
    private List<CelestialObject> celestialObjects;
    public Galaxy (){
        celestialObjects=new ArrayList<>();
    }
    public List<CelestialObject> getCelestialObjects(){
        return this.celestialObjects;
    }
    public void addCelestialObject(CelestialObject x){
        celestialObjects.add(x);
    }
    public Integer computeMassRepartition(){
        Integer t=0;
        for (int i=0 ; i<this.celestialObjects.size() ; i++){
            t+=this.celestialObjects.get(i).getmass();
        }
        return t;
    }

}