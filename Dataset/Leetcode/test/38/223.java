class Solution {
    public String XXX(int n) {
        String before="1";
        String after="1";
        int count=1;
        for(int i=1;i<n;i++){
            after="";
            for(int j=0;j<before.length();j++){
                if(j+1==before.length()){//遍历到最后一个字母了，直接输出
                    after=after+Integer.toString(count)+before.charAt(j);
                    before=after;
                    count=1;
                    break;
                }
                if(before.charAt(j)==before.charAt(j+1)){//当前字母和下个字母相同的话，count++,继续遍历下一个
                    count++;
                }
                else{
                    after=after+Integer.toString(count)+before.charAt(j);//当前字母和下个字母不相同的话，就输出当前字母
                    count=1;
                }
            }
        }

        return after;
    }
}

