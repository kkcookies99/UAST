 class Solution {
    public String XXX(String a, String b) {
        int index1=a.length()-1,index2=b.length()-1;
        StringBuilder sb=new StringBuilder();
        int res=0;
        while(index1>=0 || index2>=0 || res>0){
            if(index1>=0){
                int x=a.charAt(index1--)-48;
                res+=x;
            }
            if(index2>=0){
                int y=b.charAt(index2--)-48;
                res+=y;
            }
            sb.append(String.valueOf(res%2));
            res=res/2;
        }
        sb.reverse();
        return sb.toString();
    }
}

