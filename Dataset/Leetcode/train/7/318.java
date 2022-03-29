    class Solution {
        public int XXX(int x) {
            if (x == 0) {
                return 0;
            }
            try {
                boolean negativeFlag = x < 0;
                int num = Math.abs(x);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; (Math.pow(10, i)) <= num; i++) {
                    int left = ((int) (num / Math.pow(10, i))) % 10;
                    if (left == 0 && sb.length() == 0) continue;
                    sb.append(left);
                }
                return Integer.valueOf(sb.toString()) * (negativeFlag ? -1 : 1);
            } catch (Exception e) {
                return 0;
            }
        }
    }

