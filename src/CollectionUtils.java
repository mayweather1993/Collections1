import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Zver on 13.05.2017.
 */
public class CollectionUtils {
    static Integer getMaxElement(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    static Integer getMinElement(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    static Double getAverage(ArrayList<Integer> list) {

        double average = 0D;

        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
        }
        average /= list.size();

        return average;

    }


}
