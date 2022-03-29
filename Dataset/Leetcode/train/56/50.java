  public int[][] XXX(int[][] intervals) {

    List<int[]> collect = Arrays.stream(intervals).sorted(new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    }).collect(Collectors.toList());
    List<int[]> res = new ArrayList<>();
    for (int i = 0; i < collect.size(); i++) {
      int start = collect.get(i)[0];
      int end = collect.get(i)[1];
      while ((i + 1 < collect.size()) && end >= collect.get(i+1)[0]) {
        i++;
        end = Math.max(end, collect.get(i)[1]);
      }
      res.add(new int[]{start, end});
    }
    return res.toArray(new int[res.size()][]);
  }```

