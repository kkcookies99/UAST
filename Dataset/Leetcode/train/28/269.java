     public int XXX(String haystack, String needle) {
        if (Objects.equals(needle, "")){
            return 0;
        }
        else if (needle.length() > haystack.length()){
            return -1;
        }
        int second = 0;
        char first = needle.charAt(second);
        char[] chars = haystack.toCharArray();
        ArrayList<Integer> idxs = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == first) {
                idxs.add(i);
            }
        }
        for (int i = 0; i < idxs.size(); i++) {
            int idx = idxs.get(i);
            int count = 0;
            if (idx + needle.length() > haystack.length()){
                return -1;
            }
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(idx) == needle.charAt(j)) {
                    idx ++;
                    count ++;
                }
            }
            if (count == needle.length()){
                return idxs.get(i);
            }
        }
        return -1;
    }

