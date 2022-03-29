 class Solution {
    public List<String> XXX(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, 0, combinations);
        return combinations;
    }

    public void generateAll(char[] current, int left, int right, List<String> result) {
        int n = current.length;
        if (left + right == n) {
            if (valid(current))
                result.add(new String(current));
        } 
        else {
            if (left < n / 2) {
                current[left + right] = '(';
                generateAll(current, left + 1, right, result);
                
            }  
            if (right < n / 2) {
                current[left + right] = ')';
                generateAll(current, left, right + 1, result);
            }
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return true;
    }
}

