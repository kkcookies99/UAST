 public String XXX(String s, int numRows) {
        if(s.length()==1||s.length()<=numRows||numRows==1){
            return s;
        }
        char[] cha = s.toCharArray();
        int length = s.length();
        //根据规律可得出行的列数，我这里将行数扩大了，不影响结果
        int lie=(length/(numRows*2-2)+1)*(numRows-1);//判断出数组应该有多少行
        int count =0;//cha数组的下标
        char[][] chas = new char[lie][numRows];//将题目转化为为从左往右，从上往下Z字行排列
        for (int i = 0; i < chas.length; i++) {
            for (int j = 0; j < chas[i].length; j++) {
                if(count<length&&count%(numRows*2-2)>=0&&count%(numRows*2-2)<numRows){//判断符合条件的cha数组坐标
                    if(i%(numRows-1)==0){
                        chas[i][j]=cha[count];
                        count++;
                    }
                }else if(count<length&&(i%(numRows-1)==(count%(numRows*2-2)-(numRows-1)))){
                        chas[i][chas[i].length-1-(i%(numRows-1))]=cha[count];
                        count++;
                    }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < lie; j++) {
                if(chas[j][i]!='\u0000'){
                    sb.append(chas[j][i]);
                }
            }
        }
        return sb.toString();
    }

