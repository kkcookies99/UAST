class Solution {
    public String XXX(int n) {
        String str="1";
        for(int i=2;i<=n;i++){
            char[] list=str.toCharArray();
            int r=str.length(),l=0,count=1;
             StringBuilder newstr= new StringBuilder();
            while(l<(r-1)){
                if(list[l]==list[l+1]){
                    count++;
                    l++;
                }else{
                    newstr.append(String.valueOf(count));
                    newstr.append(list[l]);
                    l++;
                    count=1;
                }
            }
            if(l==(r-1)){
                newstr.append(String.valueOf(count));
                newstr.append(list[l]);
            }
            str=newstr.toString();
            }
        return str;
    }
}

