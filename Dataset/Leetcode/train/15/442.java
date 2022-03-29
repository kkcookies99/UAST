 class Solution {
    public String decodeString(String s) {
     int len = s.length();
        if (s.length() < 3) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            stack1.push(chars[i]);
        }
        while (!stack1.isEmpty()) {
            Character character = stack1.pop();
            if (character == ']' || (character >= 97 && character <= 122)) {
                stack2.push(character+"");
            } else if (character == '[') {
                StringBuilder newS = new StringBuilder();
                while (!stack2.isEmpty()) {
                    String c = stack2.pop();
                    if (c .equals("]")) {
                        break;
                    } else {
                        newS.append(c);
                    }
                }
                Character c='0';
                StringBuilder scount=new StringBuilder();
                while (!stack1.isEmpty()){
                    c=stack1.pop();
                    if (Character.valueOf(c)-48<0||c-48>9){
                        stack1.push(c);
                        break;
                    }else {
                        scount.append(c);
                    }
                }
                scount.reverse();
                int count = Integer.valueOf(scount.toString());
                String temp = newS.toString();
                for (int i = 0; i < count - 1; i++) {
                    newS.append(temp);
                }
                stack2.push(newS.toString());
            }
        }
        while (!stack2.isEmpty()) {
           result.append(stack2.pop());
        }
        return result.toString();
    }
  
}

