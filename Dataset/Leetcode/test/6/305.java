 class Solution {
    public String XXX(String s, int numRows) {
        String[] strings = new String[numRows];
        int index = 0;
        boolean flag=false;
        for (int i = 0; i < s.length(); i++) {
            if (strings[index] == null) {
                strings[index] = s.charAt(i) + "";
            } else {
                strings[index] += s.charAt(i);
            }
            if(index==numRows-1){
                flag=true;
            }
            if(index==0){
                flag=false;
            }
            if(index==numRows-1&&index==0){
                return s;
            }
            if (flag) {
                index--;
            }else {
                index++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            if(string!=null) {
                stringBuilder.append(string);
            }
        }
        return stringBuilder.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

