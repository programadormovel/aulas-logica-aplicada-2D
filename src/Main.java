public class Main {


    public static void main(String[] args) {
        // Aula inicial de Orientação à Objetos
        Pessoa adao = new Pessoa();
        // Declaração
        Pessoa qualquer;
        // Instanciação
        qualquer = new Pessoa();
        // Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));

        // Criar mais objetos
        Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        int y = 0;
        Animal roedor; // Declarar
        roedor = new Animal(); // Instanciar
        Animal x; // declaração
        x = new Animal();

        // Consultar dados do objeto cao
        cao.nome = "Pluto";  // Atribuição
        System.out.println(cao.nome); // Consulta
        cao.comer(); //chamada de método
        Pessoa nova = new Pessoa();
        nova.nome = "Tina";
        nova.comer();

        // construir objetos
        Semente s1 = new Semente();
        Animal cao1 = new Animal("Pastor");
        Animal gato1 = new Animal("laranja");
        Animal gato3;
        gato3 = new Animal();
        gato3 = new Animal("preto e branco");
        Animal coelho;
        coelho = new Animal("Roger", "Rabbit");
        //coelho.peso = 2.5;
        coelho.setPeso("XY",2.5);
        //System.out.println(coelho.peso);
        System.out.println(coelho.getPeso());






    }



}