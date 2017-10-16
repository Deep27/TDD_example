
public class Franc
{
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj)
    {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
