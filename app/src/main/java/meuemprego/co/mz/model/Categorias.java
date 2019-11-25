package meuemprego.co.mz.model;

public class Categorias {
    private String categoria;
    private int color;

    public Categorias(String categoria, int color) {
        this.categoria = categoria;
        this.color = color;
    }

    public Categorias() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
