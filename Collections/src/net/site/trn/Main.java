package net.site.trn;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private final static int SIZE = 100000;

    public static void main(String[] args) {

        Generator generator = new Generator();
        Collection<Egar> arr1 = generator.generateCollection(SIZE);
        Collection<Egar> arr2 = generator.generateCollection(SIZE);
        System.out.println(
                findDuplicates(arr1, arr2)
        );
    }

    private static List<Egar> findDuplicates(Collection<Egar> arr1, Collection<Egar> arr2) {
        long start = System.currentTimeMillis();

        Egar first = null;
        Egar second = null;
        List<Egar> duplicates = new LinkedList<>();

        if (arr1.size() == arr2.size()) {
            Iterator<Egar> firstIterator = arr1.iterator();
            Iterator<Egar> secondIterator = arr2.iterator();

//Cycle to find duplicates from two collections

            while (firstIterator.hasNext()) {
                first = firstIterator.next();
                while (secondIterator.hasNext()) {
                    second = secondIterator.next();
                    if (first.equals(second)) {
                        duplicates.add(first);
                    }
                }
            }
        }



        long finish = System.currentTimeMillis();
        long methodExecutionTimeMillis = finish - start;
        System.out.println(String.format("Execution time of duplicates method: %d Millis",methodExecutionTimeMillis));

        return duplicates;
    }
}
