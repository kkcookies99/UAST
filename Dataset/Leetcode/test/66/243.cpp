 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        bool add=0;//进位数据
        int i=digits.size()-1;//遍历数组的下标
        if(digits[i]==9){//如果遍历到9，就变成0且进位数据为1
            digits[i--]=0;
            add=1;
        }else digits[i]++;//如果不是就末尾加一
        while(i>-1&&add){//如果进位为1且数组下标没有越界，下标往前遍历
            if(digits[i]==9){//如果是9，继续往前遍历
                digits[i--]=0;
                add=1;
            }else{//如果不是9，加一且退出循环
                add=0;
                digits[i]++;
            }
        }
        if(add){//如果下标越界且进位信息为1，将头位信息改为1，在添一位0
            digits[0]=1;
            digits.push_back(0);
        }
        return digits;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


