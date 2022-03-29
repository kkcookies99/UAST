class Solution {
    public String XXX(int n) {
        StringBuilder input=new StringBuilder("1");
        for(int i=2;i<=n;i++){
            input=XXX(input);
        }
        return input.toString();
    }
    
    static StringBuilder XXX(StringBuilder input) {
        StringBuilder builder=new StringBuilder();
        int len=input.length();
        int count=1;
        char firstChar=input.charAt(0);
        for(int i=1;i<len;i++){
            char now=input.charAt(i);
            if(firstChar==now){
                count++;
            }else{
                builder.append(count).append(firstChar);
                firstChar=now;
                count=1;
            }
        }
        builder.append(count).append(firstChar);
        return builder;
    }
}

