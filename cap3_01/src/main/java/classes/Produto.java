package classes;

import java.util.Objects;

/**
 *
 * @author steph
 */
public class Produto {
        private String cod;
    private String nome;
    private double custo;
    private double preco;

    public Produto() {
        this.cod = "";
        this.nome = "";
        this.custo = 0.0;
        this.preco = 0.0;
    }

    public Produto(String cod, String nome, double custo, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }
    
    public Produto(Produto outro) {
        this.cod = outro.getCod();
        this.nome = outro.getNome();
        this.custo = outro.getCusto();
        this.preco = outro.getPreco();
    }
    
    public void copiar(Produto outro) {
        this.cod = outro.getCod();
        this.nome = outro.getNome();
        this.custo = outro.getCusto();
        this.preco = outro.getPreco();
    }

    @Override
    public String toString() {
        return "Produto{ cod="+ getCod() + ", nome=" + getNome() + ", custo=" + getCusto() + ", preco=" + getPreco() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cod);
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
        return Objects.equals(this.cod, other.cod);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
