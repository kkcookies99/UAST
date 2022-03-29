 class Solution {
    public boolean XXX(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c.equals('(') || c.equals('{') || c.equals('[') )
            stack.push(c);
            else if(!stack.isEmpty() && stack.peek()=='(' && c ==')')
            stack.pop();
            else if(!stack.isEmpty() && stack.peek()=='{' && c =='}')
            stack.pop();
            else if(!stack.isEmpty() && stack.peek()=='[' && c ==']')
            stack.pop();
            else
            return false;
            }
            return stack.isEmpty();
        }
    }

