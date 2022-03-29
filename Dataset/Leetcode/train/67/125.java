 class Solution {
    public String XXX(String a, String b) {
       int al=a.length()-1;
       int bl=b.length()-1;
        StringBuffer sb = new StringBuffer();
        int index=0;//进位
        int sum=0;
        while(al>=0||bl>=0){
            sum=index;
            if(al>=0){
                sum=(a.charAt(al)-'0')+sum;
                al--;
            }
            if(bl>=0){
                sum=(b.charAt(bl)-'0')+sum;
                bl--;
                
            }
            sb.append(sum%2);
            index=sum/2;
        }
        
        if(index!=0){
            sb.append(1);
        }
        
        return sb.reverse().toString(); 
        
    }
}

