 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        String str = XXX(n - 1);
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 1;
        for (; j < str.length(); j++) {
            if(str.charAt(i)!=str.charAt(j)) {
                sb.append(j - i).append(str.charAt(i));
                i = j;
            }
        }
        sb.append(j-i).append(str.charAt(i));
        return sb.toString();
    }
}

