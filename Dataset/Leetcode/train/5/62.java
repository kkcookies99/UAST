 class Solution {
    public  String XXX(String s) {
        char[] charArray = s.toCharArray();
        int begin = 0;
        int end = 1;
        int maxlenth = 1;
        for (int i = 1; i < s.length(); i++) {
            //寻找出要左右偏移的起始位置
            int left = i - 1, right = i + 1;
            //首先判断中心点邻居是否重复
            //向左寻找重复值
            while (left >= 0) {
                if (charArray[left] == charArray[i]) {
                    left--;
                } else {
                    break;
                }
            }

            //优化点1：如果向右有重复的点，则下次遍历可以跳过的
            int repeatNum = 0;
            while (right <= s.length() -1) {
                if (charArray[right] == charArray[i]) {
                    right++;
                    repeatNum++;
                } else {
                    break;
                }
            }



            //左右扩展
            while (left >= 0 && right <= (s.length() -1)) {
                if (charArray[left] == charArray[right]) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            //计算长度
            int tempLength = right - (left + 1);

            if (tempLength > maxlenth) {
                begin = left + 1;
                end = right;
                maxlenth = tempLength;
            }

            //优化点1：如果向右有重复的点，则下次遍历可以跳过的
            i += repeatNum;

        }

        return s.substring(begin,end);
    }
}

