public class PiramideInvertida {
    public static void main(String[] args) {
        int filas=5;
        System.out.println(cadenaPiramideInvertida(filas));
    }

    public static String cadenaPiramideInvertida(int filas) {
        String salida = "";

        int ancho=(filas-1)*2+1;
        int espaciosIniciales=0;

        salida+="\n";

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < espaciosIniciales; j++) {
                salida+=" ";
            }
            for (int j = 0; j < ancho; j++) {
                salida+="*";
            }
            salida+="\n";
            ancho=ancho-2;
            espaciosIniciales++;
        }
        return salida;
    }

}

