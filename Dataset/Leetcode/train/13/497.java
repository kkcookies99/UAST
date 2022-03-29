 class Solution {
    public int XXX(String s) {
        char[] sc=s.toCharArray();
        int [] num={1,5,10,50,100,500,1000};
        char [] roma={'I','V','X','L','C','D','M'};
        int result=0;
        int pre=0;
        for(int i=sc.length-1;i>=0;i--){
            for(int j=0;j<roma.length;j++){
                if(roma[j]==sc[i]){
                    if(num[j]>=pre){
                        result+=num[j];
                    }else{
                        result-=num[j];
                    }
                    pre=num[j];
                }
            }
        }
        return result;
    }
}

