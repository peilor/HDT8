/**
 * Universidad del Valle de Guatemala	
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * Fecha: 10/10/2014
 * RedBlackNode.java: estructura de un nodo de un arbol RB
 *
 * Este codigo fue sacado del libro de texto. Java Structures 7a. edicion Duane A. Bailey
 */


 class RedBlackNode<T extends Comparable<T>>{
	// Constructors
	RedBlackNode( T theElement ){
		this( theElement, null, null );
	}

	RedBlackNode( T theElement, RedBlackNode lt, RedBlackNode rt ){
		element  = theElement;
		left     = lt;
		right    = rt;
		color    = RedBlackTree.BLACK;
	}

		// Friendly data; accessible by other package routines
	T element;    // The data in the node
	RedBlackNode left;       // Left child
	RedBlackNode right;      // Right child
	int          color;      // Color
}
