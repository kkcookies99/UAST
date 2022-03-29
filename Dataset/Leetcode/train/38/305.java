class Solution {
  public String XXX(int n) {
    Map<Integer, String> map = new HashMap<Integer, String>(n);
    map.put(1, "1");
    for (int i = 1; i < n; i++) {
      map.put(i + 1, read(map.get(i)));
    }
    return map.get(n);
  }

  private String read(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      int size = 1;
      while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        i++;
        size++;
      }
      sb.append(size).append(s.charAt(i));
    }
    return sb.toString();
  }
}

