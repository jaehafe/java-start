package java02.ch09.sec07.exam01;

public class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("anonymous Tire 1 is rolling");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("anonymous Tire2 is moving");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
