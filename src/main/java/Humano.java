// Esta classe representa um humano e 
// extende os métodos abstratos de Hominideos

public class Humano extends Hominideos {
  private Double altura;
  private String nome;
  private int idade;

  
	public Humano(double altura, String nome, int idade) {
		super(altura, "Homo Sapiens Sapiens", true);
    this.altura = altura;
    this.nome = nome;
    this.idade = idade;
	}

  // Implementação dos métodos abstratos de Hominideos
	@Override
	public void emitirSom() {
    System.out.println("Uga Uga Uga");
		
	}

	@Override
	public void andar() {
    System.out.println("Estou andando");
		
	}

	@Override
	public void comer() {
		System.out.println("Estou comendo");
		
	}

// getters e setters
  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

// exibindo os dados no método toString 
  
  @Override
  public String toString() {
    return "Humano{" +
        "altura=" + altura +
        ", nome='" + nome + '\'' +
        ", idade=" + idade +
        '}';
  }
  
}