package br.com.unipar.pcbuild.models;

import java.util.ArrayList;

public class Peca implements Comparable<Peca> {

    private String marca;
    private Double valor;
    private String nome;
    private int id;
    private String tipoPeca;
    private ArrayList<Peca> listaPecas = new ArrayList<>();
    private int QtnEstoque;

    public Peca() {
    }

    public Peca(String marca, Double valor, String nome, int id, String tipoPeca, int QtnEstoque) {
        this.marca = marca;
        this.valor = valor;
        this.nome = nome;
        this.id = id;
        this.tipoPeca = tipoPeca;
        this.QtnEstoque = QtnEstoque;
    }

    public int getQtnEstoque() {
        return QtnEstoque;
    }

    public void setQtnEstoque(int QtnEstoque) {
        this.QtnEstoque = QtnEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPeca() {
        return tipoPeca;
    }

    public void setTipoPeca(String tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    public ArrayList<Peca> getListaPecas() {
        return listaPecas;
    }

    public void setListaPecas(ArrayList<Peca> listaPecas) {
        this.listaPecas = listaPecas;
    }

    @Override
    public String toString() {
        return "Peca{" + "marca=" + marca + ", valor=" + valor + ", nome=" + nome + ", id=" + id + ", tipoPeca=" + tipoPeca + '}';
    }

    public void diminuiEstoque() {
        QtnEstoque = QtnEstoque - 1;
    }

    @Override
    public int compareTo(Peca o) {

        int result = this.nome.compareTo(o.nome);

        if (result == 0) {
            return 0;
        } else {
            return result;
        }
    }

}
