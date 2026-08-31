public class Templar extends Character implements Tank, Healer{
   final int healCapacity;
   final int shield;
    public Templar(String name, int maxHealth , int healCapacity , int shield){
        super(name,maxHealth);
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
        if (super.getCurrentHealth()==0){
        return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",super.getName(), this.shield,this.healCapacity);
        }else{
        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",super.getName(),super.getCurrentHealth(),this.healCapacity,this.shield);
        }
    }


}