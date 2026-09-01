public class Sorcerer extends Character implements Healer{
    private final int healCapacity;
    public Sorcerer(String name, int maxHealth , int healCapacity){
        super(name , maxHealth); 
        this.healCapacity=healCapacity;
    }
    public int getHealCapacity(){
        return this.healCapacity;
    }
    public void heal(Character Character){
        Character.setCurrentHealth(this.healCapacity);
    }
    @Override
    public String toString(){
        if (this.getCurrentHealth()==0){
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP." , this.getName() , this.healCapacity );
        }else{
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP." , this.getName() ,this.getCurrentHealth() ,this.healCapacity );
        }
    }
    @Override
    public void takeDamage(int x){
        setCurrentHealth(-x);
    }
    @Override
    public void attack(Character character){
        this.heal(this);
        character.takeDamage(10);
    }
}