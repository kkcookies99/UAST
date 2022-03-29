class Solution {
  public String XXX(int n) {
        if( n == 1) {
            return "1";
        }

        int i = 1;
        String res = "1";
        // 生成信息 ，循环读取n次
        while ( i < n) {
            String num = res;
            int index = 0 ;
            StringBuilder sb = new StringBuilder();

            // 读取数据信息
            while ( index < num.length()){
                char say = num.charAt(index);
                int count = 1;
                // 统计个数
                while (++index < num.length() && say == res.charAt(index)){
                    count ++ ;
                }
                sb.append(count+"").append(say);
            }


            res = sb.toString();
            i++;
        }
        return  res;
    }
}

