 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) return s;
        List<StringBuffer> list = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) list.add(new StringBuffer());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            StringBuffer sb = list.get(i);
            sb.append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuffer res = new StringBuffer();
        for (StringBuffer t : list) res.append(t);
        return res.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


