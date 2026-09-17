package fileHandling;

import java.io.Serializable;

public class SerializationManager implements Serializable {

    int id;
    String name,Address;
    double salary;

    public SerializationManager(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        Address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SerializationManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
