 class Solution {
    public boolean XXX(int x) {
        if(x<0){
            return false;
        }
        String str = Integer.toString(x);
        char[] num = str.toCharArray();
        for(int i = 0;i<num.length/2;i++){
            if(num[i] != num[num.length -1 -i]){
                return false;
            }
        }
        return true;
    }
}

