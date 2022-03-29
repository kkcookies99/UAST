 class Solution {
    public String XXX(int n) {
        if(n==1) return "1";
        //除了第一项，都是对n-1项中的数字个数+数字组成的描述信息
        String str=XXX(n-1);
        StringBuilder sb=new StringBuilder();
        int count=1;
        char cha=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==cha){
                count++;
            }
            else{
                sb.append(count);
                sb.append(cha);
                cha=str.charAt(i);
                count=1;
            }
        } 
        sb.append(count);
        sb.append(cha);
        return sb.toString();
    }
}

