 class Solution {
    public String XXX(int n) {
        String res = "1";
        for(int i = 1; i < n; i++){
            res = helper(res);
        }

        return res;
    }

    public String helper(String s){
        //左指针
        int left = 0;
        //右指针
        int right = left + 1;
        //统计重复字符数量
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while(right < s.length()){
            //不相等则加入结果sb，并且移动左右指针
            if(s.charAt(right) != s.charAt(left)){
                sb.append(count).append(s.charAt(left));
                left = right;
                right++;
                count = 1;
            }else{
                //相等只移动右指针，同时计数+1
                count++;
                right++;
            }
        }
        //右节点越界后，左节点还未越界，最后维护一次
        sb.append(count).append(s.charAt(left));
        return sb.toString();
    }
}

