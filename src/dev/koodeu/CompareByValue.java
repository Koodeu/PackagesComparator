package dev.koodeu;

import java.util.Comparator;

public class CompareByValue implements Comparator<Package> {

    @Override
    public int compare(Package aPackage, Package t1) {
//        return  aPackage.getValue() - t1.getValue();
        return Double.compare(aPackage.getValue(), t1.getValue());

    }
}
