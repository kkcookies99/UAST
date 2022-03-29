class Solution {
public:
int res = 0;

void recursion(int n)
{
    //终止条件
    if (n == 0)
    {
        res++;
        return;
    }

    //本层处理
    recursion(n - 1);
    if (n > 1)
        recursion(n - 2);

    //继续乡下一层进行
}

int XXX(int n)
{
    //n阶台阶
    recursion(n);
    return res;
}

};

