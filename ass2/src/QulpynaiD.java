class QulpynaiD implements Coffee {
    private final Coffee decoratedCoffee;

    public QulpynaiD(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Құлпынай";
    }

    @Override
    public double baga() {
        return decoratedCoffee.baga() + 100.00;
    }
}

