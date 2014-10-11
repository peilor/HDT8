/**
 * Universidad del Valle de Guatemala	
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * Fecha: 10/10/2014
 * ImplementacionTreeMap.java: Clase que implementa WordSet para usar TreeMap
 */

import java.util.TreeMap;

public class ImplementacionTreeMap implements WordSet{
    private TreeMap<Integer, Word> base;
    private int cant = 0;
	
	/* Constructor que crea un arbol TreeMap */
	public ImplementacionTreeMap(){
            base = new TreeMap<Integer, Word>();
	}
	
	/*
	* Metodo que obtiene una palabra del arbol
	*/
	public Word get(Word word){
		for(int i = 0; i<cant; i++){
			Word original = base.get(i);
			if(original.getWord().equals(word.getWord())){
			   word.setType(original.getType());
			}
		}
		boolean index = base.containsValue(word);
		if(!index) return null;
			return word;
	}
	
	/*
	* Metodo que agrega una palabra
	*/
	public void add(Word wordObject){
            base.put(cant, wordObject);
            cant = cant + 1;
	}
}
