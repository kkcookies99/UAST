class Solution {
    public int XXX(String s) {
        s = s.trim();
        // 有限状态机
        // +- 0-9 空格

        // 0  空格
        Map<Character, Integer> zero = new HashMap<>();
        zero.put(' ', 0);// 接空格
        zero.put('s', 1); // 接 +-
        zero.put('d', 2); // 接 数字
        // 1  +-
        Map<Character, Integer> one = new HashMap<>();
        one.put('d', 2); // 接 数字

        // 2 数字
        Map<Character, Integer> two = new HashMap<>();
        two.put('d', 2); // 接 数字

        // 3 .后空格
        Map<Character, Integer> tree = new HashMap<>();
        tree.put(' ', 3); // 接 后空格
        Map<Character, Integer>[] status = new Map[]{zero, one, two, tree};

        StringBuilder sb = new StringBuilder();
        int index = 0;
        char sign = ' ';
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char t = '?';
            if(c == ' '||c == '.' ){
                t = c;
            }else if( c == '+' || c == '-'){
                t = 's';
            }else if( c >= '0' && c <= '9'){
                t = 'd';
            }

            if(!status[index].containsKey(t)){
                break;
            }
            index = status[index].get(t);
            if(index == 1){
                sign = c;
            }else if(index == 2){
                if(c == '0' && sb.length() == 0){
                    continue;
                }
                sb.append(c);
            }else{
                break;
            }
        }
        //base case
        if(sb.length() == 0 || (index != 2)){
            return 0;
        }
        sb.insert(0,sign);
        String res = sb.toString().trim();
        if(res.charAt(0) != '-' && ( res.length() > 12 || Long.parseLong(res) > Integer.MAX_VALUE)){
            return Integer.MAX_VALUE;
        }
        if(res.charAt(0) == '-' &&  (res.length() > 12 || Long.parseLong(res) < Integer.MIN_VALUE)){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(res.toString());
    }
}

