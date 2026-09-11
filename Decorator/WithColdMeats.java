public class WithColdMeats extends RacletteDecorator {
    public WithColdMeats(Raclette raclette) {
        super(raclette);
    }

    public int getCalories() {
        return decoratedRaclette.getCalories() + 350;
    }

    public String getIngredients() {
        return decoratedRaclette.getIngredients() + ", charcuterie";
    }
}