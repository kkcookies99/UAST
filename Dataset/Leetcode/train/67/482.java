class Solution {
    public String XXX(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        if(i==-1){
            return b;
        }
        if(j==-1){
            return a;
        }
        StringBuilder str=new StringBuilder();
        int carry=0;
        while(i>=0&&j>=0){
            int sum=carry;
            sum+=a.charAt(i)-'0';
            i--;
            sum+=b.charAt(j)-'0';
            j--;
            carry=sum/2;
            str.append(sum%2);
        }
        //有一个没有走完
        while(i>=0){
            int sum=carry;
            sum+=a.charAt(i)-'0';
            i--;
            carry=sum/2;
            str.append(sum%2);
        }
         while(j>=0){
            int sum=carry;
            sum+=b.charAt(j)-'0';
            j--;
            carry=sum/2;
            str.append(sum%2);
        }
        //最后的sum的值为2时，说明carry的值为1，即需要进一步
        if(carry==1){
            str.append(1);
        }
        //字符串加进去是反的，则需要逆置
        return str.reverse().toString();
    }
}

