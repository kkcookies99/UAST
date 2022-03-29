 class Solution {
    public String XXX(String[] strs) {
        StringBuilder sb = new StringBuilder();
        try {
            int i = 0;
            while (true){
                char c = strs[0].charAt(i);
                for (String str : strs) {
                    if (c != str.charAt(i)){
                        return sb.toString();
                    }
                }
                sb.append(c);
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            return sb.toString();
        }
    }
}

