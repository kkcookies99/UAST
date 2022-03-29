 class Solution {
    public List<List<Integer>> XXX(int numRows) {
List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2;
        for (int i = 0; i < numRows; i++) {
            if (list.size() == 0) {
                temp.add(1);
                list.add(temp);
                temp = new ArrayList<>();
            }else {
                temp2 = list.get(i-1);
                temp.add(1);
                for (int j = 1; j < temp2.size(); j++) {
                    temp.add(temp2.get(j) + temp2.get(j - 1));
                }
                temp.add(1);
                list.add(temp);
                temp=new ArrayList<>();
            }

        }

        return list;
    }
}

