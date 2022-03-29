 class Solution {
    public String XXX(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int s1 = a.length() - 1, s2 = b.length() - 1;
        int last = 0;
        while (s1 >= 0 && s2 >= 0) {
            sb.append((a.charAt(s1) - '0' + b.charAt(s2) - '0' + last) % 2);
            last = (a.charAt(s1) - '0' + b.charAt(s2) - '0' + last) / 2;
            s1--;
            s2--;
        }
        while(s1 >= 0){
            sb.append((a.charAt(s1) - '0'  + last) % 2);
            last = (a.charAt(s1) - '0' + last) / 2;
            s1--;
        }
        while(s2 >= 0){
            sb.append((b.charAt(s2) - '0'  + last) % 2);
            last = (b.charAt(s2) - '0' + last) / 2;
            s2--;
        }
        return last != 0 ? sb.append(last).reverse().toString() : sb.reverse().toString();
    }
}

