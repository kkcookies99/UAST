 class Solution {
    public String XXX(String s) {
        if(s.length() <= 1) return s;
        StringBuilder sb = new StringBuilder();
        char[] cc = s.toCharArray();
        int len = cc.length-1;
        int count = 0;
        for(int k = 0; k < len; ++k){
            int i = k;
            int j = len; 
            count = 0;
            while(i < j){
                if(cc[i] == cc[j]){
                    count++;
                    j--;
                    i++;
                }else{
                    j = j + count -1;
                    i -= count;
                    count = 0;
                }
            }   
            i -= count;
            j += count;
            if(j-i+1 > sb.length()){
                sb = new StringBuilder();
                for(int l = i; l <= j; ++l)
                    sb.append(cc[l]); 
            }
        }
        return sb.toString();
    }
}

