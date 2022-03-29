public String XXX(int n) {
    if(n==1){
        return "1";
    }
    else{
        String last=XXX(n-1);
        StringBuilder res=new StringBuilder();
        char[] str=last.toCharArray();
        for(int i=0;i<str.length;){
            int count=1;
            int j=i;
            while(j<str.length-1&&str[j]==str[j+1]){
                count++;
                j++;
            }
            res.append(count);
            res.append(str[j]);
            i+=count;
        }
        return res.toString();
    }
}
