 var XXX = function(root) {
  if(!root)return true;
  let queue = [root];
  while(queue.length){
    let levelLen = queue.length;
    //判断一层是否对称
    for(let i=0;i<levelLen/2;i++){
      let node1 = queue[i];
      let node2 = queue[levelLen-1-i];
      if(node1 === null && node2 ===null)continue;
      if(node1 === null || node2 ===null)return false;
      if(node1.val !== node2.val) return false;
    }

    let newLevel = [];
    for(let i=0;i<levelLen;i++){
      let node = queue.pop();
      if(node){
        newLevel.unshift(node.left);
        newLevel.unshift(node.right);
      } 
    }
    queue = newLevel;
  }
  return true;
};

