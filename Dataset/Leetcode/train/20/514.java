 class Solution {
    public boolean XXX(String s) {
        HashMap<String, String> parentheses = new HashMap<>();
        parentheses.put("(", ")");
        parentheses.put("[", "]");
        parentheses.put("{", "}");
        HashSet<String> left = new HashSet<>();
        HashSet<String> right = new HashSet<>();
        left.add("(");
        left.add("[");
        left.add("{");
        right.add(")");
        right.add("]");
        right.add("}");

        String[] strs = s.split("");
        Deque<String> stack = new ArrayDeque<>();
        for(String str: strs){
            System.out.println(str);
            if(!stack.isEmpty() && left.contains(stack.peekLast())&& 
                    parentheses.get(stack.peekLast()).equals(str))
                {
                    stack.pollLast();
                    continue;
                }
            
            stack.add(str);
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;

    }
}

