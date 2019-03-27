import java.util.ArrayList;
import java.util.List;


public class printCheck {

    List<Double> numToSum = new ArrayList<>();
    double sum = 0;

    public void bringObjects(Main print){

        System.out.println("\n»»---------------------►");
        System.out.println("\nYOU ORDER: " + print.bookList.size() + " BOOKS");
        System.out.println("\n--------------------");


        for (int i = 0 ; i < print.bookList.size() ; i++) {
            System.out.print("\nName: " + print.bookList.get(i).getName());
            System.out.print("\nAuthor: " + print.bookList.get(i).getAuthor());
            System.out.print("\nPrice: $" + print.bookList.get(i).getPrice() + "\n");

            System.out.println("\n--------------------");
            numToSum.add(print.bookList.get(i).getPrice());


        }

        for( Double price : numToSum){
            sum += price;
        }
        System.out.println("\nCheck: $" + sum);
    }

}
