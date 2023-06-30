import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;

//Разработать программу, имитирующую поведение коллекции HashSet.
//В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества и
//метод позволяющий читать элементы по индексу.
//*Реализовать все методы из семинара.
//Формат данных Integer.
public class seminar_6 {
    public static void main(String[] args) {
        Myset<Integer> myma = new Myset<>();
        System.out.println(myma.badidylia(9));
        System.out.println(myma.toString());
        Iterator<Integer> iter = myma.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}

class Myset<E> {
   private HashMap <E, Object> mapa = new HashMap<>();
   private static final Object OBJ = new Object();
   public boolean badidylia (E num){
       return mapa.put(num, OBJ) == null;
//    public boolean add (E numbering){
//        if(!mapa.containsKey(numbering)){
//            mapa.putIfAbsent(numbering, numbering);
//            return true;
//        }
//        return false;
    }
    public String toString(){
       String o = null;
       return o;
    }
    public Iterator<E> iterator(){
       return mapa.keySet().iterator();
    }

}
