 class Solution {
    public int XXX(String s) {
        int index = s.length() - 1;
        while(s.charAt(index) == ' ') {
            index--;
        }
        int x = 0;
        while(index >= 0 && s.charAt(index) != ' ') {
            index--;
            x++;
        }
        return x;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


