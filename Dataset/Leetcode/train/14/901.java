 class Solution {
    public String XXX(String[] strs) {
        int minLen = 200;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen,strs[i].length());
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            boolean isEqual = true;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)){
                    isEqual = false;
                    break;
                }
            }
            if(!isEqual) break;
            if (isEqual){
                builder.append(strs[0], i, i + 1);
            }
        }
        return builder.toString();
    }
}

