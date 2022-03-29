 class Solution {
    public String XXX(String a, String b) {
        int val = 0;
        StringBuilder sum = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;
        while(i>=0 || j>=0 || val!=0){
            val += i >= 0 ? a.charAt(i--) - '0' : 0;
            val += j >= 0 ? b.charAt(j--) - '0' : 0;
            sum.append(val % 2);
            val = val/2;
        }
        return sum.reverse().toString();
    }
}

