import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class OpenCloseParentheses {

    public static void main(String[] args) {
        String t = "))";
        System.out.println(isValid(t));
    }

    public static boolean isValid1(String s) {
        char[] arr = s.toCharArray();
        char lastOpened = 0;
        Map<Integer, Character> openedMap = new LinkedHashMap<>();
        Map<Integer, Character> closedMap = new LinkedHashMap<>();
        Map.Entry<Integer, Character> lastOpenedEntry = null;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
                openedMap.put(i, arr[i]);
                lastOpenedEntry = openedMap.entrySet().stream().skip(openedMap.size() - 1).findFirst().get();
                lastOpened = lastOpenedEntry.getValue();
            } else {
                closedMap.put(i, arr[i]);
            }
            if ((arr[i] == ')' && lastOpened == '(') || (arr[i] == '}' && lastOpened == '{') || (arr[i] == ']' && lastOpened == '[')) {
                openedMap.remove(lastOpenedEntry.getKey());
                closedMap.remove(i);
            }
            if (!openedMap.isEmpty()) {
                lastOpenedEntry = openedMap.entrySet().stream().skip(openedMap.size() - 1).findFirst().get();
                lastOpened = lastOpenedEntry.getValue();
            }
        }
        return openedMap.isEmpty() && closedMap.isEmpty();
    }

    public static boolean isValid(String s) {
        if(s.length()==0)
            return true;
        Stack<Character> st= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else if(!st.empty() && ((s.charAt(i)==')' && st.peek()=='(')
                    || (s.charAt(i)=='}' && st.peek()=='{')
                    || (s.charAt(i)==']' && st.peek()=='[')))
            {
                st.pop();
            }
            else
                return false;
        }
        if(st.size()!=0)
            return false;
        return true;
    }
}
