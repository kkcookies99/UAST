class Solution {
    public String XXX(int n) {
        if(n==1) return "1";
        
        String[] res=new String[n+1];
        res[0]="1";
        for(int i=1;i<n;i++){
            res[i]="";
            res[i-1]+=" ";  //不用判断末尾
            for(int j=0;j<res[i-1].length();j++){
                int numcount=1;
                char num=res[i-1].charAt(j);
                while(j<res[i-1].length()-1&&(res[i-1].charAt(j)==res[i-1].charAt(j+1))){
                    numcount++;
                    j++;
                }
                if(num!=' ')
                    res[i]=res[i]+numcount+num;
            }
        }
        return res[n-1];
    }
}

