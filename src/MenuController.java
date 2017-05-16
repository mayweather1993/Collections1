
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zver on 13.05.2017.
 */
public class MenuController {
    DataBase base;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public MenuController(DataBase base) {
        this.base = base;
    }

    void addElementMenuItem() throws IOException {
        System.out.println("Enter your element");
        int a = Integer.parseInt(reader.readLine());
        base.save(a);
        System.out.println("Now your array : " + base.findAllElements());
    }

    void removeElement() throws IOException {
        System.out.println("Enter your index element to delete");
        int index = Integer.parseInt(reader.readLine());
        base.removeByIndex(index);
        System.out.println("Now you have array of your elements :" + base.findAllElements());
    }

    void findElement() throws IOException {
        System.out.println("Enter your number");
        int element = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list2 = base.findAllElements();

        boolean numberExist = isNumberExist(list2, element);
        if (numberExist) {
            System.out.println("We find your number");
            System.out.println(element);
        } else {
            System.out.println("We cant find your number");
        }

    }

    void findMaxElement() {
        System.out.println("Lets find your maximal element of array");
        int maxElement = CollectionUtils.getMaxElement(base.findAllElements());
        System.out.println("Maximal element of you array: " + maxElement);

    }

    void findMinElement() {
        System.out.println("Lets find you minimal element of array");
        int minElement = CollectionUtils.getMinElement(base.findAllElements());
        System.out.println("minimal element of you array: " + minElement);

    }

    void getAverage() {
        ArrayList<Integer> list = base.findAllElements();
        System.out.println("Lets find average of your array ");
        System.out.println("Average : " + CollectionUtils.getAverage(list));
    }

    void showMenu() {
        System.out.println("What you gonna do?");
        System.out.println("1. Add an element");
        System.out.println("2. Delete an element");
        System.out.println("3. Find your element");
        System.out.println("4. Find your element(index)");
        System.out.println("5. Find your max element");
        System.out.println("6. Find your min element");
        System.out.println("7. Find your average of array");
        System.out.println("8: Quit a program");
    }

    private static boolean isNumberExist(List<Integer> list, int a) {
        for (int b : list) {
            if (b == a) {
                return true;
            }
        }
        return false;
    }

    public void findElementByIndex() throws IOException {
        System.out.println("Lets find your element by index");
        int index = Integer.parseInt(reader.readLine());
        System.out.println("We find your number :" + base.findById(index));
    }
}
