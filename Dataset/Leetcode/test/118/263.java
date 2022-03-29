  public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i= 1; i <= numRows; i++){
            if (i == 1){
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(1);
                result.add(integers);
            }

            if (i == 2){
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(1);
                integers.add(1);
                result.add(integers);
            }

            if (i > 2){
                result.add(reAdd(result.get(i-2)));
            }
        }
        return result;
    }


    private List<Integer> reAdd(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        result.add(list.get(0));
        for(int i = 0 ; i < list.size()-1; i++){
            result.add(list.get(i) + list.get(i+1));
        }
        result.add(list.get(list.size()-1));
        return result;
    }

