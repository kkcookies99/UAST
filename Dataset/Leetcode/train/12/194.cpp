 class Solution {
public:
    string XXX(int num) {
        int nums[4];
        int count=0;
        while(num!=0)
        {
            nums[count]=num%10;
            num/=10;
            count++;
        }
        string str="";
        switch(count)
        {
            case 4:for(int i=0;i<nums[3];i++)
                    str.append("M");
            case 3:if(nums[2]<4)
                    {
                        for(int i=0;i<nums[2];i++)
                            str.append("C");
                    }
                    else if(nums[2]==4)
                    {
                        str.append("CD");
                    }
                    else if(nums[2]==9)
                    {
                        str.append("CM");
                    }
                    else
                    {
                        str.append("D");
                        for(int i=5;i<nums[2];i++)
                            str.append("C");
                    }
            case 2:if(nums[1]<4)
                    {
                        for(int i=0;i<nums[1];i++)
                            str.append("X");
                    }
                    else if(nums[1]==4)
                    {
                        str.append("XL");
                    }
                    else if(nums[1]==9)
                    {
                        str.append("XC");
                    }
                    else
                    {
                        str.append("L");
                        for(int i=5;i<nums[1];i++)
                            str.append("X");
                    }
            case 1:if(nums[0]<4)
                    {
                        for(int i=0;i<nums[0];i++)
                            str.append("I");
                    }
                    else if(nums[0]==4)
                    {
                        str.append("IV");
                    }
                    else if(nums[0]==9)
                    {
                        str.append("IX");
                    }
                    else
                    {
                        str.append("V");
                        for(int i=5;i<nums[0];i++)
                            str.append("I");
                    }
            default :return str;
        }
    }
};

