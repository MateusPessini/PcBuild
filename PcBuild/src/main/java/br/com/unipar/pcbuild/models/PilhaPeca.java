package br.com.unipar.pcbuild.models;

public class PilhaPeca<Peca> {

    private Peca[] pilha;
    private int posicaoTopo;

    public int getPosicaoTopo() {
        return posicaoTopo;
    }

    public void setPosicaoTopo(int posicaoTopo) {
        this.posicaoTopo = posicaoTopo;
    }

    public PilhaPeca(int tamanho) {
        pilha = (Peca[]) new Object[tamanho];
        posicaoTopo = -1;
    }

    public void push(Peca e) {
        pilha[++posicaoTopo] = e;
    }

    public Peca pop() {
        return pilha[posicaoTopo--];
    }

    public Peca top() {
        return pilha[posicaoTopo];
    }

    public boolean isEmpty() {
        return posicaoTopo == -1;
    }

    public boolean isFull() {
        return posicaoTopo == pilha.length - 1;
    }

}
