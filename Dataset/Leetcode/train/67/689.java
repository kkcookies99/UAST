class Solution {
    public String XXX(String a, String b) {
    int len1=a.length();
    int len2=b.length();
    int i=len1-1;
    int j=len2-1;
    int flag=0;
    StringBuilder ff=new StringBuilder();
    int sum=0;
    while(i>=0&&j>=0){
        sum=a.charAt(i)-'0'+b.charAt(j)-'0'+flag;
        flag=0;
        if(sum>=2){
            flag=1;
            sum=sum-2;
        }
        ff.append(sum+"");
        i--;
        j--;
    }
    sum=0;
    while(i>=0){
        sum=a.charAt(i)-'0'+flag;
        flag=0;
        if(sum>=2){
            flag=1;
            sum=sum-2;
        }
        ff.append(sum) ;    
        i--;
    }
     while(j>=0){
        sum=b.charAt(j)-'0'+flag;
        flag=0;
        if(sum>=2){
            flag=1;
            sum=sum-2;
        }
        ff.append(sum);
        j--;
     }
    if(flag==1){
        ff.append(flag);
    }
    return ff.reverse().toString();
    }
}

