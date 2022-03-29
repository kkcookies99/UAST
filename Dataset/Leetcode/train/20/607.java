 class Solution {
    public boolean XXX(String s) {
        Map<Character, Character> map = new HashMap<>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };
        Deque<Character> stack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //ch为左括号，直接入栈
            if (!map.containsKey(ch)) {
                stack.push(ch);
            } else {
                //ch为右括号，检查ch与栈顶元素是否配对
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }

        //遍历完所有括号后，stack为空则说明有效
        return stack.isEmpty();
    }
}

