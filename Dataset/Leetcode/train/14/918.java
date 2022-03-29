 class Solution {
    public String XXX(String[] strs) {
        String res = "";
        int shortflag = 200;
        int shortflagnumber = 0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<shortflag){
                shortflag = strs[i].length();
                shortflagnumber = i;
            }
        }
        String shortstr = strs[shortflagnumber];
        for(int i=0;i<shortstr.length();i++){
            int f = 0;
            for(int j=0;j<strs.length;j++){
                if(shortstr.substring(i,i+1).equals(strs[j].substring(i,i+1))){
                    f++;
                }
            }
            if(f == strs.length){
                res+=shortstr.substring(i,i+1);
            }else{
                break;
            }
        }
        return res;
    }
}

