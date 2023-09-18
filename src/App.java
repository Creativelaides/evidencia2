import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //  Menu 1
        System.out.println(
            "Hola Bienvenido al E-Commerce de la Tienda X \n" +
            "¿Qué deseas hacer? \n" +
            "1. Revisar las ventas \n" +
            "2. Ingresar una venta \n"
            );

        int option = Integer.parseInt(System.console().readLine());
        
        while (option != 1 || option != 2) {
            
            System.out.println(
                "Numero erróneo \n" +
                "Ingresa una opción correcta \n"
                );

            option = Integer.parseInt(System.console().readLine());
        };

        // Menu 2
        System.out.println(
            "Por favor selecciona el día de la semana \n" +
            "1. Lunes \n" +
            "2. Martes \n" +
            "3. Miércoles \n" +
            "4. Jueves \n" +
            "5. Viernes \n" +
            "6. Sábado \n" +
            "7. Domingo \n"
            );

        int day = Integer.parseInt(System.console().readLine());

        // Venta
        do {
            System.out.println(
                "Por favor ingresa el monto de la venta \n"
                );

            double sale = Double.parseDouble(System.console().readLine());

            System.out.println(
                "¡Venta registrada con éxito!\n\n" +
                "¿Deseas ingresar otra venta? \n" +
                "1. Si \n" +
                "2. No \n");

            option = Integer.parseInt(System.console().readLine());
            do {
                System.out.println(
                    "Numero erróneo \n" +
                    "Ingresa una opción correcta \n"
                    );
            } while (option != 1 || option != 2);
            
        } while (option == 1);

        // Crear un conjunto de claves ÚNICAS
        final List<String> daysKeys = new ArrayList<>(List.of(
            "Lunes", 
            "Martes", 
            "Miércoles",
            "Jueves",
            "Viernes",
            "Sábado",
            "Domingo"
        ));

        // Crear un diccionario con claves de tipo String y valores de tipo List<Double>
        HashMap<String, List<Double>> ecommerce = new HashMap<>();

        // Agregar elementos al diccionario
        

       /*     List<Integer> valores2 = new ArrayList<>();
        valores2.add(3);
        valores2.add(4);
        valores2.add(5);
        dictionary.put("clave2", valores2);

        // Acceder a elementos en el diccionario
        List<Integer> valoresDeClave1 = dictionary.get("clave1");
        System.out.println("Valores asociados con clave1: " + valoresDeClave1);

        // Iterar con un for-each a través del diccionario
        for (Map.Entry<String, List<Integer>> entry : dictionary.entrySet()) {
            String clave = entry.getKey();
            List<Integer> valores = entry.getValue();
            System.out.println("Clave: " + clave + ", Valores: " + valores);
        } */
    }
}
