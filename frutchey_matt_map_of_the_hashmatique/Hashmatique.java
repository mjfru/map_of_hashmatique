import java.util.Set;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Map of the Problematique", "Fear and panic in the air...");
        trackList.put("Time is Running Out", "I think I'm drowning...");
        trackList.put("Apocalypse Please", "Declare this an emergency...");
        trackList.put("Plug In Baby", "I've exposed your lies...");

        String trackSample = trackList.get("Time is Running Out");
        System.out.println(trackSample);
        
        Set<String> keys = trackList.keySet();
        for(String key: keys) {
            System.out.println("Track: " + key + "|| Lyric Sample: " + trackList.get(key));
            // System.out.println(trackList.get(key));
        }
    }
}