package code.textfinder;

class Node {
    private String dato;
    private Node izquierda, derecha;

    public Node(String dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }
    public String getDato() {
        return dato;
    }

    public Node getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node izquierda) {
        //System.out.println(izquierda);
        this.izquierda = izquierda;
    }

    public Node getDerecha() {
       // System.out.println(derecha);
        return derecha;

    }

    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}