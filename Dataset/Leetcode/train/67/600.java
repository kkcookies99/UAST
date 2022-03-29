class Solution {
    public String XXX(String a, String b) {
        //进位标志，初始false
        boolean isover = false;
        StringBuilder builder = new StringBuilder();
        int len1 = a.length();
        int len2 = b.length();
        int i =len1-1;
        int j = len2-1;
        char c1;
        char c2;
        for (;i>=0||j>=0;i--,j--){
            //如果a串遍历结束，之后计算全部设置为‘0’
            if (i<0)
                c1 = '0';
            else
                c1 = a.charAt(i);
            //同理b串遍历结束设置‘0’
            if (j<0)
                c2 = '0';
            else
                c2 = b.charAt(j);

            if (c1=='1'&&c2=='1') {
                //有进位
                if (isover){
                    //isover依旧进位，为true不变
                    builder.insert(0,'1');
                }
                else {
                    //上次无进位，这次需要进位，isover设置为true
                    builder.insert(0,'0');
                    isover = true;
                }
            }
            //只有一个为1
            else if (c1=='1'||c2=='1'){
                if (isover)
                    builder.insert(0,'0');
                else {
                    builder.insert(0,'1');
                }
            }
            //全为0
            else {
                if (isover){
                    builder.insert(0,'1');
                    isover = false;
                }
                else {
                    builder.insert(0,'0');
                }
            }
        }
        //最后仍需要进位
        if (isover)
            builder.insert(0,'1');
        return builder.toString();
    }
}

