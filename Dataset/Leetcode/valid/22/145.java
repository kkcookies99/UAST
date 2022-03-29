 public List<String> XXX(int n) {
        if (n == 0) return new ArrayList<>();
        if (n == 1) return new ArrayList<>(Arrays.asList("()"));
        Set<String> set = new HashSet<>();
        set.add("()");
        for (int i = 2; i <= n; i++) {
            Set<String> temp = new HashSet<>();
            for (String s : set) {
                for (int j = 0; j <= s.length(); j+=2) {
                    if (j == s.length()) temp.add(s + "()");
                    else {
                        StringBuilder sb =
                                new StringBuilder(s.substring(0, j) + "(" + s.charAt(j) + ")");
                        if (j + 1 < s.length()) {
                            sb.append(s, j + 1, s.length());
                        }
                        temp.add(sb.toString());
                    }
                }
            }
            set.clear();
            set.addAll(temp);
            temp.clear();
        }
        return new ArrayList<>(set);
    }

