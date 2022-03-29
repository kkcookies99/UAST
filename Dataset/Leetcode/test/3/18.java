 class Solution {
    public int XXX(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.trim().length() == 0) {
            return 1;
        }
        int lenght = 1;
        int begin = 0;
        int end;
        int size = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (; begin < size - 1; begin++) {
            if (size - begin < lenght) break;
            map.clear();
            for (end = begin; end < size; end++) {
                char point = s.charAt(end);
                if (map.containsKey(point)) {
                    begin = map.get(point);
                    break;
                } else {
                    map.put(s.charAt(end), end);
                    if (lenght < end - begin  + 1) {
                        lenght = end - begin  + 1;
                    }
                }
            }
        }
        return lenght;
    }
}

