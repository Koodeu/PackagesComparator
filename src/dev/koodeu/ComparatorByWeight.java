package dev.koodeu;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Package> {

    @Override
    public int compare(Package aPackage, Package t1) {
        return Double.compare(aPackage.weight, t1.getWeight());
    }
}
