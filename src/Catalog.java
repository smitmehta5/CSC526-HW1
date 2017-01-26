import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Smit on 20-01-17.
 */
public class Catalog implements Iterable<Item>{
    private String storeName;
    private List<Item> itemList;

    public Catalog(String storeName){
        this.itemList = new LinkedList<>();
        this.storeName = storeName;
    }

    @Override
    public Iterator<Item> iterator() {
        return itemList.iterator();
    }
}
