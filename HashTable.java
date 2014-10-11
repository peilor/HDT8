/**
 * Universidad del Valle de Guatemala	
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * Fecha: 10/10/2014
 * HashTable.java: Clase que implementa WordSet para usar HashTable
 */

 /*Importando librerias utiles*/
import java.util.Hashtable;

public class HashTable implements WordSet{
	/*Atributos de la clase*/
    private Hashtable<Integer, Word> base;
    private int cant = 0;
	
	/*
	* Constructor que crea el nuevo hash table.
	*/
	public HashTable(){
		base = new Hashtable<Integer, Word>();
	}
	
	/*
	* Metodo que regresa una palabra determinada
	*/
	public Word get(Word word){
		for(int i = 0; i<cant; i++){								// Se recorre la tabla
			Word original = base.get(i);							// Se recorre en la posicion i
			if(original.getWord().equals(word.getWord())){			// Se comparan las palabras
			   word.setType(original.getType());					// Si son iguales se devuelve
			   i = cant;
			}
		}
		boolean index = base.containsValue(word);					//Se valida que este adentro.
		if(!index) return null;
		return word;
	}
	
	/*
	* Metodo que agrega una palabra a la tabla de hash
	*/
	public void add(Word wordObject){
        base.put(cant, wordObject);
        cant = cant + 1;											//Se le suma uno a la cantidad de elementos
	}
}
