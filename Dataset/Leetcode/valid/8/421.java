 class Solution {
    public int XXX(String s) {
        if(s.length() == 0) return 0;
        int min = Integer.MIN_VALUE/10;
        
        char[] ch = s.toCharArray();
        boolean posi = true;
        int i =0;
        while(i<ch.length && ch[i]==' ' ){
            i++;  
        }
        if(i == ch.length) return 0;
        if(ch[i]=='-'){
            posi=false;
            i+=1;
        }else if(ch[i]=='+'){
            posi=true;
            i+=1;
        }
        while(i<ch.length && ch[i]=='0'){
            i++;
        }
        int res =0;
        int count =0;
        while((i<ch.length)&&(ch[i]>='0' && ch[i]<='9')){
            count++;
            if(count>10) 
            {
               if(posi) return 2147483647;
               else return -2147483648;
            }
            if(res>214748364){
                if(posi==true){
                    return 2147483647;
                }else{
                    return -2147483648;
                }
            }else if(res == 214748364){
                if(posi==true){
                    if((ch[i] - '0')>7) return 2147483647;
                }else{
                    if((ch[i] - '0')>8) return -2147483648;
                }
            }
            res = res*10 + (ch[i] - '0');
            i++;
        }
        res = posi? res:-res;
        // if(res>max*10) return 2147483647;
        // if(res<min*10) return -2147483648;
        return res;
    }
}

