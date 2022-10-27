package code.textfinder;

import java.io.*;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class BinarySearchTree {
    private Node raiz;

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    String vecino;

    private boolean existe(Node n, String busqueda) {
        if (n == null) {
            System.out.println("No existe");
            return false;
        }
        if (n.getDato().equals(busqueda)) {

            System.out.println(n.getDato());
            System.out.println(n.getIzquierda());
            System.out.println(n.getDerecha());
            System.out.println("Si existe");
            return true;

        } else if (busqueda.compareTo(n.getDato()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public boolean existe_cadena(String busqueda) {
        return existe_cadena(this.raiz, busqueda);
    }

    private boolean existe_cadena(Node n, String busqueda) {
        if (n == null) {
            System.out.println("No existe");
            return false;
        }
        if (n.getDato().equals(busqueda)) {

            System.out.println(n.getDato());
            System.out.println(n.getIzquierda());
            System.out.println(n.getDerecha());
            System.out.println("Si existe");
            return true;

        } else if (busqueda.compareTo(n.getDato()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }


    public void insertar(String dato) {
        if (this.raiz == null) {
            this.raiz = new Node(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Node padre, String dato) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Node(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Node(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(Node n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Node n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Node n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }

    public void lector() throws IOException {
        File fichero = new File("C:\\Users\\eemma\\OneDrive\\Escritorio\\Info Para Buscar  Proyecto.txt");
        Scanner s = null;
        String linea = null;
        String[] datos_linea;
        ArrayList<String> listafinal = new ArrayList<>();
        try {
            // Leemos el contenido del fichero

            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                linea = s.nextLine(); 	// Guardamos la linea en un String
                //System.out.println(linea);      // Imprimimos la linea



                datos_linea = linea.split(" ");
                for (int i=0; i<datos_linea.length;i++){

                    listafinal.add(datos_linea[i]);
                }

            }

           // System.out.println(listafinal.get(0));

        } catch (Exception ex) {
            System.out.println( ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null)
                    s.close();
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }


   // linea = Arrays.toString(line.split(" "));

    public static void main(String[] args) throws IOException {

        //------------------------------------------------//
        BinarySearchTree n = new BinarySearchTree();
        //------------------------------------------------//
        System.out.println();
        n.lector();
    }

}

/*
 public void lector() throws IOException {
        File fichero = new File("C:\\Users\\eemma\\OneDrive\\Escritorio\\Info Para Buscar  Proyecto.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                System.out.println(linea);      // Imprimimos la linea

            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null)
                    s.close();
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }

     String K = "emmanuel es" + "," + "link" + "," + "posprevia";
        String i = "jjjjjjj";
        String u = "uuuuuuuuuuuu";

        //------------------------------------------------//
        BinarySearchTree n = new BinarySearchTree();
        //------------------------------------------------//

        n.insertar(K);
        n.insertar(i);
        n.insertar(u);
        n.insertar("mejor");
        n.insertar("vamos a ver");
        System.out.println("..................................");
        String[] info = K.split(",");
        System.out.println(Arrays.toString(info));
        System.out.println("..................................");

        n.existe("jjjjjjj");
        n.postorden();


        // list that holds strings of a file







        String K= "emmanuel es" +","+ "link" +","+  "posprevia";
        String i= "jjjjjjj";
        String u= "uuuuuuuuuuuu";

        //------------------------------------------------//
        BinarySearchTree n= new BinarySearchTree();
        //------------------------------------------------//

        n.insertar(K);
        n.insertar(i);
        n.insertar(u);
        n.insertar("mejor");
        n.insertar("vamos a ver");
        n.preorden();

        System.out.println("..................................");
        String[] info = K.split(",");
        System.out.println(Arrays.toString(info));
        System.out.println("..................................");

        n.existe("jjjjjjj");

 */
