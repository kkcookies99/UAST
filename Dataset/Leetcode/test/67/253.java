 class Solution {
    public String XXX(String a, String b) {
        StringBuilder aa = new StringBuilder(a);
        StringBuilder bb = new StringBuilder(b);
        aa.reverse();
        bb.reverse();
        int len = Math.abs((aa.length()-bb.length()));
        if(a.length()>b.length()){
            for (int i = 0; i < len; i++) {
                bb.append("0");
            }
        }
        if(a.length()<b.length())
            for (int i = 0; i < len; i++) {
                aa.append("0");
            }
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < aa.length(); i++) {
            int sum = (Integer.parseInt(aa.charAt(i)+"") + Integer.parseInt(bb.charAt(i)+"") + carry)%2;
            result.append(sum);
            if(Integer.parseInt(aa.charAt(i)+"") + Integer.parseInt(bb.charAt(i)+"") + carry>=2)
                carry = 1;
            else carry=0;
        }
        if(carry==1)
            result.append(1);
        return result.reverse().toString();
    }
}

