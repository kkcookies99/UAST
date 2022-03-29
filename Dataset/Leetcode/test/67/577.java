class Solution {
    public String XXX(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int la = a.length(),lb = b.length();
        int len = la>lb?la:lb;
        boolean flag = false;
        while (len-- >0){
            la --;
            lb --;
            int i = 0;
            if (la >=0 && a.charAt(la) == '1')i++;
            if (lb>=0 && b.charAt(lb) == '1')i++;
            i+=flag?1:0;
            flag = i>1;
            builder.insert(0,i%2);
        }
        if (flag) builder.insert(0,1);
        return builder.toString();
    }
}

