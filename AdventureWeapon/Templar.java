public class Templar extends Character implements Tank, Healer{
   private final int healCapacity;
   private final int shield;
    public Templar(String name, int maxHealth , int healCapacity , int shield , Weapon weapon){
        super(name,maxHealth , weapon);
        this.healCapacity=healCapacity;
        this.shield=shield;
    }
    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }
    @Override
    public void heal(Character Character){
        Character.setCurrentHealth(this.healCapacity);
    }
    @Override
    public int getShield(){
        return this.shield;
    }
    @Override
    public String toString(){
        String res="";
        if (super.getCurrentHealth()==0){
        res= String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",super.getName(), this.shield,this.healCapacity);
        }else{
        res= String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",super.getName(),super.getCurrentHealth(),this.healCapacity,this.shield);
        }
        if (this.getWeapon()!=null){
            res+=String.format(" He has the weapon %s.",this.getWeapon().toString());
        }
        return res;
        }
    
    
    @Override
    public void attack(Character character){
        this.heal(this);
        if (this.getWeapon()!=null){
            character.takeDamage(this.getWeapon().getDamage());
        }else{
        character.takeDamage(6);
        }
    }
    @Override
    public void takeDamage(int x){
        setCurrentHealth(-(x-this.shield));
    }


}