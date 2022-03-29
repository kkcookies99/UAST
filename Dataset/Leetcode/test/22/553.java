 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<String>();
        generate(new String(), res, n, n);
        return res;
    }
    public void generate(String s, List<String> res, int left, int right){
        if(left == 0 && right == 0){
            res.add(s);
        }
        if(left > right){
            return;
        }
        if(left > 0){
            generate(s + "(", res, left - 1, right);
        }
        if(right > 0){
            generate(s + ")", res, left, right - 1);
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


