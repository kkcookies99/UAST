 class Solution {
    public boolean XXX(int x) {
        String str = String.valueOf(x);
        String[] ss = str.split("");
        int num = ss.length-1;
        for(int i=0;i<ss.length;i++){
            if(!ss[i].equals(ss[num])){
                return false;
            }
            num--;
        }
        return true;
    }
}

