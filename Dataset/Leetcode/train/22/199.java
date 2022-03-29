  public List<String> XXX(int n) {
        return getNext(n, n);
    }

    private List<String> getNext(int right, int left) {
        LinkedList<String> result = new LinkedList<>();
        if (right == 0 && left == 0) {
            return new ArrayList<String>() {{
                add("");
            }};
        }
        if (right > 0 && left < right) { //如果还有右括号而且左括号剩余小于右扩号
            List<String> nextList = getNext(right - 1 , left);
            result.addAll(nextList.stream().map(n -> ")" + n).collect(Collectors.toList()));
        }
        if (left > 0) {
            List<String> nextList = getNext(right, left - 1);
            result.addAll(nextList.stream().map(n -> "(" + n).collect(Collectors.toList()));
        }
        return result;
    }

