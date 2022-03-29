 class Solution {
    public String XXX(String a, String b) {
        int n1=a.length(),n2=b.length();
        StringBuilder build=new StringBuilder();
        int i=n1-1,j=n2-1,c=0,sum;
        int c1,c2;
        while(i>=0||j>=0){
            c1=i<0?0:a.charAt(i)-'0';
            c2=j<0?0:b.charAt(j)-'0';
            sum=c1+c2+c;//注意这里的和有四种，0,1,2,3.其中后两种是需要进位的
            if(sum<2) c=0;
            else c=1;
            build.append(sum%2);
            i--;
            j--; 
        }
        if(c==1) build.append("1");
        return build.reverse().toString();
    }
}

