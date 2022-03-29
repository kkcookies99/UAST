class Solution {
    public int XXX(String s) {
        char[] ss=s.toCharArray();
        int sum=0;
        boolean flag=true;
        int i=0;
        for(i=0;i<ss.length;i++){
            if(ss[i]==' ') continue;
            if(ss[i]=='-'){
                flag=false;
                i++;
                break;
            }
            if(ss[i]=='+'){
                i++;break;
            }
            if(ss[i]>='0'&&ss[i]<='9') break;
            return 0;
        }
        while(i<ss.length&&ss[i]>='0'&&ss[i]<='9'){
            if(sum>Integer.MAX_VALUE/10){
                return flag? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }else if(sum==Integer.MAX_VALUE/10){
                if(flag){
                    if(ss[i]>='7') return Integer.MAX_VALUE;
                }else{
                    if(ss[i]>='8') return Integer.MIN_VALUE; 
                }
            }
            sum*=10;
            sum+=ss[i]-'0';
            i++;
        }
        if(!flag) sum=-sum;
        return sum;
    }
}

