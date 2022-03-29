 class Solution {
    public boolean XXX(String s) {
      if (s.isEmpty()){
            return true;
        }
        if (s.length() %2  != 0) {
            return false;
        }

        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        //{[()]}  {}[]()
        LinkedList<Character> list = new LinkedList<>();
        for (int i = s.length() - 1; i >=0 ; i--) {
            char charAt = s.charAt(i);
            if (map.containsKey(charAt)) {
                list.add(map.get(charAt));
            }else {
                Character character = list.peekLast();
                if (Character.valueOf(charAt).equals(character)){
                    list.removeLast();
                }else {
                    return false;
                }
            }
        }
        return true;  
    }
}

