package dev.koodeu;

import java.util.Comparator;

public class ComparatorByShipmentDateDecreasing implements Comparator<Package> {

    @Override
    public int compare(Package aPackage, Package t1) {
        int result = aPackage.getShipDate().compareTo(t1.getShipDate());
        return -1 * result;
    }
}
