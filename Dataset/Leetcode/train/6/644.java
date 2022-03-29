 class Solution {
    public String XXX(String s, int numRows) {
         if(numRows == 1)return s;
        //创建存储每个行的数据
        List<StringBuilder> list = new ArrayList<>();
        //o(n)
        for(int i = 0; i < numRows; i++){
            list.add(new StringBuilder());
        }
        //自动挡转换标识
        int num = 0;
        boolean flag = false;
        //o(n)
        for(int i = 0; i < s.length(); i++){
            final char c = s.charAt(i);
            list.get(num).append(c);
            //处理边界
            if (num == 0 || num == numRows - 1){
                flag = !flag;
            }
            num += flag ? +1 : -1;
        }
        //o(n)
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : list){
            res.append(sb);
        }
        return res.toString();
    }
}

