 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder sb=new StringBuilder();
        char[] ss=s.toCharArray();
         //要跨越的最大步数
        int max=2*numRows-2;
        for(int i=0;i<numRows;i++){
            //偏移量
            int pos=0;
            //该层的前进步数
            int step=0;
            //每层前进步数是否恒定，第一行和最后一行恒定
            boolean posi=true;
            int tmp=2*(numRows-i)-2;
            boolean flag=false;
            //讨论pos的增进情况
            if(tmp==0)
                step=max;
            else if(tmp==max)
                step=max;
            else{
                flag=true;
                step=tmp;
            }
            while(i+pos<ss.length){
                sb.append(ss[i+pos]);
                if(flag){
                    if(posi) pos+=step;
                    else pos+=max-step;
                    posi=!posi;
                }else{
                    pos+=step;
                }
            }
        }
        return sb.toString();
    }
}

