 class Solution {
    public String XXX(String[] strs) {
        char[] chars = strs[0].toCharArray();
        int index = chars.length;
        for (int i = 1; i < strs.length; i++) {
            index = Math.min(index, strs[i].length());
            if (index == 0) {
                break;
            }
            char[] strArr = strs[i].toCharArray();
            for (int j = 0; j < index; j++) {
                if (chars[j] != strArr[j]) {
                    index = j;
                    break;
                }
            }
        }
        return new String(chars, 0, index);
    }
}

