 class Solution {
    public String XXX(int n) {
        if(n==1)return "1";
        String str=XXX(n-1);
        char[] ches=str.toCharArray();
        int num=1;
        String temp=String.valueOf(ches[0]);
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<ches.length;i++){
            if(ches[i]!=ches[i-1]){
                sb.append(num);
                sb.append(temp);
                num=1;
                temp=String.valueOf(ches[i]);
            }else{
                num++;
            }
        }
        sb.append(num);
        sb.append(temp);
        return sb.toString();
    }
}

