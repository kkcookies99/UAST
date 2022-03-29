 class Solution {
    public String XXX(String a, String b) {
        if(a==null||a.length()==0) return b;
        if(b==null||b.length()==0) return a;
        int i=a.length()-1,j=b.length()-1,carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0||carry==1){
            if(i>=0 && a.charAt(i--)=='1') carry++;
            if(j>=0 && b.charAt(j--)=='1') carry++;
            sb.append(carry%2);
            carry /= 2 ;
        }
        return sb.reverse().toString();

    }
}

