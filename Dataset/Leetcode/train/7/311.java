class Solution {
    public int XXX(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
        sb.XXX();

        if (x < 0) {
            sb.insert(0, '-');
        }

        try {
            int result = Integer.parseInt(sb.toString());
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

