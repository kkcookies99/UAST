 class Solution {
    public List<String> XXX(int n) {
        if (n == 1) {
            return new ArrayList<String>(Arrays.asList("()"));
        }

        List<String> result = XXX(n - 1);
        Set<String> newResult = new HashSet<>();
        for (int i = 0; i < result.size(); i ++) {
            String parenthesis = result.get(i);
            for (int position = 0; position <= parenthesis.length(); position ++) {
                String pre = parenthesis.substring(0, position);
                String post = parenthesis.substring(position, parenthesis.length());
                newResult.add(pre + "()" + post);
            }
        }

        return new ArrayList<>(newResult);
    }
}```

