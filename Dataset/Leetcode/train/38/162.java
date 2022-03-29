public String XXX(int n) {
    String a = "";
    if (n == 1) {
        a = a + 1;
    } else {
        String s = XXX(n - 1);
        String asa = asa(s);
        a = asa;
    }
    return a;
}

public String asa(String a) {
    a += 'a';
    int n = a.length();
    List<Integer> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    int j = 0;
    int k = 0;
    for (int i = 0; i < n; i++) {
        if (a.charAt(j) == a.charAt(i)) {
            k++;
        } else {
            list1.add(k);
            list2.add(String.valueOf(a.charAt(j)));
            j = i;
            k = 1;
        }
    }
    String s = "";
    for (int i = 0; i < list1.size(); i++) {
        s += list1.get(i) + "" + list2.get(i);
    }
    return s;
}

