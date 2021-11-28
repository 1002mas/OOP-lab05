package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * @param setA a set
     * @param setB another set
     * @param <X>  Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> setC = new TreeSet<>(setA);
        setC.addAll(setB);
        return setC;
    }

    /**
     * @param setA a set
     * @param setB another set
     * @param <X>  Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> setC = new TreeSet<>();

        for (X element : setA) {
            if (setB.contains(element)) {
                setC.add(element);
            }
        }

        return setC;
    }

    /**
     * @param setA a set
     * @param setB another set
     * @param <X>  Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> union = setUnion(setA, setB);
        Set<X> intersection = setIntersection(setA, setB);

        union.removeAll(intersection);

        return union;
    }

    /**
     * @param coll the collection
     * @param <X>  collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
        final int stop = coll.size() - 1;
        int i = 0;
        X result = null;
        for (X element : coll) {
            if (Math.random() < 0.6 || i == stop) {
                result = element;
                break;
            }
            i++;
        }
        return result;
    }

    /**
     * @param first  first collection
     * @param second second collection
     * @param <X>    First collection type
     * @param <Y>    Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
        X firstElement = getRandomElement(first);
        Y secondElement = getRandomElement(second);
        return new Pair<X, Y>(firstElement, secondElement);
    }
}
