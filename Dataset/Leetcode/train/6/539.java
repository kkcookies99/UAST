 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1 || s.length() == numRows){
            return s;
        }
        int n = s.length();
        int len = (numRows << 1) - 2;
        int point = 0;
        StringBuilder sb = new StringBuilder();
        //首行
        while(point < n){
            sb.append(s.charAt(point));
            point += len;
        }

        //中间
        for(int i = 1;i < numRows - 1;i++){
            point = i;
            int end = len - i;
            while (point < n){
                sb.append(s.charAt(point));
                if(end < n){
                    sb.append(s.charAt(end));
                    end += len;
                }
                point += len;
            }
        }

        //尾行
        point = numRows - 1;
        while(point < n){
            sb.append(s.charAt(point));
            point += len;
        }
        return sb.toString();
    }
}

