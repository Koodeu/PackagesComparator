package dev.koodeu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Package package1 = new Package(25.25, 5.31, LocalDate.of(2019,12,02));
        Package package2 = new Package(35.15, 8.31, LocalDate.of(2019,12,01));
        Package package3 = new Package(6.17, 0.41, LocalDate.of(2019,11,18));
        Package package4 = new Package(141.12, 1.15, LocalDate.of(2019,11,29));
        Package package5 = new Package(41.94, 2.14, LocalDate.of(2019,11,21));


        ArrayList<Package> listOfPackages = new ArrayList<>();

        listOfPackages.add(package1);
        listOfPackages.add(package2);
        listOfPackages.add(package3);
        listOfPackages.add(package4);
        listOfPackages.add(package5);

        System.out.println("------ UNSORTED ------");

        for (Package pckg : listOfPackages){
            System.out.println(pckg.toString());
        }


        Collections.sort(listOfPackages,new CompareByValue());

        System.out.println("\n------ SORTED BY VALUE increasing-----");
        for (Package pckg : listOfPackages) {
            System.out.println(pckg.toString());
        }


            System.out.println("\n------ SORTED BY SHIPMENT DATE INCREASING ------");
            Collections.sort(listOfPackages);
            for (Package paczka : listOfPackages){
                System.out.println(paczka.toString());
            }

        System.out.println("\n------ SORTED BY SHIPMENT DATE DECREASING ------");
            Collections.sort(listOfPackages, new ComparatorByShipmentDateDecreasing());
            for (Package paczka : listOfPackages){
                System.out.println(paczka.toString());
            }

        System.out.println("\n------ SORTED BY WEIGHT DATE INCREASING ------");
            Collections.sort(listOfPackages, new ComparatorByWeight());
            for (Package paczka : listOfPackages){
                System.out.println(paczka.toString());
            }

    }


}
