class Solution {
    public String XXX(int n) {
        String result = "1";
        for(int i = 1; i < n; i++){
            result = say(result);
        }
        return result;
    }
    
    public String say(String in){
        String out = "";
        int count = 0;
        char ch = in.charAt(0);
        for(int i=0; i < in.length(); i++){
            if(ch == in.charAt(i)){
                count++;
            }else{
                out = out + count + ch;
                count = 1;
                ch = in.charAt(i);
            }
        }
        out = out + count + ch;
        return out;
    }
}

