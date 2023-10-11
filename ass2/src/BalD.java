class BalD implements Coffee {
    private final Coffee decoratedCoffee;

    public BalD(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Бал";
    }
    // дескриптор бойынша getDescription қолданылады түрін білу үшін
    @Override
    public double baga() {
        return decoratedCoffee.baga() + 100.0;
    } //бағасын анықтау үшін
}