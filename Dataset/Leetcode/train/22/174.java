 public List<String> XXX(int n) {
	 List<String> list = new ArrayList<>();
	/**
	 * left > right 
	 */
	getAnsString(0,0,n,"",list);
	return list;
}

public static void getAnsString(int left, int right, int n,String str, List<String> list){
	if(left>n||right>n)
		return;
	//所有括号填完
	if(left==n&&right==n) {
		list.add(str);
	}
	//只有左边括号数量大于右边才能递归
	if(left>=right) {
		getAnsString(left+1,right,n,str+"(",list);
		getAnsString(left,right+1,n,str+")",list);
	}
}

