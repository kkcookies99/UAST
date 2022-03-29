 public String XXX(String[] strs) {
        if (strs.length <= 0) return "";
            String[] strings = new String[strs.length];
            List<Integer> list = new ArrayList<>();
            boolean a = true;
            for (int i = 0; i < strs.length; i++) {
                list.add(strs[i].length());
            }
            String str = null;
            Integer min = Collections.min(list);
            for (int integer = 0; integer < min; integer++) {
                for (int i = 0; i < strs.length ; i++) {
                    strings[i] = strs[i].substring(0,integer +1);
                }
                for (int i = 0; i < strings.length - 1; i++) {
                    a = (a && strings[i].equals(strings[i + 1]));
                }
                str = a ? strings[0] : str;
            }
            return str==null? "" : str;
    }

