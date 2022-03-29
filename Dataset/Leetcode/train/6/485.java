 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
    StringBuilder stringBuilder = new StringBuilder();
    char[] chars = s.toCharArray();
    int length = chars.length;
    //chars的索引
    int index = 0;
    //行级chars的索引
    int flag;
    //方向
    int direct;
    //根据行循环
    for(int i = 0 ; i < numRows ; i++){
        //每一行都重置行索引
        flag = 0;
        //规定“Z”的添加方向，除了最后一行是往上运动，其他都是往下，1向下添加，-1向上
        if(i != numRows -1){
            direct = 1;
        }else{
            direct = -1;
        }
        //当行级索引+chars的索引超出长度跳出
        while (flag + index < length) {
        //拼接
          stringBuilder.append(chars[index + flag]);
        //向下添加的情况下，规律为2 * (numRows - i)，向上添加规律为2 * ((i+1) - 0) - 2
          flag += direct == 1 ? 2 * (numRows - i) - 2 : 2 * ((i+1) - 0) - 2;
        //如果是第一行或最后一行不用切换添加方向，第一行永远往下，最后一行永远往上
          if(i !=0 && i!= numRows -1){
              direct = -direct;
          }
        }
        //每行的起始元素
        index++;
    }
    return stringBuilder.toString();
}
}


