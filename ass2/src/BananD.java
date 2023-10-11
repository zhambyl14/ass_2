class BananD implements Coffee {
    private final Coffee decoratedCoffee;

    public BananD(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Банан";
    }

    @Override
    public double baga() {
        return decoratedCoffee.baga() + 100.00;
    }
}
