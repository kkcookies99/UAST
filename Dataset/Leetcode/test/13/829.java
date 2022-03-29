 public int XXX(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>(13);
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);

        Integer integer;
        int number = 0;
        while (s.length() >= 2) {
            String substring = s.substring(0, 2);
            if (hashMap.containsKey(substring)) {
                integer = hashMap.get(substring);
                number += integer;
                s = s.substring(2);
            } else {
                integer = hashMap.get(substring.substring(0, 1));
                number += integer;
                s = s.substring(1);
            }
        }

        if (hashMap.containsKey(s)) {
            integer = hashMap.get(s);
            number += integer;
        }

        return number;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


