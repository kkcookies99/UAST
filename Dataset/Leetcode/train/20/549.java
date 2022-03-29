 class Solution {
    public boolean XXX(String s) {
        char[] cs = s.toCharArray();
        int idx = -1;
        for(int i=0;i<cs.length;i++) {
            if (cs[i] == '[' || cs[i] == '(' || cs[i] == '{') {
                cs[++idx] = cs[i];
            } else {
                if (idx < 0 || !check(cs[idx], cs[i])) {
                    return false;
                }
                idx -= 1;
            }
        }
        return idx < 0;
    }

    private boolean check(char a, char b) {
        return (a == '(' && b == ')') 
            || (a == '[' && b == ']') 
            || (a == '{' && b == '}');
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


