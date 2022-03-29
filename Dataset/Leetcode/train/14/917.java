 class Solution {
    public String XXX(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int shortest = Integer.MAX_VALUE;
        for(String s : strs){
            shortest = Math.min(shortest, s.length());
        }
        for(int i = 0; i < shortest; i++){
            boolean flag = true;
            char tmp = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(tmp != strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.append(tmp);
            }
            else{
                break;
            }
        }
        return ans.toString();
    }
}

