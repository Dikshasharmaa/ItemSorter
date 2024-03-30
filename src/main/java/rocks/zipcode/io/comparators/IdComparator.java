package rocks.zipcode.io.comparators;
import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator  implements Comparator<Item> {

    @Override
    public int compare(Item a, Item b) {
        return (int) (a.getId() - b.getId());
    }
}
