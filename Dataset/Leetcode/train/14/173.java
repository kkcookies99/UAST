 class Solution {
    public String XXX(String[] strs) {
        int N=strs.length;
        StringBuilder sb=new StringBuilder();
        int cur=0;
        while(true)
        {    
            char a='0';
            if(cur<strs[0].length())
            {
                a=strs[0].charAt(cur);
                for(int i=1;i<N;i++){
                    if(strs[i].length()<=cur){
                        return sb.toString();
                    }
                    if(strs[i].charAt(cur)!=a){
                        return sb.toString();
                    }
                }
                sb.append(a);
                cur++;
            }
            else return sb.toString();
        }
    }
}

