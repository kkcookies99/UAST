 class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }else{
            String A = XXX(n-1);
            StringBuilder a = new StringBuilder("");
            int count = 1;
            char curr = A.charAt(0);
            for(int i = 1;i<A.length();i++){
                if(A.charAt(i) != curr){
                    a.append(count);
                    a.append(curr);
                    curr = A.charAt(i);
                    count = 1;
                }else{
                    count++;
                }
            }
            a.append(count);
            a.append(curr);
            return a.toString();
        }
    }
}

