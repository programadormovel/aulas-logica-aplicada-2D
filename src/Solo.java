public class Solo {
    // Atributos
    String tipoSolo;
    boolean fertil;
    String cor;
    // Método
    public Planta gerarPlanta(Semente semente){
        return new Planta(semente);
    }
}
