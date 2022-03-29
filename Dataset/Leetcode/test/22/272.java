 class Solution {
	List<String> res = new ArrayList<String>();
	StringBuilder path = new StringBuilder();
	int left = 0;
	int right = 0;

	public List<String> XXX(int n) {
		backtracking(n);
		return res;
	}

	public void backtracking(int n) {
		if (left > n)
			return;
		if (right > n)
			return;

		if (path.length() >= n * 2) {
			res.add(path.toString());
			return;
		}

		path.append('(');
		left++;
		backtracking(n);
		path.deleteCharAt(path.length() - 1);
		left--;

		if (left > right) {
			path.append(')');
			right++;
			backtracking(n);
			path.deleteCharAt(path.length() - 1);
			right--;
		}

	}

}

