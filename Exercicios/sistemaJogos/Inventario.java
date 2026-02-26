package Exercicios.sistemaJogos;

import java.util.*;

public class Inventario {
     private List<Item> itens = new ArrayList<>();

     public List<Item> getItens() {
         return itens;
     }

     public void setItens(List<Item> itens) {
         this.itens = itens;
     }
}
