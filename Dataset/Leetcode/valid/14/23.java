 class Solution {
    public String XXX(String[] strs) {
 LinkedList<String> stringsList = new LinkedList<>();
        int index = 0;
        boolean isSame = true;
        // 获取最短长度的字符串
        String shortest = getShortestString(strs);
        for (int i = 0; i < shortest.length(); i++) {
            char prev = shortest.charAt(index);
            for (String str : strs) {
                if (str.charAt(index) != prev) {
                    isSame = false;
                }
                prev = str.charAt(index);
            }
            if (isSame == false) {
                break;
            }
            index++;
        }
        return shortest.substring(0, index);
    }
     public static String getShortestString(String[] strs) {
        Arrays.sort(strs, (a, b) -> a.length() - b.length());
        return strs[0];
    }
}

