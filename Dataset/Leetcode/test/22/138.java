 public List<String> XXX(int n) {
	List<String> result = new ArrayList<>();
	if (n == 0)
		return result;
	char[] cache = new char[2 * n];
	cache[0] = '(';
	build(result, 1, 1, cache);
	return result;
}

private static void build(List<String> result, int idx, int flag, char[] cache) {
	if (idx == cache.length - 1) {
		cache[idx] = ')';
		result.add(new String(cache));
	} else {
		if (flag > 0) {
			cache[idx] = ')';
			build(result, idx + 1, flag - 1, cache);
		}
		if (cache.length - idx > flag) {
			cache[idx] = '(';
			build(result, idx + 1, flag + 1, cache);
		}
	}
}

