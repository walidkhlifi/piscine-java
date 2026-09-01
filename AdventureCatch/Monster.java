public class Monster extends Character{
    public Monster(String name, int maxHealth , Weapon weapon){
        super(name, maxHealth , weapon);
    }
    @Override
    public String toString(){
        String res="";
        if (this.getCurrentHealth()>0){
           res= String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth());
        }else{
           res= String.format("%s is a monster and is dead", this.getName());
        }
        if (this.getWeapon()!=null){
            res+= String.format(" He has the weapon %s" , this.getWeapon());
        }
        return res;
    }
    @Override
    public void attack(Character Character) throws DeadCharacterException{
        if (this.getCurrentHealth()==0){
            throw new DeadCharacterException(this);
        }
        if (this.getWeapon()!=null){
            Character.takeDamage(this.getWeapon().getDamage());
        }else{
          Character.takeDamage(7);

        }
    }
    @Override
    public void takeDamage(int d) throws DeadCharacterException{
        if (this.getCurrentHealth()==0){
            throw new DeadCharacterException(this);
        }
        int tt = (int) Math.floor(d*0.8);
        setCurrentHealth(-tt);
    }
}