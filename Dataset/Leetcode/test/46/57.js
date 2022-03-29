var XXX = function(nums) {
    // 方法：深度优先遍历
    function dsp(nums, curArr) {
        // 叶子节点时，退出
        if(nums.length === 1) {
            curArr.push(nums[0]);
            res.push(curArr);
            return;
        }
        for(let i=0;i < nums.length;i++) {
          // 把传进来的数字序列，当前的排列数组复制一下，
          let tmpNums = [...nums];
          let tmpCurArr = [...curArr];
          // 数字序列，循环吐出一个数，对剩下的数做递归
          let cur = tmpNums.splice(i, 1);
          // 当前排列数组加一下吐出来的数，并传给递归下一次
          tmpCurArr.push(cur);
          dsp(tmpNums, tmpCurArr);
        }
    }
    let res = [];
    dsp(nums, []);
    return res;
};

