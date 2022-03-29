public int XXX(String s) {
        int number = 0;
        Map<String, Integer> map = initMap();

        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if ("".equals(tmp)) {
                //如果是可能与后面结合的字符的话 加入到tmp中
                if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
                    tmp = String.valueOf(s.charAt(i));
                } else {
                    //应该把这个字符加入进来
                    number += map.get(String.valueOf(s.charAt(i)));
                }
            } else {
                //判断当前字符是否可以与之结合
                final Integer integer = map.get(tmp + s.charAt(i));
                if (integer == null) {
                    //结合不了
                    number += map.get(tmp);
                    if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
                        tmp = String.valueOf(s.charAt(i));
                    } else {
                        number += map.get(String.valueOf(s.charAt(i)));
                        tmp = "";
                    }
                } else {
                    //可以结合
                    number += integer;
                    tmp = "";
                }
            }
        }
        if (!"".equals(tmp)) {
            number += map.get(tmp);
        }
        return number;
    }

    private Map<String, Integer> initMap() {
        Map<String, Integer> map = new HashMap<>(13);
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);

        map.put("XL", 40);
        map.put("XC", 90);

        map.put("CD", 400);
        map.put("CM", 900);
        return map;
    }

