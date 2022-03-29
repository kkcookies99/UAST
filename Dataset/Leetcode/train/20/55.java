 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        if(chars.length == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c == '(' || c=='{' || c=='['){
                stack.push(c);
            }else {
                // 利用两个括号ASCII码之间的差值不大于2
                if(stack.empty() || Math.abs(c - stack.pop()) > 2){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    }```

