import java.util.*;
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
    public Map<String, Integer> computeMassRepartition(){

        Map<String, Integer> result = new HashMap<>();

                result.put("Star", 0);
                result.put("Planet", 0);        
                result.put("Other", 0);
        for (CelestialObject object : celestialObjects) {

            if (object instanceof Star) {
                result.put("Star",   result.get("Star") + object.getmass());
            } else if (object instanceof Planet) {
                result.put("Planet",   result.get("Planet") + object.getmass());
            } else {
                result.put("Other",     result.get("Other") + object.getmass());
            }
        }

        return result;
    }

}