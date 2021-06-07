public class StringManipulatorTesting {

    public static void main(String[] args) {

        // Instantiates an instance of the StringManipulator class
        // SO that we can call it's methods
        StringManipulator manipulator = new StringManipulator();

        String str = manipulator.trimAndConcat("        Hello       ", "       world       ");
        System.out.println(str);

        // String str1 = manipulator.trimAndConcat(" Hey Hana!", " what's happening? ");
        // System.out.println(str1);

        // String str2 = manipulator.trimAndConcat("  123   ", " 45678      ");
        // System.out.println(str2);

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null


        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld

    }
}