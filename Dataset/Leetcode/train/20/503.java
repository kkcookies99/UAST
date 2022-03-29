 class Solution {
    public boolean XXX(String s) {
        // 字符长度为奇数则无效
        if (s.length() % 2 == 1) return false;
        LinkedList<Character> stack = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c == '(')
                stack.addLast(')');
            else if (c == '[')
                stack.addLast(']');
            else if (c == '{')
                stack.addLast('}');
            else if (stack.isEmpty() || stack.removeLast() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

