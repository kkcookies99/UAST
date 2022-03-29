class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }
        String pre=XXX(n-1);
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<pre.length()){
            int j=i+1,count=1;
            while(j<pre.length() && pre.charAt(j)==pre.charAt(i)){
                count++;j++;
            }
            res.append(count+""+pre.charAt(i));
            i=j;
        }
        return res.toString();
    }
}

