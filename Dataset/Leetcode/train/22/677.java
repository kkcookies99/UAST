 public List<String> XXX(int n) {
        int left = n;
        int right = n;
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        helper(3, 3, res, sb);
        return res;
    }
    private void helper(int left, int right, List<String> res, StringBuilder sb) {
        if (left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            res.add(sb.toString());
            
        }
        if (left > 0) {
            sb.append("(");
            helper(left - 1, right, res,sb);
        }
        if (right > 0) {
            sb.append(")");
            helper(left, right - 1, res,sb);
        }
        sb.deleteCharAt(sb.length() - 1);
        return;

    }

