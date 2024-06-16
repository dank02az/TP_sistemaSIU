package aed;

import java.util.ArrayList;

public class Trie<T> {
    private Nodo _raiz;
    private int _tamanio;

    private class Nodo {
        private ArrayList<Nodo> _siguiente;
        private int _cantidadHijos;
        private T _definicion;

        public Nodo(){
            _siguiente = new ArrayList<Nodo>();
            _definicion = null;
            _cantidadHijos = 0;

        }
    }

    public void Definir(String clave, T definicion){
        return;
    }
    public void Borrar(String clave){
        return;
    }


}

