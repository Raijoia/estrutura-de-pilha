package org.example;

public class PilhaDeObjetos {
  public Object[] pilha;
  public int indicePilha;

  public PilhaDeObjetos() {
    this.indicePilha = -1;
    this.pilha = new Object[100];
  }

  public boolean estaVazia() {
    if(this.indicePilha == -1) {
      return true;
    }
    return false;
  }

  public int tamanho() {
    if (this.estaVazia()) {
      return 0;
    }
    return this.indicePilha + 1;
  }

  public Object mostraTopo() {
    if (this.estaVazia()) {
      return -1;
    }
    return this.pilha[indicePilha];
  }

  public Object desempilhar() {
    if(estaVazia()) {
      return -1;
    }
    return this.pilha[this.indicePilha--];
  }

  public void empilhar(Object valor) {
    if(this.indicePilha < this.pilha.length) {
      indicePilha++;
      this.pilha[indicePilha] = valor;
    }
  }
}
