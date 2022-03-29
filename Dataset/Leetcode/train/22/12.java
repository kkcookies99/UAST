 class Solution {
    public List<String> XXX(int n) {
        List<String> result = new ArrayList<>();
        depth(new StringBuilder(), 0, 0, n, result);
        return result;
    }

    private static void depth(StringBuilder parenthese, int numOfLeft, int numOfRight, int total, List<String> result) {
        if (numOfLeft == total) {
            int currentLen = parenthese.length();
            for (int i = 0; i < numOfLeft - numOfRight; i++) {
                parenthese.append(')');
            }
            result.add(parenthese.toString());
            parenthese.delete(currentLen, parenthese.length());
            return;
        }
        if (numOfLeft > numOfRight) {
            parenthese.append(')');
            depth(parenthese, numOfLeft, numOfRight + 1, total, result);
            parenthese.deleteCharAt(parenthese.length() - 1);
        }
        parenthese.append('(');
        depth(parenthese, numOfLeft + 1, numOfRight, total, result);
        parenthese.deleteCharAt(parenthese.length() - 1);
    }
}

