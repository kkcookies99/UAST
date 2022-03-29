class Solution {
    public int XXX(int n) {
        int pre = 0;
        int next = 1;
        int total = pre + next;
        for(int i = 1;i<n;i++){
            pre = next;
            next = total;
            total = pre + next;
        }
        return total;
    }
}

