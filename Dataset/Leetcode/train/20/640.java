 class Solution {
    public boolean XXX(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                stack.addFirst(c);
            } else {
                //注意起始后缀。
                if (stack.isEmpty() || map.get(c) != stack.removeFirst()) {
                    return false;
                }
            }
        }

        //多余的前缀
        return stack.isEmpty();
    }
}

