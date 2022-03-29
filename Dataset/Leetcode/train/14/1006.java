 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs, (String s1, String s2) -> (s1.split("").length-s2.split("").length));  
        String [][] a = new String[strs.length][];
        for(int i=0;i<strs.length;i++){
            a[i] = strs[i].split("");
        }
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        for(int i=0;i<a[0].length;i++){
            for(int j=1;j<a.length;j++){
                if(!a[j][i].equals(a[0][i])){
                    return sb.toString();
                }else{
                    flag= true;
                 }
            }
            if(flag){
                sb.append(a[0][i]);
            }
        }
        return sb.toString();
    }
}

