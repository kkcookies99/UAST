 class Solution {
    public int XXX(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // 用来记录最大的长度
        int result = 0;
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (list.contains(c)) {
                result = Math.max(list.size(), result);
                list.subList(0, list.indexOf(c) + 1).clear();
            }

            list.add(c);
        }

        return Math.max(list.size(), result);
    }
}

