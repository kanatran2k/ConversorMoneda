import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaAPI api = new ConsultaAPI();
        ArrayList<String> historial = new ArrayList<>();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("\n+-----------------------------------------------+");
            System.out.println("|    Bienvenido a Mi Conversor de Monedas       |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("[1]. USD -> CLP");
            System.out.println("[2]. USD -> ARS");
            System.out.println("[3]. ARS -> USD");
            System.out.println("[4]. BRL -> USD");
            System.out.println("[5]. USD -> EUR");
            System.out.println("[6]. EUR -> USD");
            System.out.println("[7]. HISTORIAL DE CONVERSIONES");
            System.out.println("[8]. SALIR");
            System.out.println("**********************************************\n");
            System.out.print("[Seleccione una opción (1-8):] \n");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto de dinero a convertir: ");
                double monto = scanner.nextDouble();

                String monedaBase = "";
                String monedaDestino = "";

                switch (opcion) {
                    case 1 -> { monedaBase = "USD"; monedaDestino = "CLP"; }
                    case 2 -> { monedaBase = "USD"; monedaDestino = "ARS"; }
                    case 3 -> { monedaBase = "ARS"; monedaDestino = "USD"; }
                    case 4 -> { monedaBase = "BRL"; monedaDestino = "USD"; }
                    case 5 -> { monedaBase = "USD"; monedaDestino = "EUR"; }
                    case 6 -> { monedaBase = "EUR"; monedaDestino = "USD"; }
                }

                Convertidor resultado = api.obtenerTasa(monedaBase, monedaDestino);

                if (resultado != null) {
                    // Calcular la conversión final y enviar al Convertidor
                    resultado.setResult(String.valueOf(monto * resultado.getConversion_rate()));
                    System.out.println(resultado.mostrarResultado(monto) + "\n");
                    // Registrar la Transaccion para revisión
                    String registro = resultado.mostrarResultado(monto);
                    historial.add(registro);
                }
            } else if (opcion == 7) {
                if (historial.isEmpty()) {
                    System.out.println("*********[No hay historial para mostrar]**********");
                } else {
                    System.out.println("+----------------------------------------------+");
                    System.out.println("+        [Revisión de Historial de Uso]        +");
                    System.out.println("+----------------------------------------------+");
                    System.out.println("\n");
                    for (String r : historial) {
                        System.out.println(r);
                        System.out.println("*******************************************");
                    }
                }
            } else if (opcion != 8) {
                System.out.println("@@@@@@@ Opción No Valida, Intente nuevamente @@@@@@@");
            }
        }
        System.out.println("!Programa Finalizado con Exito¡ mm(00)mm ¡Vuelva Pronto!");
    }
}

