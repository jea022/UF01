public class MediaSuspensoBs {
  public static void main(String[] args) {
    float[] Notas = {5.5f, 9f, 2f, 10f, 4.9f};
    int Suspensos = 0;

    for (int i = 0; i < Notas.length - 1; i++) {
      for(int j = i + 1; j < Notas.length; j++) {
        if (Notas[i] > Notas[j]) {
          float aux = Notas[i];
          Notas[i] = Notas[j];
          Notas[j] = aux;
        }
      }
    }

    float sumaSuspensos = 0;

    for (int i = 0; i < Notas.length; i++) {
      if (Notas[i] < 5.0f) { // Define aquí el umbral para considerar a un estudiante como suspendido.
        sumaSuspensos += Notas[i];
        Suspensos++;
      }
    }

    float mediaSuspensos = Suspensos > 0 ? sumaSuspensos / Suspensos : 0;

    System.out.println("La media de los estudiantes suspendidos es: " + mediaSuspensos);

    System.out.print("El array ordenado es: [");
    for (int i = 0; i < Notas.length; i++) {
      System.out.print(Notas[i] + " ");
    }
    System.out.println("]");
  }
}
