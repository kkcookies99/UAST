class Solution {
    public String XXX(int n) {
        String str = "1",str2 ="";
        int nn = 1;
        if(n==1)return "1";
        while(nn<n){  
            char s ='a';
            int j =0;
            str2 = "";
           char[] str3 = str.toCharArray();
            for(int i =0;i<= str3.length;i++){
                if(i<str3.length&&str3[i] ==s){
                    j++;
                }else {
                    if(i!=0){
                        str2 +=String.valueOf(j);
                        str2 +=String.valueOf(str3[i-1]);
                    }
                    if(i<str3.length){
                         s =str3[i];
                         j =1; 
                    }
                     
                }  
            }
            str =str2;
            nn++;
        }
        return str;
    }
}

