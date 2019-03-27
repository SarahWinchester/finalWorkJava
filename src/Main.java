import java.util.ArrayList;
import java.util.List;

public class Main {

    List<Books> bookList = new ArrayList<>();

    @Override
    public String toString() {

        return super.toString();
    }

    /*
    public void StringAskingChars(){
        StringBuilder checkString = new StringBuilder();
        ShoppingCar check = new ShoppingCar();

        String words;

        for (int i = 0; i <  bookList.size(); i++) {

            System.out.print("\n"+ (i+1)+ ": ");
            words = "\nName: " + toString(bookList.get(i).getName()) +
                    "\nAuthor: " + bookList.get(i).getAuthor();

            checkString.append(words);
            checkString.append(" ");

        }

        check.crearArchivo("Check.txt", "words");

    }*/


    public static void main(String[] args) {


       attendant meh = new attendant();
       Main newShopping = meh.whatBook();

       printCheck printing = new printCheck();
       printing.bringObjects(newShopping);

      // Main create = new Main();
      // create.StringAskingChars();



    }
}
