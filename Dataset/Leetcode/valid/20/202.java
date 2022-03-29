 class Solution {
    public boolean XXX(String s) {
        Stack<Character> characters = new Stack<>();
        char ch;
        for(int i = 0; i< s.length();  i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') characters.push(ch);
            else{
                if(characters.size() == 0) return false;
                else if(!(equealChar(characters.pop(), ch)))
                      return false;
            }
        }
        return characters.size() == 0;
    }

    public static boolean equealChar(char c1, char c2){
    
            if(c1 == '(') return (c2 == ')') ? true : false;
            else if(c1 == '[') return (c2 == ']') ? true : false;
            else return (c2 == '}') ? true : false;
        }
}

