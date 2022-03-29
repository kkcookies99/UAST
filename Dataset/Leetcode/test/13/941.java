 class Solution {
    public int XXX(String s) {
   Map<Character, Integer> map = new HashMap<>(7);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        Integer left = null;
        Integer sum = 0;
        for (Character c : chars) {
            Integer right = map.get(c);
            if (left == null) {
                left = right;
                sum = left;
            } else {
                if (left >= right) {
                    sum += right;
                } else {
                    sum += right -  left * 2;
                }
                left = right;
            }
        }
        return sum;
    }
}

