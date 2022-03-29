class Solution {
    public String XXX(int n) {
        StringBuilder sb1 = new StringBuilder("1");
        StringBuilder sb2 = new StringBuilder();
        while(--n > 0){
            if(sb1.toString().equals("")){
                sudstring(sb2,sb1);
            }else sudstring(sb1,sb2);
        }
        return sb1.toString().equals("") ? sb2.toString() : sb1.toString();
    }
    private void sudstring(StringBuilder sb1, StringBuilder sb2){
        int left = 0, right = 0;
        sb1.append(' ');
        char[] chs = sb1.toString().toCharArray();
        while(right < chs.length){
            if(chs[left] != chs[right]){
                sb2.append(right-left);
                sb2.append(chs[left]);
                left = right;
            } else right++;
        }
        sb1.delete(0,chs.length);
    }
}

