 class Solution {
    public int XXX(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            char r = s.charAt(j);
            map.put(r, map.getOrDefault(r, 0) + 1);
            while (map.get(r) > 1) {
                char l = s.charAt(i);
                map.put(l, map.get(l) - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

