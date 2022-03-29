 public List<List<Integer>> XXX(int numRows) {
        int[][] arry = new int[numRows][numRows];
        List<List<Integer>> list = new ArrayList<List<Integer>>();
	List<Integer> list1 = null;
        for (int i = 0; i < numRows; i++) {
	    arry[i][0] = 1;
            list1 = new ArrayList<Integer>();
            list1.add(arry[i][0]);
            for (int j = 1; j <= i; j++) {
                arry[i][j] = arry[i-1][j-1] +arry[i-1][j];
                list1.add(arry[i][j]);
		    }
            list.add(list1);
	    }
        return list;
    }

