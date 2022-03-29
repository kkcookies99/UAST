 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs, (String s1, String s2) -> (s1.compareTo(s2)));  
        String min = strs[0];
        String max = strs[strs.length-1];
        boolean flag = false;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<strs[0].length();i++){
            if(min.charAt(i)==max.charAt(i)){
                flag = true;
            }else{
                return sb.toString();
            }
            if(flag){
                sb.append(min.charAt(i));
            }
        }
        return sb.toString();
    }
}

