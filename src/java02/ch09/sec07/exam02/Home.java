package java02.ch09.sec07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("turn on TV");
        }

        @Override
        public void turnOff() {
            System.out.println("turn off TV");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("turn on Air Conditioner");
            }

            @Override
            public void turnOff() {
                System.out.println("turn off Air Conditioner");
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
