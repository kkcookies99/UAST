 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> llist = new ArrayList<List<Integer>>();
		if (numRows == 0) 
			return llist;
		llist.add(Arrays.asList(1));
		for (int i = 1; i < numRows; i++) {
			List<Integer> list = new ArrayList<>();
			List<Integer> list2 = llist.get(i - 1);
			list.add(1);
			for (int j = 1; j < i; j++) 
				list.add(list2.get(j - 1) + list2.get(j));
			list.add(1);
			llist.add(list);
		}
		return llist;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


