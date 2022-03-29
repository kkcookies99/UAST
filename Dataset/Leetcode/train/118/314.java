 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> cell = new ArrayList<>();

        int curnum = 0;

        cell.add(1);
        ret.add(cell);

        for (int i = 1; i < numRows; i++) {
            cell = XXX(i,cell);
            ret.add(cell);
        }

        return ret;
    }

    public List<Integer> XXX(int num, List<Integer> curlist) {
        List<Integer> next = new ArrayList<>();
        //System.out.println("curlist:" + curlist.size());
        for (int i = 0; i <= num; i++) {
            int sum = 0;
            if (i == 0){
                sum = curlist.get(0);
            } else if (i == num){
                sum = curlist.get(i - 1);
            } else {
                sum = curlist.get(i - 1) + curlist.get(i);
            }
            //System.out.println("sum:" + sum);
            next.add(sum);
        }
        return next;
    }
}

