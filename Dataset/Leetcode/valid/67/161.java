 class Solution {
    public String XXX(String a, String b) {
        int add = 0,sum = 0,aa = 0,bb = 0;
        int i = a.length() - 1,j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            aa = a.charAt(i--) - '0';
            bb = b.charAt(j--) - '0';
            sum = aa + bb + add;
            sb.append(sum % 2);
            add = sum / 2;
        }
        
        while (i >= 0) {
            aa = a.charAt(i--) - '0';
            sum = aa + add;
            sb.append(sum % 2);
            add = sum / 2;
        }
        
        while (j >= 0) {
            bb = b.charAt(j--) - '0';
            sum = bb + add;
            sb.append(sum % 2);
            add = sum / 2;
        }
        if (add > 0) {
            sb.append(add);
        }
        return sb.reverse().toString();
    }
}

