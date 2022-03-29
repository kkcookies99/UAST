 class Solution {
    public String XXX(String a, String b) {
        int c = 0, i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        while (c > 0 || i >= 0 || j >= 0){
            int valA = i >= 0 ? charA[i--] - '0' : 0;
            int valB = j >= 0 ? charB[j--] - '0' : 0;
            int sum = valA + valB + c;
            c = sum >> 1;
            sb.append(sum % 2);
        }   
        return sb.reverse().toString();
    }       
}


