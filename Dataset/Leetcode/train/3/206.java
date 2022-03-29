 class Solution {
    public int XXX(String s) {
       int sum = 0;
        int max = 0;
        //存储 字符以及字符最后一次出现位置
        Map<Character,Integer> map = new HashMap<>();
        char[] str= s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if(map.containsKey(str[i])){
                //当前字符重复了 所以sum不需要+1直接和最大值比对即可
                max = Math.max(max,sum);
                //i-map.get(str[i]),sum+1
                //更改分情况讨论
                //例子tmmzuxt
                //扫描到第二个m 发现重复 i-map.get(str[i])<sum 
                //sum = min(i-map.get(str[i]),sum);
                //扫描到第二个t时 i-map.get(str[i])>sum
                //说明i-map.get(str[i])中存在重复 当前的sum应该算上最后一个字符 子串也就是mzuxt
                //i-map.get(str[i]) = sum 取最小值取哪个都行
                //综合起来就是min(i-map.get(str[i]),sum+1);
                sum = Math.min(i-map.get(str[i]),sum+1);
            }else{
                //如果不重复每次更新子串长度
                sum++;
            }
            map.put(str[i],i);
        }

        return Math.max(sum,max);
    }
}

