
import java.util.ArrayList;
public class PuzzleJavaTesting{

    public static void main(String[] args) {

        PuzzleJava javaPuzzles = new PuzzleJava();

        // int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        // ArrayList<Integer> sumAndGreaterThan10 = javaPuzzles.printSumAndGreaterThan10(arr1);
        // System.out.println(sumAndGreaterThan10);

        // **************************************

        // ArrayList<String> names = new ArrayList<String>();
        // names.add("Nancy"); 
        // names.add("Jinichi"); 
        // names.add("Fujibayashi"); 
        // names.add("Momochi"); 
        // names.add("Ishikawa"); 
        // ArrayList<String> longerThan5 = javaPuzzles.printNamesAndLongerThan5(names);
        // System.out.println(longerThan5);
        
        // **************************************

        // ArrayList<String> letters = new ArrayList<String>();
        // letters.add("a");
        // letters.add("b");
        // letters.add("c");
        // letters.add("d");
        // letters.add("e");
        // letters.add("f");
        // letters.add("g");
        // letters.add("h");
        // letters.add("i");
        // letters.add("j");
        // letters.add("k");
        // letters.add("l");
        // letters.add("m");
        // letters.add("n");
        // letters.add("o");
        // letters.add("p");
        // letters.add("q");
        // letters.add("r");
        // letters.add("s");
        // letters.add("t");
        // letters.add("u");
        // letters.add("v");
        // letters.add("w");
        // letters.add("x");
        // letters.add("y");
        // letters.add("z");
        // System.out.println(javaPuzzles.printLastAndFirst(letters));

        // **************************************

        // System.out.println(javaPuzzles.print10Random());

        // **************************************

        // System.out.println(javaPuzzles.print10Sorted());

        // **************************************

        // ArrayList<String> letters = new ArrayList<String>();
        // letters.add("a");
        // letters.add("b");
        // letters.add("c");
        // letters.add("d");
        // letters.add("e");
        // letters.add("f");
        // letters.add("g");
        // letters.add("h");
        // letters.add("i");
        // letters.add("j");
        // letters.add("k");
        // letters.add("l");
        // letters.add("m");
        // letters.add("n");
        // letters.add("o");
        // letters.add("p");
        // letters.add("q");
        // letters.add("r");
        // letters.add("s");
        // letters.add("t");
        // letters.add("u");
        // letters.add("v");
        // letters.add("w");
        // letters.add("x");
        // letters.add("y");
        // letters.add("z");
        // String random5 = javaPuzzles.printRandom5(letters);
        // System.out.println(random5);

        // **************************************

        ArrayList<String> letters = new ArrayList<String>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("i");
        letters.add("j");
        letters.add("k");
        letters.add("l");
        letters.add("m");
        letters.add("n");
        letters.add("o");
        letters.add("p");
        letters.add("q");
        letters.add("r");
        letters.add("s");
        letters.add("t");
        letters.add("u");
        letters.add("v");
        letters.add("w");
        letters.add("x");
        letters.add("y");
        letters.add("z");
        ArrayList<String> random10Strings = javaPuzzles.print10Random5(letters);
        System.out.println(random10Strings);

    }
}