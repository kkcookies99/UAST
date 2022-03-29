 class Solution {
    public String XXX(String a, String b) {
        int add=0;//当作进位
        int i=a.length()-1,j=b.length()-1;
        StringBuilder sb=new StringBuilder();
        //二进制加法复习 0+0=0 0+1=1 1+1=10 。逢2进1  
        //算上进位,那么存在四种情况：0+0+add=0 0+1+add=1 1+1+add=10 1+1+add=11
        //分别处理这四种情况即可，该进位的进位
        while(i>=0&&j>=0){
            int na=a.charAt(i--)-'0';
            int nb=b.charAt(j--)-'0';
            int t=na+nb+add;
            if(t==0){
                sb.append(0);
                add=0;
            }else if(t==1){
                sb.append(1);
                add=0;
            }else if(t==2){
                sb.append(0);
                add=1;
            }else if(t==3){
                sb.append(1);
                add=1;
            }
        }
        while(i>=0){
            int na=a.charAt(i--)-'0';
            int t=na+add;
            if(t==0){
                sb.append(0);
                add=0;
            }else if(t==1){
                sb.append(1);
                add=0;
            }else if(t==2){
                sb.append(0);
                add=1;
            }else if(t==3){
                sb.append(1);
                add=1;
            }
        }

        while(j>=0){
            int nb=b.charAt(j--)-'0';
            int t=nb+add;
            if(t==0){
                sb.append(0);
                add=0;
            }else if(t==1){
                sb.append(1);
                add=0;
            }else if(t==2){
                sb.append(0);
                add=1;
            }else if(t==3){
                sb.append(1);
                add=1;
            }
        }
        if(add==1) sb.append(add);
        return sb.reverse().toString();
    }
}

