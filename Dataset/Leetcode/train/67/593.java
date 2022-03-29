class Solution {
    public String XXX(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, c = 0;
        while (i >= 0 || j >= 0 || c != 0){
            int a1 = 0, b1 = 0;
            if (i >= 0) a1 = a.charAt(i--) - '0';
            if (j >= 0) b1 = b.charAt(j--) - '0';
            sb.append(a1^b1^c);
            c = a1 + b1 + c >= 2 ? 1 : 0;
        }
        return sb.reverse().toString();
    }
}

