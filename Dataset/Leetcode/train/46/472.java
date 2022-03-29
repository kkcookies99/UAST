 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < nums.length; j++) {
                    list.add(nums[j]);
                }
                listList.add(list);
            } else {
                count *= i;
                for (int j = 0; j < i; j++) {
                    for (int k = 0; k < count; k++) {
                        List<Integer> list = new ArrayList<>();
                        for (int l = 0; l < listList.get(k).size(); l++) {
                            list.add(listList.get(k).get(l));
                        }
                        int t = list.get(j);
                        list.set(j,list.get(i));
                        list.set(i,t);
                        listList.add(list);
                    }
                }
            }
        }
        return listList;
    }

