abstract class Transport {

    private String transportName;
    private int number;
    private double baseFare;

    public Transport(String transportName, int number, double baseFare) {
        this.transportName = transportName;
        this.number = number;
        this.baseFare = baseFare;
    }

    public String getTransportName() {
        return transportName;
    }

    public int getNumber() {
        return number;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public abstract double calculateFare();
}

class Car extends Transport {

    private double distance;

    public Car(String transportName, int number, double baseFare, double distance) {
        super(transportName, number, baseFare);
        this.distance = distance;
    }

    @Override
    public double calculateFare() {
        return getBaseFare() + (distance * 10);
    }
}

class Bus extends Transport {

    private int passengers;

    public Bus(String transportName, int number, double baseFare, int passengers) {
        super(transportName, number, baseFare);
        this.passengers = passengers;
    }

    @Override
    public double calculateFare() {
        return getBaseFare() + (passengers * 20);
    }
}

class Train extends Transport {

    private double distance;
    private String travelClass;

    public Train(String transportName, int number, double baseFare,
                 double distance, String travelClass) {

        super(transportName, number, baseFare);
        this.distance = distance;
        this.travelClass = travelClass;
    }

    @Override
    public double calculateFare() {

        double fare = getBaseFare() + (distance * 5);

        if (travelClass.equalsIgnoreCase("AC")) {
            fare += 500;
        } else if (travelClass.equalsIgnoreCase("Sleeper")) {
            fare += 200;
        }

        return fare;
    }
}

class practice {

    public static void main(String[] args) {

        Transport car = new Car(
                "Car",
                101,
                100,
                20
        );

        Transport bus = new Bus(
                "Bus",
                202,
                50,
                30
        );

        Transport train = new Train(
                "Train",
                303,
                100,
                200,
                "AC"
        );

        Transport[] transports = {car, bus, train};

        for (Transport transport : transports) {

            System.out.println("Transport Name: "
                    + transport.getTransportName());

            System.out.println("Transport Number: "
                    + transport.getNumber());

            System.out.println("Base Fare: "
                    + transport.getBaseFare());

            System.out.println("Calculated Fare: "
                    + transport.calculateFare());

            System.out.println("-------------------------");
        }
    }
}