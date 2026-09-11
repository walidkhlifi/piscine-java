public class WithPickles extends RacletteDecorator {
    public WithPickles(Raclette raclette) {
        super(raclette);
    }

    public int getCalories() {
        return decoratedRaclette.getCalories() + 50;
    }

    public String getIngredients() {
        return decoratedRaclette.getIngredients() + ", cornichons";
    }
}