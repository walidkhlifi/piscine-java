public abstract class RacletteDecorator implements Raclette {
    protected Raclette decoratedRaclette;

    public RacletteDecorator(Raclette raclette) {
        this.decoratedRaclette = raclette;
    }

    public int getCalories() {
        return decoratedRaclette.getCalories();
    }

    public String getIngredients() {
        return decoratedRaclette.getIngredients();
    }

    public String toString() {
        return getIngredients() + " pour " + getCalories() + " calories";
    }
}