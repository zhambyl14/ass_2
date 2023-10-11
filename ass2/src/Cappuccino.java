class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Капучино";
    }
    // дескриптор бойынша getDescription қолданылады түрін білу үшін
    @Override
    public double baga() {
        return 800.00;
    }//бағасын анықтау үшін
}
