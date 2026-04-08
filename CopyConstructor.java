class Car {
    String model;

    Car(String m) {
        model = m;
    }

    Car(Car c) {
        model = c.model;
    }

}

class CopyConstructor{
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        Car c2 = new Car(c1); // c1 and c2 are two different objects but they have the same value for the model property because we are using a copy constructor to create c2 from c1.

        System.out.println(c2.model);
    }
}


