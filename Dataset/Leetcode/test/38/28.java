class Solution {
    List<String> ans = new ArrayList<>();
    {
        ans.add("1");
    }
    public String XXX(int n) {
        int len = ans.size();
        if(n > len) {
            for(int i = len; i < n; i++) {
                String pre = ans.get(i - 1);
                ans.add(getNextString(pre));
            }
        }
        return ans.get(n - 1);
    }

    private String getNextString(String pre) {
        char[] arr = (pre + "0").toCharArray();
        char preChar = arr[0];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == preChar) count++;
            else {
                sb.append(count);
                sb.append(preChar);
                preChar = arr[i];
                count = 1;
            }
        }
        return sb.toString();
    }
}

