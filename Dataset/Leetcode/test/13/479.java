 class Solution {
    public int XXX(String s) {
        String[] Romas = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int n = s.length();
        Map<String, Integer> RomaMap = new HashMap<>();
        int res = 0;

        for(int i = 0; i < nums.length; i++) {
            RomaMap.put(Romas[i], nums[i]);
        }

        for(int i = 0; i < n; ){
            String temp = "";
            if(i + 1 < n) {
                temp = s.substring(i, i + 2);
            }
            else {
                temp = s.substring(i, i + 1);
            }

            if(RomaMap.containsKey(temp)) {
                res += RomaMap.get(temp);
                i += 2;
            }
            else if(temp.length() > 1) {
                temp = temp.substring(0, 1);
                if(RomaMap.containsKey(temp)) {
                    res += RomaMap.get(temp);
                    i += 1;
                }
            }
        }

        return res;
    }
}

