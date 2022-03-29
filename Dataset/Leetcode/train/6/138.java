 class Solution {
    public String XXX(String s, int numRows) {
        if(s==null || s.length()<=0)
            return s;
        if(numRows==1) return s;
         char[] number = s.toCharArray();
        char[] newNumber = new char[number.length];
        //横向遍历
        //用来记录新数组的第几位
        int count = 0;
        //总跨度
        int sum = (numRows - 1) * 2;
        for(int i=0;i<numRows;i++){
            //跨度
            int limit = (sum - 2*i) <=0 ? sum:sum-2*i;
            int j = i;
            while (j < number.length) {
                newNumber[count++] = number[j];
                j = j + limit;
                limit = (sum-limit) >0 ? sum-limit:limit;
            }
        }
        String returns = String.valueOf(newNumber);
        return returns;
    }
}

