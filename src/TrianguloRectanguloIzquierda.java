public class TrianguloRectanguloIzquierda {
    public static void main(String[] args) {
        int filas = 5;
        System.out.println(cadenaTrianguloIzquierda(filas));
    }

    private static String cadenaTrianguloIzquierda(int filas) {
        String salida = "";

        int asteriscos = 1;
        int espacios = filas - 1;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < espacios; j++) {
                salida += " ";
            }
            for (int j = 0; j < asteriscos - i; j++) {
                salida += "*";
            }

            salida += "\n";
            asteriscos += 2;
            espacios--;
        }
        return salida;
    }
}
