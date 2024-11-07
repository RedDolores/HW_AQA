package lesson3;

public class Park {
    private Attraction attraction;

    public class Attraction {
        private String name;
        private String schedule;
        private int price;

        public Attraction(String name, String schedule, int price) {
            this.name = name;
            this.schedule = schedule;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", schedule='" + schedule + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
