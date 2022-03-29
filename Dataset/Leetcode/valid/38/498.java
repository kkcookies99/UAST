 class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }
        String temp=XXX(n-1);
        return helper(temp);
    }
    public String helper(String s){
        char[] ch=s.toCharArray();
        int index=0;
        StringBuffer sb=new StringBuffer();
        while(index<ch.length){
            char cur=ch[index];
            char num='0';
            while(index<ch.length && ch[index]==cur){
                num+=1;
                index++;
            }
            sb.append(num).append(cur);
        }
        return sb.toString();
    }
}

