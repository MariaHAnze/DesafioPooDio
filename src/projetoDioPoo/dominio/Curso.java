package projetoDioPoo.dominio;

public class Curso extends Conteudo{

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Curso() {
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " +
                getTitulo() + ", " +
                getDescricao() +
                ", carga horaria de " + cargaHoraria + " horas." + '\n';

    }
}
