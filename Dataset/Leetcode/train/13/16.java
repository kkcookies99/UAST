class Solution {
    public int XXX(String s) {
        //创建对象罗马数字关系映射表
        Map<String, Integer> map = new HashMap<String, Integer>() {
            private static final long serialVersionUID = -3402925446944827654L;

            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
            }
        };
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer value = map.get(chars[i] + "");
            if (i < chars.length - 1 && map.get(chars[i] + "") < map.get(chars[i + 1] + "")) {
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;
    }
}

