public class Main {
  public static void main(String[] args) {
    // Classe Humano instanciada
    Humano humano = new Humano(1.70, "João", 30);
    // Classe Gorilla instanciada
    Gorilla gorilla = new Gorilla(1.80, "Sul", true);

    // Mostrando todos os métodos dos objetos
    humano.emitirSom();
    humano.andar();
    humano.comer();
    System.out.println(humano);
    System.out.println();
    gorilla.emitirSom();
    gorilla.andar();
    gorilla.comer();
    System.out.println(gorilla);
  }

}