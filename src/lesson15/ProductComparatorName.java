package lesson15;

import java.util.Comparator;

/**
 * Created by student on 2/11/2018.
 */
public class ProductComparatorName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
