import java.util.ArrayList;

/**
 * Created by Zver on 13.05.2017.
 */
public interface DataBase {
    void save(Integer element);

    Integer findById(int indexOfElement);

    void removeByIndex(int indexOfElement);

    ArrayList<Integer> findAllElements();
}
