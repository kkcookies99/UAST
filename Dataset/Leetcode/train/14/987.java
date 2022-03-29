 public String XXX(String[] strs) {
        List<String> list = Arrays.stream(strs).filter(s -> !s.isEmpty()).collect(Collectors.toList());
        int size = list.size();
        if (size != strs.length) {
            return "";
        }
        if (size < 1) {
            return "";
        }
        if (size == 1) {
            return strs[0];
        }

        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            str = str.substring(0, 1);
            map.merge(str, 1, Integer::sum);
        }
        Map.Entry<String, Integer> entry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        String key = entry.getKey();
        Integer num = entry.getValue();
        if (num != size) {
            return "";
        }
        map = new HashMap<>();
        int subIndex = 2;
        for (int i = 0; i < size; i++) {
            if (list.get(i).startsWith(key)) {
                if (list.get(i).length() >= subIndex) {
                    String substring = list.get(i).substring(0, subIndex);
                    map.merge(substring, 1, Integer::sum);
                }
                if (i == size - 1) {
                    if (map.isEmpty()) {
                        return key;
                    }
                    entry = map.entrySet().stream().min(Map.Entry.comparingByValue()).get();
                    if (!entry.getValue().equals(num)) {
                        return key;
                    }
                    key = entry.getKey();
                    i = -1;
                    subIndex++;
                    map = new HashMap<>();
                }
            }
        }
        return key;
    }

