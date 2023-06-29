public class Animal {
    // Atributos-características
    String nome;
    String raca;
    private double peso;
    String tipoPelo;
    String corOlhoDireito;

    // Getter e Setter
    public void setPeso(String chave, double peso){
        if(chave.equals("AD")){
            this.peso = peso;
        }else{
            // não pode gravar
        }

    }
    public Double getPeso(){
        return this.peso;
    }


    // mais sobrecargas do construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos-comportamento
    public void andar(){
        System.out.println("andou");
    }
    public void comer(){
        System.out.println("Animal Comeu!!!");
    }

    // Construtor padrão
    Animal(){

    }
    // sobrecarga do construtor
    Animal(String raca){
        this.raca = raca;
    }











}
