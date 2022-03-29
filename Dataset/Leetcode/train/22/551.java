 class Solution {
    public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();
        func(n, n, "", list);
        return list;
    }

    public static void func(int n, int m, String s, List<String> list){
        if (n == 0 && m == 0){
            list.add(s);
        }
        if (n > 0){
            func(n - 1, m, s+"(", list);
        }
        if (m > n){
            func(n, m - 1, s+")", list);
        }
    }
}

