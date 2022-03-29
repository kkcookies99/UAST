class Solution {
    public  String XXX(int n) {
        if (n==1){
            return "1";
        }else {
            return comment(XXX(n-1));
        }
    }

    public  String comment(String n) {
        char[] chars = n.toCharArray();
        int left=0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!=chars[left]){
                stringBuilder.append(i-left).append(chars[left]);
                left=i;
            }
            if (i==chars.length-1){
                stringBuilder.append(i-left+1).append(chars[left]);
            }
        }
        return stringBuilder.toString();
    }
}

