/**
 * Universidad del Valle de Guatemala	
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * Fecha: 10/10/2014
 * ArbolSplay.java: Clase que implementa WordSet para usar Un Arbol Splay
 */

public class ArbolSplay implements WordSet{
    private SplayTree<Word> base;
	
	/*
	* Constructor que crea el arbol
	*/
    public ArbolSplay(){
        base = new SplayTree<Word>();
    }

	/*
	* Obtiene una palabra
	*/
    public Word get(Word word){
        boolean index = base.contains(word);
        if(!index) 
            return null;
        else
            return base.find(word);
    }

	/*
	* Metodo que agrega una palabra.
	*/
    public void add(Word wordObject){
        base.insert(wordObject);
    }
}
