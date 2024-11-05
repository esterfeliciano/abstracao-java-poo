// Esta classe representa um humano e 
// extende os métodos abstratos de Hominideos

public class Gorilla extends Hominideos {
  private Double altura;
  private String localOndeVive;
  private boolean isChefeDoBando;

  public Gorilla(double altura, String localOndeVive, boolean isChefeDoBando) {
    super(altura, "Gorilla gorilla", false);
    this.altura = altura;
    this.localOndeVive = localOndeVive;
    this.isChefeDoBando = isChefeDoBando;
  }

  // Implementação dos métodos abstratos de Hominideos
  @Override
  public void emitirSom() {
    System.out.println("urru urru, urrú");

  }

  @Override
  public void andar() {
    System.out.println("andando pela floresta");

  }

  @Override
  public void comer() {
    System.out.println("Comendo frutas...");

  }

  // getters e setters
  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public String getLocalOndeVive() {
    return localOndeVive;
  }

  public void setLocalOndeVive(String localOndeVive) {
    this.localOndeVive = localOndeVive;
  }

  public boolean isChefeDoBando() {
    return isChefeDoBando;
  }

  public void setChefeDoBando(boolean chefeDoBando) {
    isChefeDoBando = chefeDoBando;
  }

  // exibindo os dados no método toString
  @Override
  public String toString() {
    return "Gorilla{" +
        "altura=" + altura +
        ", localOndeVive='" + localOndeVive + '\'' +
        ", isChefeDoBando=" + isChefeDoBando +
        '}';
  }

}