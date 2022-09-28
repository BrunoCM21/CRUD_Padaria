package model;

public class Produto {

    private int id;
    private String nomeMarca;
    private double valor;
    private double peso;

    public Produto() {
    }

    public Produto(int id, String nomeMarca, double valor, double peso) {
        this.id = id;
        this.nomeMarca = nomeMarca;
        this.valor = valor;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }   
    
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
