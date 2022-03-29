 class Solution {
    public int XXX(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++) {
            int j = i + 1;
            if (i != j && j < chs.length) {
                int temp1 = map.get(chs[i]);
                int temp2 = map.get(chs[j]);
                if (temp1 < temp2) {
                    result += (temp2 - temp1);
                    i++;
                } else {
                    result += temp1;
                }
            } else {
                result += map.get(chs[i]);
            }
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


