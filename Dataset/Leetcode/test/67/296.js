  var XXX = function(a, b) {
 let res='',f=0
    /* 因为字符过长，只能按位操作字符 */
    for(let i=a.length-1,j=b.length-1;i>=0||j>=0;i--,j--){
        /* f用来保存进位，sum保存当前对齐的两个字符转为十进制数后的和，sum以进位为基数 */
        let sum=f  
        /* 将对齐的字符转为十进制后相加，较短的那个字符在字符头部补零 */
        sum=sum+(i>=0?parseInt(a[i]):0)
        sum=sum+(j>=0?parseInt(b[j]):0)
        /* sum 只有0、1、2、3三种取值，对2取余，即可得到去掉进位后，当前位的值*/
        res=(sum%2)+res
        /* sum取2、3时，进位为1 */
        f=Math.floor(sum/2)
    }
    /* 如果循环结束，且进位仍为1，在字符串头前补1 */
    if(f==1)
        res=f+res
    return res
};

