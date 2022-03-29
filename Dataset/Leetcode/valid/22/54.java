 class Solution {
    public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();
        gen(0, 0, n, "", list);
        return list;
    }

    void gen(int left, int right, int n, String result, List<String> list){
        if(left == n && right == n){
            list.add(result);
            return;
        }

        if(left < n){
            gen(left + 1, right, n, result + "(", list);
        }
        if(left > right && right < n){
            gen(left, right + 1, n, result + ")", list);
        }

        return;
    }
}

