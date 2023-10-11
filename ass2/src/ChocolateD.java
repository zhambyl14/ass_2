class ChocolateD implements Coffee {
    private final Coffee decoratedCoffee;

    public ChocolateD(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Шоколад";
    }

    @Override
    public double baga() {
        return decoratedCoffee.baga() + 100.0;
    }
}