import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private double xpTotal = 0;

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getCursos());
        this.conteudosInscritos.addAll(bootcamp.getMentorias());
        bootcamp.inscreverDev(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            this.xpTotal += conteudo.get().calcularXp();
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
        return this.xpTotal;
    }

    // Getters e Setters
}
