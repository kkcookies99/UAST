 class Solution {
    public boolean XXX(String s) {
        //存放一半入栈
        Stack<Character> stack = new Stack<>();

        //先用hashMap存放 对对关系
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');


         for (int i = 0; i < s.length(); i++) {
            //遇到左括号入栈
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                //遇到右边弹出比较
                if(stack.pop() != map.get(s.charAt(i))) {
                    return false;
                }
            }
        }

        if(!stack.isEmpty())
            return false;

        return true;

    }
}

