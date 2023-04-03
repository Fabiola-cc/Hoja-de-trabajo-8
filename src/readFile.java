import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * @author - Grupo 7 HDT2
 *         Maria José Villafuerte
 *         Fabiola Contreras
 *         Madeline Castro
 *
 *         Codigo tomado de Hoja De Trabajo #2
 *         Propósito: Leer el arhivo txt que tendrá las operaciones a realizar
 * @date 30/01/2023
 */

public class readFile {
    static ArrayList<proceso> array_para_controlador;

    /**
     * Metodo que lee el documento con las operaciones Postfix y guarda los datos
     * dentro de ArrayList
     *
     * @param fpath Mensaje de lugar donde se encuentra el archivo datos.txt
     * @return data String
     */
    public static ArrayList<proceso> _readfile(String fpath) {
        array_para_controlador = new ArrayList<>();
        String data = "";

        try {

            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                data = myReader.nextLine();
                dividir_elementos(data);

            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return array_para_controlador;
    }

    /**
     * 'dividir_elementos' se encarga de separar una cadena de información,
     * permitiendo crear un objeto tipo proceso con esa información y guardarlo en
     * el arraylist destinado para utilizar durante el programa.
     * 
     * @param informacion
     */
    private static void dividir_elementos(String informacion) {
        String[] informacion_dividida = informacion.split(",");
        String nombre_proceso = informacion_dividida[0];
        String nombre_usuario = informacion_dividida[1];
        int valor_nice = Integer.valueOf(informacion_dividida[2]);
        proceso proceso_por_añadir = new proceso(nombre_proceso, nombre_usuario, valor_nice);

        array_para_controlador.add(proceso_por_añadir);
    }
}
