package ch09.section07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("turn on tv");
        }

        @Override
        public void turnOff() {
            System.out.println("turn off tv");
        }
    };

    // method
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("turn on air conditioner");
            }

            @Override
            public void turnOff() {
                System.out.println("turn off air conditioner");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
