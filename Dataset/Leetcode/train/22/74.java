 class Solution {
    List<String> ansList = new ArrayList<>();

    public List<String> XXX(int n) {
        // 左括号个数x，右括号个数y，x, y <= n
        // '('先于')'出现，因此每个位置处一定要满足 x>=y
        solute(0, 0, new StringBuffer(), n);

        return ansList;
    }

    public void solute(int x, int y, StringBuffer buffer,int n) {
        if(x==n && y==n) {
            ansList.add(buffer.toString());
            return;
        }
        
        if(x==y) {
            buffer.append('(');
            solute(x+1, y, buffer, n);
            buffer.deleteCharAt(buffer.length()-1);
        }
        else if(x>y) {
            if(x<n) {
                buffer.append('(');
                solute(x+1, y, buffer, n);
                buffer.deleteCharAt(buffer.length()-1);
            }

            buffer.append(')');
            solute(x, y+1, buffer, n);
            buffer.deleteCharAt(buffer.length()-1);
        }
    }
}