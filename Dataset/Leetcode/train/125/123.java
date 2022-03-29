 class Solution {
    public boolean XXX(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
          char lc = s.charAt(l);  
          char rc = s.charAt(r);
         
          boolean lcf=Character.isLetterOrDigit(lc);
          boolean rcf=Character.isLetterOrDigit(rc);
        // 不是字符和数字就跳过左边或者跳过右边 
        if(!lcf){
             l++;
             continue;
         }
         if(!rcf){ 
             r--;
             continue;
         }
         if(Character.toLowerCase(lc)!=Character.toLowerCase(rc))
             return false;
            r--;
            l++;
            
    }
        return true;
    }
}

