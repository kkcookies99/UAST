var XXX = function(root) {

  let queue = [];
  let res = [];
  let level = [];
  if(!root) return res;
  queue.push(root);
  //当前行的最右结点
   let last = root;
  //下一行的最右结点
  let nlast = last;
  while(queue.length) {
    let node = queue.shift();
    level.push(node.val);
    //nlast总指向新入队的结点。即是下一个行最右结点。
    if(node.left) {
      queue.push(node.left);
      nlast = node.left;
    }
    if(node.right) {
      queue.push(node.right);
      nlast = node.right;
    }
   
     if(last === node) {
      res.push(level.splice(0,level.length));  
      last = nlast;
    }
  }
  return res;
};

