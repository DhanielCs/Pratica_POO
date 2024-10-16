public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    // Método abstrato que será implementado pelas subclasses
    public abstract double calcularXp();

    // Getters e Setters
}
