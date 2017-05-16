import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zver on 08.05.2017.
 */
public class MainController {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuController controller = new MenuController(new CollectionDataBase());
        int decision;
        do {
            controller.showMenu();
            decision = Integer.parseInt(reader.readLine());
            switch (decision) {
                case 1:
                    controller.addElementMenuItem();
                    break;
                case 2:
                    controller.removeElement();
                    break;
                case 3:
                    controller.findElement();
                    break;
                case 4:
                    controller.findElementByIndex();
                    break;
                case 5:
                    controller.findMaxElement();
                    break;
                case 6:
                    controller.findMinElement();
                    break;
                case 7:
                    controller.getAverage();

                    break;
                case 8:
                    System.out.println("Thanks for using my program,goodbye");
                    break;
                default: {
                    System.out.println("Incorrect choice , try again");
                }
            }

        }
        while (decision != 8);


    }


}





