
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {

    public ArrayList<Integer> printSumAndGreaterThan10(int[] arr) {
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if(arr[i] > 10) {
                greaterThan10.add(arr[i]);
            }
        }
        System.out.println(sum);
        return greaterThan10;
    }

    public ArrayList<String> printNamesAndLongerThan5(ArrayList<String> arr) {
        ArrayList<String> newList = new ArrayList<String>();
        
        Collections.shuffle(arr);

        for(int i = 0; i < arr.size(); i++) {
            String name = arr.get(i);
            System.out.println(name);

            if(name.length() > 5) {
                newList.add(name);
            }
        }
        return newList;
    }


    public String printLastAndFirst(ArrayList<String> arr) {

        Collections.shuffle(arr);

        String first = arr.get(0);
        String last = arr.get(25);

        System.out.println(last);
        System.out.println(first);

        ArrayList<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        if(vowels.indexOf(first) > -1) {
            return "First letter is a vowel!";
        } else {
            return "";
        }
    }

    public ArrayList<Integer> print10Random(){

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int min = 55;
        int max = 100;
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            numbers.add(r.nextInt(max+1-min)+min);
        }

        return numbers;
    }

    public ArrayList<Integer> print10Sorted() {

        ArrayList<Integer> sortedNums = new ArrayList<Integer>();
        
        int min = 55;
        int max = 100;
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            sortedNums.add(r.nextInt(max+1-min)+min);
        }

        Collections.sort(sortedNums);
        System.out.println(sortedNums.get(0));
        System.out.println(sortedNums.get(9));
        return sortedNums;

    }

    public String printRandom5 (ArrayList<String> arr) {

        String s1 = "";

        Random r = new Random();

        for(int i = 0; i < 5; i++) {
            int random_int = r.nextInt(26);

            s1 = s1.concat(arr.get(random_int));
        }
        return s1;
    }

    public ArrayList<String> print10Random5(ArrayList<String> arr) {

        ArrayList<String> random10 = new ArrayList<String>();

        Random r = new Random();

        for(int i = 0; i < 10; i++) {

            String str = "";

            for(int j = 0; j < 5; j++) {
                int random_int = r.nextInt(26);

                str = str.concat(arr.get(random_int));
            }
            random10.add(str);
        }
        return random10;
    }

}