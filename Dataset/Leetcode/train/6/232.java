 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1 || s.length() < numRows)
            return s;
        StringBuilder[] result = new StringBuilder[numRows];
        //初始化
        for(int i = 0; i < numRows; i++)
            result[i] = new StringBuilder();
        int index = 0;//字符串对应的指针
        int size = numRows * 2 - 2;//模
        char[] str = s.toCharArray();
        while(index < str.length){
            int temp = (index) % (size);
            if(temp < numRows){
                result[temp].append(str[index++]);
            }else{
                int num = temp - numRows;
                int j = numRows - 2;
                result[j - num].append(str[index++]);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < numRows; i++)
            res.append(result[i]);
        return res.toString();
    }
}

