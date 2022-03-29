 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if ( i  == 0) {
                List<Integer> sList = new ArrayList<>();
                sList.add(1);
                list.add(sList);
            } else if (i - 1 >= 0) {
                List<Integer> sList = new ArrayList<>();
                List<Integer> fList = list.get(i - 1);
                int len = fList.size();
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        sList.add(1);
                    } else if (j == i) {
                        sList.add(1);
                    } else {
                        sList.add(fList.get(j-1) + fList.get(j));
                    }

                }
                list.add(sList);
            }
        }
        return list;
    }
}

