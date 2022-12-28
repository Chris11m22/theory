import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tack {
    public static void main(String[] args) {
      //  Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.

    HashMap<Integer,String> keyValue = new HashMap<Integer,String>();

               keyValue.put(1, "Hello");

               keyValue.put(2, "My");

               keyValue.put(3, "Name is");

        System.out.println(keyValue.size());

               System.out.println("Цикл While:");

    Iterator iter = keyValue.entrySet().iterator();

               while(iter.hasNext()) {

        Map.Entry qurentMe = (Map.Entry) iter.next();

        System.out.println("Ключ это " + qurentMe.getKey() + " Значение это " + qurentMe.getValue());

    }

               System.out.println("Цикл For:");

               for(Map.Entry qurentMe2: keyValue.entrySet()) {

        System.out.println("Ключ это: " + qurentMe2.getKey() + " Значение это: " + qurentMe2.getValue());

    }

}


}
