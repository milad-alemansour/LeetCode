import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isValid(String s) {
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        parentheses.put('{', '}');


        ArrayList<Character> OpensP = new ArrayList<>();
        if (s.length() == 1) return false;
        if ((s.length() % 2) == 1) return false;
        for (int i = 0; i < s.length(); i++) {

            if (parentheses.get(s.charAt(i)) != null) {
                OpensP.add(s.charAt(i));
            }
            if (OpensP.size() == 0) {
                return false;
            } else if (parentheses.get(s.charAt(i)) == null) {
                if (parentheses.get(OpensP.get(OpensP.size() - 1)) == s.charAt(i))
                    OpensP.remove(OpensP.size() - 1);

                else {
                    return false;
                }
            }


        }
        return OpensP.size() == 0;

    }


}
