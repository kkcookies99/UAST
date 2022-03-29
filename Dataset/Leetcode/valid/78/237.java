class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        ll.add(new ArrayList<Integer>());  // 空集
		for (int i = 0; i < nums.length; i++) {
			int size = ll.size();
			for (int j = 0; j < size; j++) { // 取出已经添加的子集
				List<Integer> l1 = new ArrayList<Integer>();
				l1.addAll(ll.get(j));
				l1.add(nums[i]);  // 每一个子集加上当前元素
				ll.add(l1);
			}
		}
		
        return ll;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


