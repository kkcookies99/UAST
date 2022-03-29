 class Solution {
    public List<String> XXX(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, "", 0, 0, n);
        return ans;
    }
    
    void generate(List<String> ans, String base, int left, int right, int n) {
        // 核心在于满足条件的时候才添加，利用递归栈保存状态
       if (base.length() == n * 2) {
            ans.add(base);
            return;
        }
    
        if (left < n) {
            generate(ans, base + "(", left + 1, right, n);
        } 
        
        if (right < left) { 
            generate(ans, base + ")", left , right + 1, n);
        }
        
    }
}

