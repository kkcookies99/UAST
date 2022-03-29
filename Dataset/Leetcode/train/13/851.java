 class Solution {
    public int XXX(String s) {     
        int nums[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String strings[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int result=0;
        for(int i=0,j=0;i<s.length();i++)//i为字符串的位置
        {
            for(;j<strings.length;j++)//j为罗马数值，后面的数字权值肯定只能在更小的权值
            {
                if(j%2==0)//单个字母
                {
                    if(s.substring(i,i+1).equals(strings[j]))
                    {
                        result+=nums[j];
                        break;
                    }
                }
                else
                {
                    if(i+1<s.length()&&s.substring(i,i+2).equals(strings[j]))
                    {
                        result+=nums[j];
                        i++;
                        break;
                    }
                }
            }
        }
        return result;

    }
}

