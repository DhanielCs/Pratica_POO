import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Curso> cursos = new LinkedHashSet<>();
    private Set<Mentoria> mentorias = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    // Getters e Setters

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        this.mentorias.add(mentoria);
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
    }

    // Outros métodos úteis podem ser adicionados aqui
}
