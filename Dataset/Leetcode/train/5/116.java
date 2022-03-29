 class Solution {
    public String XXX(String s) {
        if(s == null || s.trim().length() == 0){
            return "";
        }
        char[] c = s.toCharArray();
        int n = c.length;
        int t1,t2;
        int max = 0,start = 0,end = 0;
        for(int i = 0 ; i < n ; i++){
            t1 = i;
            t2 = i;
            while(t1 >= 0 && t2 < n && c[t1] == c[t2]){
                if(t2 - t1 > max){
                    max = t2 - t1;
                    start = t1;
                    end = t2;
                }
                
                t1--;
                t2++;
            }
            t1 = i;
            t2 = i + 1;
            while(t1 >= 0 && t2 < n && c[t1] == c[t2]){
                if(t2 - t1 > max){
                    max = t2 - t1;
                    start = t1;
                    end = t2;
                }
                t1--;
                t2++;
            }
        }
        return s.substring(start,end+1);


    }
}

