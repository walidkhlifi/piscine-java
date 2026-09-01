public class DeadCharacterException extends Exception{
    private final Character character;
    public DeadCharacterException(Character character){
        this.character=character;
    }
    public String getMessage(){
        String res;
        if (character instanceof Sorcerer){
            res="sorcerer";
        }else if(character instanceof Monster ){
            res="monster";
        }else if(character instanceof Templar ){
            res="templar";
        } else {
            res = "character";
        }
        return String.format("The %s %s is dead." , res, character.getName());
    }
}