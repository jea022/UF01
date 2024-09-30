public class SinVocales {
    public static void main(String[] args) {
        char[] caracteres = {'5', 'a', '9', 'n', 'i', '4', '2'};
        
        for (int i = 0; i < caracteres.length - 1; i++) {
            for (int j = i + 1; j < caracteres.length; j++) {
                if (caracteres[i] > caracteres[j]) {
                    char aux = caracteres[i];
                    caracteres[i] = caracteres[j];
                    caracteres[j] = aux;
                }
            }
        }
		
		
        for (int i = 0; i < caracteres.length; i++) {
            char caracterActual = caracteres[i];

            if (esVocal(caracterActual)) {
                caracteres[i] = '$';
            } else if (Character.isDigit(caracterActual)) {
                caracteres[i] = '*';
            }
        }

        System.out.print("El array ordenado y con reemplazos es: [");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i] + " ");
        }
        System.out.println("]");
    }


    private static boolean esVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
