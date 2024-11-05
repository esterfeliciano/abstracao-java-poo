/*
* Esta classe é responsável por representar a família dos hominídeos.

* Familia essa que contém os 4 generos dos grandes primatas
* - Gorillas
* - Humanos
* - Chimpanzés
* - Orangotangos
*/
public abstract class Hominideos {
  private Double altura; // Pega a altura do animal
  private String especie; // Pega a espécia do animal
  private boolean isBipede; // Animal é bipede ou não

  public Hominideos(Double altura, String especie, boolean isBipede){
    this.altura = altura;
    this.especie = especie;
    this.isBipede = isBipede;
  }

  public abstract void emitirSom();

  public abstract void andar();

  public abstract void comer();
  
  }
