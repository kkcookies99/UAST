 class Solution {
    public String XXX(String a, String b) {
        //        if (a==null)return  b;
//        if (b==null) return  a;
        int i=a.length()-1,j=b.length()-1,jiwei=0,sum=0;
        StringBuilder sb=new StringBuilder();
        while (i>=0||j>=0){
            sum=jiwei;
            if (i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if (j>=0){
                sum+=b.charAt(j--)-'0';
            }
            jiwei=sum/2;
           sb.insert(0,sum%2);
         }
         if (jiwei==1)sb.insert(0,1);
         return sb.toString();
    }
}

