class Solution {
    public String XXX(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;
        int carry = 0;
        StringBuilder m = new StringBuilder();
        while(i>=0&&j>=0){
            sum = carry+sum;
            sum = sum + a.charAt(i--)-'0';
            sum = sum + b.charAt(j--)-'0';
            carry = sum/2;
            m.append(sum%2);
            sum = 0;
        }
        while(i>=0){
            sum = carry + a.charAt(i--)-'0';
            carry = sum/2;
            m.append(sum%2);
            sum = 0;
        }
        while(j>=0){
            sum = carry +b.charAt(j--)-'0';
            carry = sum/2;
            m.append(sum%2);
            sum = 0;
        }
        if(carry == 1){
            m.append('1');
        }
        return m.reverse().toString();
    }
}

