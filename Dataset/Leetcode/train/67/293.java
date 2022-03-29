 class Solution {
    public String XXX(String a, String b) {
        if(a.equals("")){
            return b;
        } else if (b.equals("")){
            return a;
        }

       int len = a.length()>b.length() ? a.length():b.length();

        StringBuilder ret = new StringBuilder("");

        int x = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {

            if (i < a.length() && i < b.length()){
                sum = Integer.valueOf(a.substring(a.length() - 1 - i,a.length() - i)).intValue() + Integer.valueOf(b.substring(b.length() - 1 - i,b.length() - i)).intValue() + x;
            } else if (i < a.length()){
                sum = Integer.valueOf(a.substring(a.length() - 1 - i,a.length() - i)).intValue() + x;
            } else{
                sum = Integer.valueOf(b.substring(b.length() - 1 - i,b.length() - i)).intValue() + x;
            }
            x = sum / 2;
            sum = sum % 2;
            ret.append(sum);
        }
        if (x > 0){
            ret.append(x);
        }
        return ret.reverse().toString();
    }
}

