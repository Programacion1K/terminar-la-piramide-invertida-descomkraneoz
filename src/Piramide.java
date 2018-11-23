public class Piramide {
    public static void main(String[] args) {
        int filas = 5;
        System.out.println(cadenaPiramide(filas));

    }

    private static String cadenaPiramide(int filas) {
        String salida = "";
        int asteriscos = 1;
        int espacios = filas - 1;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < espacios; j++) {
                salida += " ";
            }
            for (int j = 0; j < asteriscos; j++) {
                salida += "*";
            }

            salida += "\n";
            asteriscos += 2;
            espacios--;
        }
        return salida;
    }
}
