package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    ArrayList<Item> list = new ArrayList<Item>();
    public ItemSorter(Item[] items) {
        list.add(new Item(1201L,"pen",10.0));
        list.add(new Item(1202L,"Pencil",8.0));
        list.add(new Item(1203L,"Book",30.0));
        list.add(new Item(1204L,"Notebook",20.0));

    }

    public ArrayList<Item> sort(Comparator<Item> comparator) {
        Collections.sort(list, comparator);
        for(int i =0;i<list.size();i++){
            Collections.sort(list, new IdComparator());
        }
        for(int i =0;i<list.size();i++){
            Collections.sort(list, new NameComparator());
        }
        for(int i =0;i<list.size();i++){
            Collections.sort(list, new PriceComparator());
        }

            return list;

    }
}
