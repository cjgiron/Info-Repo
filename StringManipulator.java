public class StringManipulator {

    public String trimAndConcat (String str1, String str2) {
        //make a variable for a new string
        // add them together
        String newStr = str1.trim() + str2.trim();
        return newStr;
    }

    public Integer getIndexOrNull (String str1, char letter) {
        int idx = str1.indexOf(letter);
        
        if(idx > -1) {
            return idx;
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull (String str1, String str2) {
        int idx = str1.indexOf(str2);
        
        if(idx > -1) {
            return idx;
        } else {
            return null;
        }
    }

    public String concatSubstring(String str1, int start, int end, String str2) {
        String substr = str1.substring(start, end);
        return substr + str2;

    }

}