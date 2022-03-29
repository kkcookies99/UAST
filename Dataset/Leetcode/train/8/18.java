class Solution {
    public int XXX(String s) {
        long num=0;
        //判读空格前是否存在数字，“+”和“-”
        boolean isStart=false;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //先判断是否为空格
            if(c==' '){
                if(num!=0){
                    if(flag){
                        return (int) ((-1)*num);
                    }
                    return (int) num;
                }
                //越界判断
                if(isStart){
                    return 0;
                }
                continue;
            }
            if(c=='-'||c=='+'){
                isStart=true;
                if(num!=0){
                    if(flag){
                        return (int) ((-1)*num);
                    }
                    return (int) num;
                }
                //越界判断
                if(i-1>=0){
                    //预防“+-6”这种情况的数字发生
                    if(s.charAt(i-1)=='-'||s.charAt(i-1)=='+'||(s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')){
                        return 0;
                    }
                }
                continue;
            }
            //再判断是不是为数字
            if(c>='0'&&c<='9'){
                isStart=true;
                //判断当前的数字是不是第一个数字
                if(num==0){
                    //越界判断
                    if(i-1>=0){
                        if(s.charAt(i-1)=='-'){
                            flag=true;
                        }
                    }
                }
                num=num*10;
                //int类型最大最小整数判断
                if(num*(flag?(-1):1)<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                if(num*(flag?(-1):1)>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                int n=Integer.parseInt(String.valueOf(c));
                num=num+n;
                //int类型最大最小整数判断
                if(num*(flag?(-1):1)<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                if(num*(flag?(-1):1)>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                //最后一个字符为数字的时候也进行终止
                if(i==s.length()-1){
                    if(flag){
                        return (int) ((-1)*num);
                    }
                    return (int) num;
                }
                //num不为0的时候，遇到字母则终止流程
            }else if(num!=0){
                if(flag){
                    return (int) ((-1)*num);
                }
                return (int) num;
                //num为0的时候，遇到字母返回0
            }else if(num==0){
                return 0;
            }
        }
        return (int) num;
    }
}

