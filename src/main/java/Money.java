
class Money implements Expression
{
    private int amount;
    private String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    public Money reduce(String to) {
        return this;
    }
}
