 ListNode* XXX(ListNode* l1, ListNode* l2) {
        if(nullptr==l1){
            return l2;
        }
        if(nullptr==l2){
            return l1;
        }
            ListNode* head=nullptr;//用来保存加起来的第一个结点
            ListNode* tmp=head;//用tmp来更新下一个结点
            int step=0;//表示进位
            while(l1!=nullptr||l2!=nullptr){
                int sum=0;//每次加完都要更新sum
                 sum+=step;//先加进位
               if(l1!=nullptr){
                    sum+=l1->val;
                    l1=l1->next;
                }
                if(l2!=nullptr){
                    sum+=l2->val;
                    l2=l2->next;
                }
                if(sum>9){//大于9表示有进位
                    sum-=10;
                    step=1;
                }
                else{
                    step=0;//更新step
                }
             ListNode* cur=new ListNode(sum);
                if(head==nullptr){
                   head=cur; //将第一个结点保存起来
                    tmp=head;
                }
                else{
                    tmp->next=cur;
                    tmp=cur;
                } 
            }
            if(step>0){//如果最后两个相加有进位
               ListNode* cur=new ListNode(1);
                tmp->next=cur;
            }
            return head;
        }

