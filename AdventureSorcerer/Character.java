import java.util.*;
public class Character{
    private static List<Character> allCharacters=new ArrayList<>();
    private final int maxHealth;
    private int  currentHealth;
    private final String name;

    public int getMaxHealth(){
        return this.maxHealth;
    }
    public int getCurrentHealth(){
        return this.currentHealth;
    }
    public void setCurrentHealth(int x){
        int res=this.currentHealth+x;
        if (res>this.maxHealth){
            this.currentHealth=maxHealth;
        }else{
            this.currentHealth=res;
        }
        
    }

    public String getName(){
        return this.name;
    }

    public  Character(String name, int maxHealth){
        this.maxHealth=maxHealth;
        this.currentHealth=maxHealth;
        this.name=name;
        allCharacters.add(this);
    }
    @Override
    public String toString(){
        if (this.currentHealth==0){
            return String.format("%s : KO",this.name);
        }
        return String.format("%s : %d/%d",this.name, this.currentHealth , this.maxHealth);
    }
    public void takeDamage(int x){
      int res=  this.currentHealth-x;
      if (res<0){
        this.currentHealth=0;
      }else{
        this.currentHealth=res;
      }
    }
    public void attack(Character adv){
        adv.takeDamage(9);
    }
    public static String printStatus(){
        if (allCharacters.isEmpty()){
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";
        }else{
            String res="------------------------------------------\nCharacters currently fighting :";
            for(Character x : allCharacters){
           res+= String.format("\n - %s", x.toString());
            }
            res+="\n------------------------------------------\n";
        return res;
        }
    }
    public static Character fight(Character x , Character y){
        while(x.currentHealth>0 && y.currentHealth>0){
            x.attack(y);
            if (y.currentHealth<=0){
                return x;
            }
            y.attack(x);
            if (x.currentHealth<=0){
                return y;
            }
        }
        if (y.currentHealth> x.currentHealth){
        return y;
        }
        return x;
    }


}