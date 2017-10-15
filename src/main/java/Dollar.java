
class Dollar
{
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj)
    {
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
