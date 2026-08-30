public class Character{
    private final int maxHealth;
    private int  currentHealth;
    private final String name;
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public int getCurrentHealth(){
        return this.currentHealth;
    }
    // public void setCurrentHealth(int x){
    //     this.currentHealth=x;
    // }
    public String getName(){
        return this.name;
    }

    public  Character(String name, int maxHealth){
        this.maxHealth=maxHealth;
        this.currentHealth=maxHealth;
        this.name=name;
    }
    @Override
    public String toString(){
        if (this.currentHealth==0){
            return String.format("%s : KO",this.name);
        }
        return String.format("%s : %d/%d",this.name, this.currentHealth , this.maxHealth);
    }
    public void takeDamage(Integer x){
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


}