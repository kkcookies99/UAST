 class Solution {
    public int XXX(String str) {
        // 去除掉空隔
        str = str.trim();
        // 去除掉空格如果为空则返回
        if(str.length()==0){
            return 0;
        }
        // 查看是否是负数
        boolean flag = false;
        // 转换为负数
        char []a = str.toCharArray();
        // 判断是否是正负数，和是否是数字
        if(a[0]=='+'||a[0]=='-'||Character.isDigit(a[0])){
            // 开头是否是符号
            if(a[0]=='+'||a[0]=='-'){
                if(a[0]=='-'){
                    flag = true;
                }
                // 去除掉第一位
                a = Arrays.copyOfRange(a,1,a.length);
            }
            int index = 0;
            long res = 0;
            // 
            while(index<a.length&&Character.isDigit(a[index])){
                res*=10;
                res+=a[index]-'0';
                // 如果越界了直接返回
                if(res>Integer.MAX_VALUE){
                    return flag?-Integer.MAX_VALUE-1:Integer.MAX_VALUE;
                }
                index++;
            }
            // 如果是负数的话直接返回负的数字
            return flag ? (int)-res:(int)res;
        }else{
            // 连数字都不是，拜拜吧你咧
            return 0;
        }
    }
}

