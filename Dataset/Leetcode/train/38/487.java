 class Solution {
    public String XXX(int n) {
 // 递归出口
        if(n==1){
            return "1";
        }
        // 假设我们获得上一次的结果为 s1 = 112213
        String s1 = XXX(n - 1);
        // 定义结果
        StringBuilder result = new StringBuilder();
        // 对s1遍历处理获取值
        char local = s1.charAt(0);
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            // 设定计数器 计算同一个数字出现的次数 count
            if(s1.charAt(i) == local){
                count++;
            }else {
                // 不符合，记录下
                result.append(count);
                result.append(local);
                count = 1;
                local = s1.charAt(i);
            }
        }
        result.append(count);
        result.append(local);
        return result.toString();

    }
}

