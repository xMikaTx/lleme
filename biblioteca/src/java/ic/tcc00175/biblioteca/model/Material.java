package ic.tcc00175.biblioteca.model;
// Generated Oct 3, 2013 6:26:57 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Material generated by hbm2java
 */
public class Material implements java.io.Serializable {

    private long codigo;
    private String titulo;
    private Set revistas = new HashSet(0);
    private Set exemplars = new HashSet(0);
    private Set cds = new HashSet(0);
    private Set livros = new HashSet(0);

    public Material() {
    }

    public Material(long codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Material(long codigo, String titulo, Set revistas, Set exemplars, Set cds, Set livros) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.revistas = revistas;
        this.exemplars = exemplars;
        this.cds = cds;
        this.livros = livros;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set getRevistas() {
        return this.revistas;
    }

    public void setRevistas(Set revistas) {
        this.revistas = revistas;
    }

    public Set getExemplars() {
        return this.exemplars;
    }

    public void setExemplars(Set exemplars) {
        this.exemplars = exemplars;
    }

    public Set getCds() {
        return this.cds;
    }

    public void setCds(Set cds) {
        this.cds = cds;
    }

    public Set getLivros() {
        return this.livros;
    }

    public void setLivros(Set livros) {
        this.livros = livros;
    }
}
