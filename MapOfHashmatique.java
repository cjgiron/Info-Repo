
import java.util.Set;
import java.util.HashMap;
public class MapOfHashmatique {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Ruin My Life", "I want you to ruin my life, yeah.");
        trackList.put("Don't Want You", "I'm ashamed of the way I fell.");
        trackList.put("Be Kind", "You can be kind to the one that you love.");
        trackList.put("Takeaway", "Before I love you nah nah nah gonna leave you nah nah nah");

        String lyrics = trackList.get("Be Kind");
        System.out.println(lyrics);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}