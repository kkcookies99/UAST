var XXX = function(root) {
  if(!root) return [];
  const q = [[root,0]];
  const res = [];
  while(q.length){
    const [n,l ]= q.shift();
    if(!res[l]) res[l] = [];
    res[l].push(n.val);
    if(n.left) q.push([n.left,l+1]);
    if(n.right) q.push([n.right,l+1]);

  }
  return res;
};

