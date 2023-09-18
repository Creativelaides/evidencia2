import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un conjunto de claves ÚNICAS
        final List<String> daysKeys = new ArrayList<>(List.of(
            "Lunes",
            "Martes",
            "Miércoles",
            "Jueves",
            "Viernes",
            "Sábado",
            "Domingo"
            )
        );

        // Diccionario para almacenar las ventas de la semana
        HashMap<String, List<Double>> salesWeek = new HashMap<>();

        int menuChoice;
        do {
            // Menú principal
            System.out.println(
                "Hola Bienvenido al E-Commerce de la Tienda X \n" +
                "¿Qué deseas hacer? \n" +
                "1. Revisar las ventas \n" +
                "2. Ingresar una venta \n" +
                "3. Mostrar días con ventas superiores a $700,000 \n" +
                "4. Salir \n"
            );

            menuChoice = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer un entero

            switch (menuChoice) {
                case 1:
                    // Consultar ventas de la semana
                    for (Map.Entry<String, List<Double>> entry : salesWeek.entrySet()) {
                        String weekDay = entry.getKey();
                        List<Double> saleDay = entry.getValue();
                        System.out.println("Día: " + weekDay + ", Ventas: " + saleDay);
                    }
                    break;
                case 2:
                    // Ingresar una venta
                    // Seleccionar el día de la semana
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

                    int day;
                    do {
                        day = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consumir la nueva línea después de leer un entero

                        if (day >= 0 && day < daysKeys.size()) {
                            System.out.println("Seleccionaste el día: " + daysKeys.get(day));
                        } else {
                            System.out.println("Ingresa una opción válida");
                        }
                    } while (day < 0 || day >= daysKeys.size());

                    // Ingresar el monto de la venta
                    System.out.println("Por favor ingresa el monto de la venta:");
                    double sale = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea después de leer un double

                    // Agregar la venta a la lista correspondiente
                    String selectedDay = daysKeys.get(day);
                    salesWeek.computeIfAbsent(selectedDay, k -> new ArrayList<>()).add(sale);

                    System.out.println("Venta registrada en el día " + selectedDay);
                    break;
                case 3:
                    // Mostrar días con ventas superiores a $700,000
                    System.out.println("Días con ventas superiores a $700,000:");
                    for (Map.Entry<String, List<Double>> entry : salesWeek.entrySet()) {
                        String weekDay = entry.getKey();
                        List<Double> saleDay = entry.getValue();
                        double totalSales = saleDay.stream().mapToDouble(Double::doubleValue).sum();
                        if (totalSales > 700000) {
                            System.out.println("Día: " + weekDay + ", Ventas Totales: $" + totalSales);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }

        } while (menuChoice != 4);

        scanner.close();
    }
}
