public class MatrizDos {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("VECTOR");
        System.out.println("---------------------");

        int[] arrayParells = new int[10];
        for (int i = 0; i < arrayParells.length; i++) {
            arrayParells[i] = i * 10;
            System.out.println("La posició " + i + " del vector arrayParells val: " + arrayParells[i]);
        }

        System.out.println();
        System.out.print("[ ");
        for (int i = 0; i < arrayParells.length; i++) {
            System.out.print(arrayParells[i] + " ");
        }
        System.out.println(" ]");

        System.out.println("---------------------");
        System.out.println("MATRIU");
        System.out.println("---------------------");

        int[][] matriuParells = new int[10][10];

        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matriuParells[i][j] = 1;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    matriuParells[i][j] = 2;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    matriuParells[i][j] = 3;
                } else {
                    matriuParells[i][j] = 4;
                }
                System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriuParells[i][j]);
            }
            System.out.println("La fila " + i + " de la matriu matriuParells ja està tota plena");
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                System.out.print(matriuParells[i][j] + " ");
            }
            System.out.println("   --> Fila " + i);
        }
    }
}
