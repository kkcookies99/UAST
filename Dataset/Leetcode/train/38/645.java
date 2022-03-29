 class Solution {
    public String XXX(int n) {
if (n==1){
            return "1";
        }else {
            String s = XXX(n - 1);
            return getStr(s);
        }
    }
    String getStr(String str){
        int j=0;
        int k=0;
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if (chars[j]==chars[i]){
                k++;
            }else {
                stringBuilder.append(k);
                stringBuilder.append(chars[j]);
                k=1;
                j=i;
            }
        }
        stringBuilder.append(k);
        stringBuilder.append(chars[j]);
        return stringBuilder.toString();
    }
}

