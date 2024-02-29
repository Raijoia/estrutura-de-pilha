package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      System.out.println("Pilha de inteiros");
      PilhaDeInteiros p = new PilhaDeInteiros();
      p.empilhar(1);
      p.empilhar(2);
      p.empilhar(3);
      p.empilhar(4);
      p.empilhar(5);
      while (!p.estaVazia()) {
        System.out.println(p.desempilhar());
      }

      System.out.println("Pilha de Objetos");

      PilhaDeObjetos po =  new PilhaDeObjetos();
      po.empilhar("Tomate");
      po.empilhar(2);
      po.empilhar("Feijão");
      po.empilhar("Moto");
      po.empilhar(5);
      while (!po.estaVazia()) {
        System.out.println(po.desempilhar());
      }
    }
}