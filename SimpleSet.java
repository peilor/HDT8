/**
 * @author Pablo Argueta, Carnet: 13028
 * @author H�ctor M�ller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 * Descripcion: Implementacion por medio de Simple Set
 * C�digo proporcionado en clase
 */
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}