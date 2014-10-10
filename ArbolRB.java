/**
 * Universidad del Valle de Guatemala	
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * Fecha: 10/10/2014
 * ArbolRB.java: Clase que implementa WordSet para usar Un Arbol red Black
 */

public class ArbolRB implements WordSet{
    /*Atributos de la clase*/
	private RedBlackTree<Word> base;							//Nodo Base
	
	
	public ArbolRB(){
            base = new RedBlackTree<Word>(new Word());			//Se crea el arbol binario con su primer nodo
	}
	
	/*
	* Metodo que regresa una objeto de la clase Word
	*/
	public Word get(Word word){									
            boolean index = base.contains(word);				//Bandera que me dice si esta la palabra o no
            if(!index) 
                return null;									//FALSE: no encontro un objeto
            else
                return base.find(word);							//Encuentra la palabra
	}
	
	/*
	* Añade una palabra al arbol
	*/
	public void add(Word wordObject){							
            base.insert(wordObject);
	}
}
