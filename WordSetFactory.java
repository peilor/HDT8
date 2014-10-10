/**
 * @author Pablo Argueta, Carnet: 13028
 * @author H�ctor M�ller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 * Descripcion: Clase que implementa el patr�n de dise�o Factory para devolver una implementaci�n para utilizar
 * C�digo proporcionado en clase
 */
public class WordSetFactory {
    // Metodo que genera un objeto que implementa WordSet
    // parametro tipo: 1 = SimpleSet
    //                         2 = implementado con Red black tree
    //                         3 = implementado con Splay Tree
    //                         4 = implementado con Hash Table
    //                         5 = implementado con TreeMap (de Java Collection Framework)

    public static WordSet generateSet(int tipo)
    {
        if (tipo == 1)
            return new SimpleSet();
        else if (tipo == 2)
            return new ArbolRB();
        else if (tipo == 3)
            return new ArbolSplay();
        else if (tipo == 4)
            return new HashTable();
        else if (tipo == 5)
            return new ImplementacionTreeMap();
        else
            // aqui se regresara el set empleando sus implementaciones:
            // if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
            // if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
            // if tipo == 4 cree una instancia para un Wordset implementado con Hash table
            // if tipo == 5 cree una instancia para un Wordset implementado con TreeMap

            return null; // modificarlo para que regrese la implementacion seleccionada
    }
}