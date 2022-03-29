 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        //先保存l1和l2的头结点
        ListNode *ll1=l1;
        ListNode *ll2=l2;
        //用来记录较短链表的尾结点
        ListNode *ltemp1;
        ListNode *ltemp2;
        int over=0;
        int sum=0; //over为进位，sum为当前位的和
        //使用l1作为最终结果链表
        do{
            sum=(l1->val+l2->val+over)%10;   //得到和,求当前位的和时，使用的是上一次的进位
            over=(l1->val+l2->val+over)/10;  //得到进位
            l1->val=sum;
            if(l1->next==nullptr || l2->next==nullptr){
                ltemp1=l1;
                ltemp2=l2;//记录较短链表尾节点下标对应的节点
            }
            l1=l1->next;
            l2=l2->next;
            cout<<"over:"<<over<<"sum:"<<sum<<endl;
        }while(l1!=nullptr && l2!=nullptr);

        if(ltemp1->next==nullptr && ltemp2->next==nullptr){
            cout<<"两个链表长度相等"<<endl;
            if(over==1)
                ltemp1->next=new ListNode(1);
                cout<<"两个链表长度相等且最后有进位"<<endl;
            return ll1;
        }
    
        //如果l1长，继续在l1上做运算，如果l2长，把l2后面的部分接到l1上继续做运算
        if(ltemp2->next!=nullptr)
            ltemp1->next=ltemp2->next;
        l1=ltemp1->next; //保证l1不为空
        cout<<"l1:"<<l1->val<<endl;
        //如果短链表最后一位有进位，做如下处理，没有进位直接结束
        if(over==1){
            cout<<"短链表尾结点有进位"<<endl;
            while(l1!=nullptr){
                sum=(l1->val+over)%10;
                over=(l1->val+over)/10;
                cout<<"长短不一致的处理："<<"over:"<<over<<"sum:"<<sum<<endl;
                l1->val=sum;
                if(l1->next==nullptr)
                    ltemp1=l1;
                l1=l1->next;
            }
            if(over==1){
                ltemp1->next=new ListNode(1);
                cout<<"链表不相等且最后有进位"<<endl;
            }
        }
        return ll1;
    }
};

