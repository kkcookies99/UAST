class Solution {
    public int XXX(String s) {
        boolean start = false;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '&&!flag&&!start) continue;
            if((c=='-'||c=='+')&&!flag) {
                flag = true;
                sb.append(c);
                continue;
            }
            if((c-'0'>=0&&c-'0'<=9)){
                start=true;
                flag = true;
                sb.append(c);
                continue;
            }
            else {
                break;
            }
        }
        if(!start) return 0;
        try{
            Integer res = Integer.parseInt(sb.toString());  
            return res.intValue();
        }catch(Exception e){
            return sb.charAt(0)=='-'?-2147483648:2147483647;
        }
        
    }
}

