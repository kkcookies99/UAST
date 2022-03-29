class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int size_1 = 0, size_2 = 0;
        ListNode* temp = l1;
        //统计l1长度
        while(temp){
            size_1++;
            temp = temp->next;
        }
        //统计l2长度
        temp = l2;
        while(temp){
            size_2++;
            temp = temp->next;
        }
        //大于10的部分由remainder保留
        int remainder = 0;
        //longer指向最长的数组，shorter指向最短的；
        ListNode* longer = (size_1 >= size_2) ? l1 : l2;
        ListNode* shorter = (size_1 < size_2) ? l1 : l2;
        //res指向最长的
        ListNode* res = longer;
        //进行循环赋值
        while(longer||shorter){
            //长链先加上余数
            longer->val += remainder;
            //再加上短链
            if(shorter){
                longer->val += shorter->val;
            }
            //保留大于10的部分
            if(longer->val > 9){
                longer->val -= 10;
                remainder = 1;
            }else{
                remainder = 0;
            }
            //如果longer遍历到最后一位且大于10，末尾加上一个1的节点
            if(longer->next == nullptr && remainder){
                ListNode* ll = new ListNode(1);
                longer->next = ll;
                return res;
            }
            //继续走
            longer = longer->next;
            if(shorter){
                shorter = shorter->next;
            }
        }
        return res;
    }
};

