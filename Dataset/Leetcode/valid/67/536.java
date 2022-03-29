class Solution {
    public String XXX(String a, String b) {
        int[]num1=new int[Math.max(a.length(),b.length())+1];
        char []ch1=a.toCharArray();
        char []ch2=b.toCharArray();
        for(int i=0;i<ch1.length;i++)
        num1[num1.length-i-1]=ch1[ch1.length-i-1]-'0';
        for(int i=0;i<ch2.length;i++)
        num1[num1.length-i-1]+=ch2[ch2.length-i-1]-'0';
        for(int i=num1.length-1;i>0;i--){
            num1[i-1]+=num1[i]/2;
            num1[i]=num1[i]%2;
        }
        int index=0;
        for(int i=0;i<num1.length;i++)
        if(num1[i]==1){index=i;break;}
        else if(i==num1.length-1){index=num1.length-1;}
        StringBuilder sb=new StringBuilder();
      
        for(int i=index;i<num1.length;i++)sb.append(String.valueOf(num1[i]));
        return sb.toString();
    }
}

