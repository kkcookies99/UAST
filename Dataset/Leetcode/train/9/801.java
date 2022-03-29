 class Solution {
    public boolean XXX(int x) {
        String str = Integer.toString(x);
        int low = 0;
        int hight = str.length() - 1;
        boolean flag = true;
        while (low < hight) {
            if (str.charAt(low) == str.charAt(hight)) {
                low++;
                hight--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

