class Solution {
    /**
     * 对应ASCⅡ码 ‘0’-‘9’：48-57
     * ‘+’：43
     * ‘-’：45
     * ‘ ’：32
     */
    public static int XXX(String s) {
        long temp = 0;//解析出的整数
        int PN = 1;//最终结果乘上PN表征正负
        boolean flag = false;//判断是否已有符号或数字
        char[] sArr = s.toCharArray();
        for(int i=0;i<sArr.length;i++){
            if(sArr[i]==' '&&(!flag)){
                continue;
            }
            else if(sArr[i]=='+'&&(!flag)){
                flag = true;
                continue;
            }else if(sArr[i]=='-'&&(!flag)){
                PN = -1;
                flag = true;
            }else if((int)sArr[i]>=48&&(int)sArr[i]<=57){//若该字符为数字，存入temp中
                temp = temp*10+((int)sArr[i]-48);//这里temp可能会long越界
                if(temp>=922337203685477580L){
                    break;
                }
                flag = true;//如果读取到数字，则认为已有符号或数字
            }else{//遇到其他非数字字符
                break;
            }
        }
      return longToInt(temp*PN);
    }
    public static int longToInt(long l){
        if(l>Integer.MAX_VALUE){
            l = Integer.MAX_VALUE;//(1<<31)-1
        }else if(l<Integer.MIN_VALUE){
            l = Integer.MIN_VALUE;//(1<<31)
        }
        return (int) l;
    }
}


