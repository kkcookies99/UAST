 public List<String> XXX(int n) {
        List<List<String>> dp = new ArrayList<>();
        dp.add(0,new ArrayList<>());
        dp.add(1,new ArrayList<String>(){{add("()");}});
        for (int i = 2; i <= n; i++) {
            Set<String> strings = new HashSet<>();
            for (int j = 0; j < i; j++) {
                if (j == 0){
                    for (int k = 0; k < dp.get(i-1).size(); k++) {
                        strings.add("(" + dp.get(i-1).get(k) + ")");
                    }
                }else{
                    List<String> left = dp.get(j);
                    List<String> right = dp.get(i-j);
                    for (int k = 0; k < left.size(); k++) {
                        for (int l = 0; l < right.size(); l++) {
                            strings.add(left.get(k) + right.get(l));
                        }
                    }
                }
            }
            dp.add(i, new ArrayList<>(strings));
        }
        return dp.get(n);
    }

