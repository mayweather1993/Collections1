import java.util.ArrayList;

/**
 * Created by Zver on 13.05.2017.
 */
public class CollectionDataBase implements DataBase {

    ArrayList<Integer> list = new ArrayList<>();


    @Override
    public void save(Integer element) {
        list.add(element);
    }

    @Override
    public Integer findById(int indexOfElement) {
        return list.get(indexOfElement);
    }

    @Override
    public void removeByIndex(int indexOfElement) {
        list.remove(indexOfElement);
    }

    @Override
    public ArrayList<Integer> findAllElements() {
        return list;
    }
}
