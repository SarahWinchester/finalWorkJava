import javax.swing.*;

public class attendant {



    public Main whatBook(){

       Icon icon2 = new ImageIcon(Main.class.getResource("img/qykiz3fu9ypht6filyhw.png"));
       int orderFinished =0;
       Integer[] optionBooks = { 1,2,3,4,5,6,7,8,9,10 };

       Main newList = new Main();


       JOptionPane.showMessageDialog(null, "Welcome to YaBook! \n \nPlease, select some books from our selection ","YaBook", JOptionPane.PLAIN_MESSAGE, icon2 );


      do{
          Integer whichBook = (Integer) JOptionPane.showInputDialog(null, "Select the  number of  your book to added in your Shopping Car: \n\n 1:- Name: Microservicios,  Author: Christian Posta,  Price: $45.98 \n\n 2:- Name: Patrones de diseño,  Author: Markus Eisele,  Price: $72.80 \n\n 3:- Name: Programación Orientada a Objetos,  Author: Richard Warbuton ,  Price: $36.72 \n\n 4:- Name: Aprendiendo Java,  Author: Ben Evans,  Price: $66.81 \n\n 5:- Name: Aprendiendo Python,  Author: David Mertz,  Price: $43.27 \n\n 6:- Name: Big Data con Hadoop,  Author: Donald Miner,  Price: $39.60 \n\n 7:- Name:  IOS con Swift,  Author: Tim Nugent:,  Price: $24.18 \n\n 8:- Name: Programación reactiva,  Author: Konrad Malawski ,  Price: $58.70 \n\n 9:- Name: Programación con C,  Author: Joel Falcou,  Price: $67.93 \n\n 10:- Name: Diseño de sistemas,  Author: Doug Davis,  Price: $55.67\n " , "YABOOK", JOptionPane.PLAIN_MESSAGE, icon2, optionBooks, 1);

          System.out.println(whichBook);

          switch (whichBook) {

              case 1:

                  Books newBook1 = new Books(Library.first.getName(),Library.first.getAuthor(),Library.first.getPrice());
                  newList.bookList.add(newBook1);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 2:

                  Books newBook2 = new Books(Library.second.getName(),Library.second.getAuthor(),Library.second.getPrice());
                  newList.bookList.add(newBook2);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 3:

                  Books newBook3 = new Books(Library.third.getName(),Library.third.getAuthor(),Library.third.getPrice());
                  newList.bookList.add(newBook3);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 4:
                  Books newBook4 = new Books(Library.fourth.getName(),Library.fourth.getAuthor(),Library.fourth.getPrice());
                  newList.bookList.add(newBook4);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 5:
                  Books newBook5 = new Books(Library.fifth.getName(),Library.fifth.getAuthor(),Library.fifth.getPrice());
                  newList.bookList.add(newBook5);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 6:
                  Books newBook6 = new Books(Library.sixth.getName(),Library.sixth.getAuthor(),Library.sixth.getPrice());
                  newList.bookList.add(newBook6);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 7:
                  Books newBook7 = new Books(Library.seventh.getName(),Library.seventh.getAuthor(),Library.seventh.getPrice());
                  newList.bookList.add(newBook7);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 8:

                  Books newBook8 = new Books(Library.eighth.getName(),Library.eighth.getAuthor(),Library.eighth.getPrice());
                  newList.bookList.add(newBook8);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 9:
                  Books newBook9 = new Books(Library.ninth.getName(),Library.ninth.getAuthor(),Library.ninth.getPrice());
                  newList.bookList.add(newBook9);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;

              case 10:
                  Books newBook10 = new Books(Library.tenth.getName(),Library.tenth.getAuthor(),Library.tenth.getPrice());
                  newList.bookList.add(newBook10);

                  orderFinished = JOptionPane.showConfirmDialog(null, "Do you want something else?", "YaBook", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                  break;
              default:

          }

      }while(orderFinished == 0);


        return newList;
    }

}
