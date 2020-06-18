package dev.koodeu;

import java.time.LocalDate;
import java.util.Comparator;

public class Package  implements Comparable<Package> {

    protected  double value;
    protected double weight;
    protected LocalDate shipDate;

    public Package(double value, double weight, LocalDate shipDate) {
        this.value = value;
        this.weight = weight;
        this.shipDate = shipDate;
    }

    public double getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setShipDate(LocalDate shipDate) {
        this.shipDate = shipDate;
    }

    @Override
    public String toString() {
        return "Package{" +
                "value=" + value +
                ", weight=" + weight +
                ", shipDate=" + shipDate +
                '}';
    }

    @Override
    public int compareTo(Package aPackage) {
        int result = this.shipDate.compareTo(aPackage.shipDate);
        return result;
    }



}
