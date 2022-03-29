 class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }else{
            String temp = XXX(n-1);
            String res= "";
            int i=0,j=0,count=0;
            for(;j<temp.length();){
                while(j<temp.length()&&temp.charAt(i)==temp.charAt(j)){
                    count++;
                    j++;
                }
                res = res+count+temp.charAt(i);
                i=j;
                count=0;
            }
            return res;
        }
    }
}

