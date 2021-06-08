
import java.util.ArrayList;
public class ListOfExceptions {

    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                String str = String.format("%s was successfully casted as Integer.", castedValue);
                System.out.println(str);
            } catch (ClassCastException e) {
                Object errorObj = myList.get(i);
                String str = String.format("Object %s at index %s threw an error.", errorObj, i);
                System.out.println(str);
            }
        }
    }

}