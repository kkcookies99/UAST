 class Solution {
    public boolean XXX(String s) {
 Stack<Character> strings=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
                strings.push(s.charAt(i));

            }
            if (s.charAt(i)==']'||s.charAt(i)=='}'||s.charAt(i)==')'){
                if (strings.empty()){
                    return false;
                }
                char pop = strings.pop();
                if (s.charAt(i)==']'){
                    if (pop!='['){
                        return false;
                    }
                }else
                if (s.charAt(i)==')'){
                    if (pop!='('){
                        return false;
                    }
                }else
                if (s.charAt(i)=='}'){
                    if (pop!='{'){
                        return false;
                    }
                }
            }
        }
        return strings.empty();
    }
}

