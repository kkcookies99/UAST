 class Solution {
    public String XXX(String s, int numRows) {
        StringBuffer sb = new StringBuffer("");
        if(numRows==1){
            return s;
        }
        for(int j = 0 ; j < numRows; j++){
            for(int i = j ; i < s.length(); i = i+(numRows-1)*2){
                sb.append((char)s.charAt(i));
                if(i+(numRows-1)*2<s.length()){
                    if((i+(numRows-1)*2-j*2)%(numRows-1)==0){
                        continue;
                    }
                    sb.append((char)s.charAt(i+(numRows-1)*2-j*2));
                }else{
                    if((i+(numRows-1)*2-j*2)%(numRows-1)==0){
                        continue;
                    }
                    if((i+(numRows-1)*2-j*2)<s.length()){
                        sb.append((char)s.charAt(i+(numRows-1)*2-j*2));
                    }
                } 
            }
        }
        return sb.toString();
    }
}

