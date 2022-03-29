 class Solution {
    public String XXX(String s, int numRows) {
char[][] temp=new char[numRows][s.length()];
int count=0;//表示第几列
for(int i=0;i<s.length();){
    // 中间的数 即排列成z的 列数有 numrows-2 比如3 只有中间一个 假设前面最后一个是i,j 该坐标：i-1,j+1
        for (int j = 0; j < numRows&&i<s.length(); j++) {
            temp[j][count]=s.charAt(i);
            i++;
        }
        count++;
    //去掉第一行和最后一行
        for(int j=numRows-2;j>0&&i<s.length();j--){
            temp[j][count]=s.charAt(i);
            i++;
            count++;
        }
    }

//
   StringBuffer sb=new StringBuffer();
    for (int i = 0; i < temp.length; i++) {
        for (int j = 0; j < temp[i].length; j++) {
            if(temp[i][j]!=' ')sb.append(temp[i][j]);
        }
    }
    return sb.toString();
    }
}

