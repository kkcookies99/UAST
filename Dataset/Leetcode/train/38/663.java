 class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }else{
            String s = XXX(n-1);
            StringBuilder s1 = new StringBuilder();
            int num = s.length();
            char c1 = s.charAt(0);
            char c2 = c1;
            int count = 1;
            for(int i = 1;i<num;i++){
                c2 = s.charAt(i);
                if(c1 == c2){
                    count++;
                }else{
                    s1.append(count);
                    s1.append(c1);
                    c1 = c2;
                    count = 1;
                }
            }
            s1.append(count);
            s1.append(c2);
            return s1.toString();
        }
    }
}

