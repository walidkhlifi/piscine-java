public class Sorcerer extends Character implements Healer{
    private final int healCapacity;
    public Sorcerer(String name, int maxHealth , int healCapacity , Weapon weapon){
        super(name , maxHealth , weapon); 
        this.healCapacity=healCapacity;
    }
    public int getHealCapacity(){
        return this.healCapacity;
    }
    public void heal(Character Character){
        Character.setCurrentHealth(this.healCapacity);
    }
    @Override
public String toString() {
    String result;
    if (this.getCurrentHealth() == 0) {
        result = String.format(
            "%s is a dead sorcerer. So bad, it could heal %d HP.",
            this.getName(),
            this.healCapacity
        );
    } else {
        result = String.format(
            "%s is a sorcerer with %d HP. It can heal %d HP.",
            this.getName(),
            this.getCurrentHealth(),
            this.healCapacity
        );
    }
    if (this.getWeapon() != null) {
        result += String.format(
            " He has the weapon %s.",
            this.getWeapon().toString()
        );
    }
    return result;
}
    @Override
    public void takeDamage(int x){
        setCurrentHealth(-x);
    }
    @Override
    public void attack(Character character){
        this.heal(this);
        if (this.getWeapon()!=null){
            character.takeDamage(this.getWeapon().getDamage());
        }else{
        character.takeDamage(10);
        }
    }
}