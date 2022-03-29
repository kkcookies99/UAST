 class Solution {
    public String XXX(String s) {
        
        if(s.equals(""))
            
            return "";
        
        int len=s.length();
        
        int start=0;
        
        int maxLean=1;
        
        boolean[][] r=new boolean[len][len];
        
        for(int i=0;i<len;i++){
            
            for(int j=0;j<=i;j++){
                
                // 长度为1的值必定为回文串，长度为2的需要判断，故可合并为：
                if(i-j<2){
                    
                    r[j][i]=s.charAt(j)==s.charAt(i);
                    
                }else{
                    
                    // 在s.charAt(j)和s.charAt(i)相等的前提下，若r[j+1][i-1]为真即它们之间的字符串为回文串，
                    // 则j到i为回文串
                    r[j][i]=( s.charAt(j)==s.charAt(i) && r[j+1][i-1] );
        
                }
                if(maxLean<i-j+1&&r[j][i]){
                    
                    start=j;
                    
                    maxLean=i-j+1;
                    
                }
                
            }
            
        }
        
        return s.substring(start,start+maxLean);
    }
}

