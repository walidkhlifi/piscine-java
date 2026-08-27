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

}