 class Solution {
    public boolean XXX(int x) {
        if(x< 0) {
            return false;
        }
        String s = String.valueOf(x);
        char[] charts = s.toCharArray();
        Stack stack = new Stack();
        boolean f = true;
        for (int j = 0; j < charts.length; j++) {
            stack.push(String.valueOf(charts[j]));
        }
        for (int m = 0; m < charts.length; m++) {
            String v1 = String.valueOf(charts[m]);
            String v2 = (String) stack.pop();
            if(!v1.equals(v2)){
                f = false;
                break;
            }
        }

        return f;
    }
}

