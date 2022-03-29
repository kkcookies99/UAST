 public List<List<Integer>> XXX(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (numRows == 1){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            result.add(list);
            return result;
        }else if (numRows == 2){
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            result.add(list1);
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1);
            result.add(list2);
            return result;
        }else {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            result.add(list1);
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1);
            result.add(list2);
            //从3开始遍历
            int start = 3;
            while (start <= numRows){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                int times = start - 2;
                int i = 0;
                while (times >0){
                    list.add(result.get(start-2).get(i)+result.get(start-2).get(i+1));
                    times--;
                    i++;
                }
                list.add(1);
                result.add(list);
                start++;
            }
        }
        return result;
    }

