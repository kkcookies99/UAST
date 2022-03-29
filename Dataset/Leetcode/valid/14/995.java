 class Solution {
    public String XXX(String[] strs) {
        int length = strs[0].length();
        int index = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < length) {
                length = strs[i].length();
                index = i;
            }
        }
        String shortest = strs[index];
        while (shortest.length() > 0) {
            boolean correct = true;
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].substring(0, length).equals(shortest.substring(0, length))) {
                    length--;
                    correct = false;
                    break;
                }
            }
            if (correct) {
                return shortest.substring(0, length);
            }
        }
        return "";
    }
}

