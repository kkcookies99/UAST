 class Solution {
    public int XXX(String s) {

		if (Objects.isNull(s)) {
			return 0;
		}

		char[] chars = s.toCharArray();
		if (chars.length == 1) {
			return 1;
		}

		Queue<Character> queue = new LinkedList<>();
		int max = 0;

		for (Character character : chars) {

			while (queue.contains(character)) {
				queue.poll();
			}
			max = Math.max(max, queue.size());
			queue.offer(character);
			if (queue.contains(character)){
				max = Math.max(max, queue.size());
			}
		}

		return max;
    }
}

