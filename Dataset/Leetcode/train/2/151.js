var XXX = function(l1, l2) {
    l1=l1.reverse();
    l2=l2.reverse();
    let l1_s=l1.join('');
    let l2_s=l2.join('');
    let num=Number(l1_s)+Number(l2_s);
    let ListNode=String(num).split('').reverse();
    return ListNode;
};

