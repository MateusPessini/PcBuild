package br.com.unipar.pcbuild.models;

public class PilhaPc<Computador> {

    private Computador[] pilha;
    private int posicaoTopo;

    public int getPosicaoTopo() {
        return posicaoTopo;
    }

    public void setPosicaoTopo(int posicaoTopo) {
        this.posicaoTopo = posicaoTopo;
    }

    public PilhaPc(int tamanho) {
        pilha = (Computador[]) new Object[tamanho];
        posicaoTopo = -1;
    }

    public void push(Computador e) {
        pilha[++posicaoTopo] = e;
    }

    public Computador pop() {
        return pilha[posicaoTopo--];
    }

    public Computador top() {
        return pilha[posicaoTopo];
    }

    public boolean isEmpty() {
        return posicaoTopo == -1;
    }

    public boolean isFull() {
        return posicaoTopo == pilha.length - 1;
    }

}
