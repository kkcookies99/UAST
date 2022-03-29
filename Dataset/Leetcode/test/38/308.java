class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }else {
            String temp = XXX(n-1);
            String rt = "";
            for(int i = 0;i<temp.length();i++){
                int count = 1;
                while(i+1<temp.length()&&temp.charAt(i+1)==temp.charAt(i)){
                    i++;
                    count++;
                }
                rt += count+""+temp.charAt(i);
            }
            return rt;
        }

    }
}

