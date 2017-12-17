import java.util.Hashtable;

class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        Integer rate = rates.get(new Pair(from, to));
        return rate;
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    private class Pair {
        private String from;
        private String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Pair && (from.equals(((Pair) obj).from) && to.equals(((Pair) obj).to));
        }
    }
}
