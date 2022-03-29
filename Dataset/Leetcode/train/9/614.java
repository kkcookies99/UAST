 class Solution {
    public boolean XXX(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        List<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x%10);
            x=x/10;
        }
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (list.get(i++) != list.get(j--)) {
                return false;
            }
        }
        return true;
    }
}

