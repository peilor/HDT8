/**
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 * Descripcion: Clase que genera un nodo para el arbol binario
 * Código tomado del libro de texto Java Structures
 */
 
public class BinaryNode<T> {

    public final T key;          // The data in the node
    public BinaryNode left;         // Left child
    public BinaryNode right;        // Right child

    public BinaryNode(T theKey) {
        key = theKey;
        left = right = null;
    }
}