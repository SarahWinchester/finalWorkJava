import java.io.*;

public class ShoppingCar {


    public  void crearArchivo(String nombreArchivo, String texto){

        FileWriter fichero = null;

        PrintWriter pw = null;

        try {
            fichero = new FileWriter("/Users/Sarah/Downloads/" .concat(nombreArchivo));

            pw = new PrintWriter(fichero);

            pw.println(texto);



        } catch (IOException e) {

            e.printStackTrace();

        }finally {

            if (fichero != null){

                try {

                    fichero.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }
            }

        }


    }

   /* public void leerArchivo(String ruta){

        File file = null;
        FileReader fr = null;
        BufferedReader bufferedReader = null;

        file = new File(ruta);

        try {

            fr = new FileReader(file);
            bufferedReader = new BufferedReader(fr);

            String linea;

            while ((linea = bufferedReader.readLine())!= null){
                System.out.println(linea);

            }



        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                if(fr != null){

                    fr.close();
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }

            }catch ( IOException e){
                e.printStackTrace();
            }
        }
    }*/


}
