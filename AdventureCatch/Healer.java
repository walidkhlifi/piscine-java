public interface Healer{
    void heal(Character Character) throws DeadCharacterException;
    int getHealCapacity();
}