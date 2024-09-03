package JAVA_Theory.ExceptionHandling.RunTimeException;

public class ClassCast {
    public static void main(String[] args) {
        Veh v1 = new Bike(10, "Honda");
        Veh v2 = new Car(12, "Nexa");
        System.out.println(v1.display(v1).id);
        System.out.println(v2.display(v2));
    }
}

class Veh {
    int id;
    String name;

    Veh display(Veh obj) {
        if (obj instanceof Car) {// DownCasting explicitly
            Car c = (Car) obj;
            return c;
        } else {
            Veh v = (Veh) obj;
            return v;
        }
    }
}

class Car extends Veh {
    Car(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Bike extends Veh {
    Bike(int id, String name) {
        this.id = id;
        this.name = name;
    }
}