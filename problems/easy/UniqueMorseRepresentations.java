package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * 804. Unique Morse Representations
 */
public class UniqueMorseRepresentations {
    static class Solution {
        static final String[] ENCODES = {
                ".-", "-...", "-.-.", "-..", ".",               //a,b,c,d,e
                "..-.", "--.", "....", "..", ".---",            //f,g,h,i,g
                "-.-", ".-..", "--", "-.", "---",               //k,l,m,n,o
                ".--.", "--.-", ".-.", "...", "-",              //p,q,r,s,t
                "..-", "...-", ".--", "-..-", "-.--", "--.."     //u,v,w,x,y,z
        };

        public int uniqueMorseRepresentations(String[] words) {
            Set<String> allCodes = new HashSet<>();
            // very slow, not using lambda
//            Consumer<String> mapToMorseCodes = word -> {
//                StringBuilder sbd = new StringBuilder();
//                for (char c : word.toCharArray()) {
//                    sbd.append(ENCODES[c - 'a']);
//                }
//                allCodes.add(sbd.toString());
//            };
            for (String word: words) {
                StringBuilder sbd = new StringBuilder();
                for (char c : word.toCharArray()) {
                    sbd.append(ENCODES[c - 'a']);
                }
                allCodes.add(sbd.toString());
            }
            return allCodes.size();
        }
    }
}
