 class Solution {
    public int XXX(String s) {
        String str = s.trim();
        int i = str.length()-1;
        int num = 0;
        while(str.charAt(i)!=' '){
            num++;
            if(i>0){
                i--;
            }else{
                break;
            }
        }
        return num;
    }
}

