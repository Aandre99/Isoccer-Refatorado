
package isoccer;

import java.util.ArrayList;

public class Lista_Iterator implements Iterator{
    
    private ArrayList<Object> lista;
    private int pos;
    
    public Lista_Iterator(ArrayList< ? extends Object> lista){
        this.lista = (ArrayList<Object>) lista;
        this.pos = 0;
    }
    @Override
    public Object next() {
        
        Object atual = lista.get(pos);
        pos++;
        return atual;
    }

    @Override
    public boolean hasNext() {
        
        if(pos == lista.size() || lista.get(pos).equals(null)){
            this.pos = 0;
            return false;
        }else{
            return true;
        }
    }
}
