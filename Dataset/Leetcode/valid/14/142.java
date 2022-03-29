 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) return "";
        // 最大长度
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            minLen = Math.min(s.length(), minLen);
        }
        // index -> Set {different chars}
        Map<Integer, Set<String>> map = new HashMap<>();
        String res = "";
        // 依次存储
        for (int i = 0; i < minLen; i++) {
            String curChar = "";
            for (String s : strs) {
                curChar = String.valueOf(new char[]{s.charAt(i)});
                if (map.containsKey(i)) {
                    map.get(i).add(curChar);
                } else {
                    Set<String> set = new HashSet<>();
                    set.add(curChar);
                    map.put(i, set);
                }
            }
            if (map.get(i).size() == 1) {
                res = res + curChar;
            } else {
                break;
            }
        }
        return res;
    }
}

