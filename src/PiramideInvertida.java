public class PiramideInvertida {
    public static void main(String[] args) {
        int filas=5;
        System.out.println(cadenaPiramideInvertida(filas));
    }

    public static String cadenaPiramideInvertida(int filas) {
        String salida = "";
        int asteriscos = (filas - 1) * 2 + 1;
        int espacios = 0;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < espacios; j++) {
                salida+=" ";
            }
            for (int j = 0; j < asteriscos; j++) {
                salida+="*";
            }

            salida+="\n";
            asteriscos -= 2;
            espacios++;
        }
        return salida;
    }

}

