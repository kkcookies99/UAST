 class Solution {
        public int XXX(String s) {
            int length = s.length();
            int max = 0;
            int left = 0, right = 0;
            HashMap<Character, Integer> map = new HashMap<>();

            // 每次移动都确保窗口内的字符串为合法的
            // 如果不合法，就将字符串左端点移动到最近的使得字符串合法的位置
            while (right < length){
                if (map.containsKey(s.charAt(right)) && left < map.get(s.charAt(right)) + 1){
                    left = map.get(s.charAt(right)) + 1;
                }
                map.put(s.charAt(right), right);
                max = Math.max(max, right - left + 1);
                right++;
            }
            return max;
        }
    }

