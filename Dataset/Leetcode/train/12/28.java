 class Solution {
    int[] help=new int[]{1000, 900, 500, 400, 100,90, 50, 40, 10, 9, 5, 4, 1};
    // String[] rome=new String[]{{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}};
    char[] rome=new char[]{'M', 'C', 'D', 'C', 'C', 'X', 'L', 'X', 'X', 'I', 'V', 'I', 'I'};
    public String XXX(int num) {
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<help.length;i++)
        {
            for(;num>=help[i];)
            {
                buffer.append(rome[i]);
                num-=help[i];
                if(i%2==1)
                {
                    buffer.append(rome[i-1]);
                }
            }
        }
        return new String(buffer);
    }
}


