 
public class Solution {

    //804. Unique Morse Code Words
    //38ms 5.52%
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Map<Character, String> map = new HashMap<>();
        for(int i = 0 ; i < morse.length ; i++){
            map.put((char)(i+97), morse[i]);
        }

        String[] form = new String[words.length];
        for(int i = 0 ; i < words.length ; i++){
            form[i] = "";
            for(int j = 0; j < words[i].length() ; j++){
                form[i] += map.get(words[i].charAt(j));
            }
        }

        long count = Stream.of(form).distinct().count();

        return (int)count;

    }
}
