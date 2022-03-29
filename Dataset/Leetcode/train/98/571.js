 var XXX = function(root) {
    let pre 
    return !d( root )
    function d ( node ) {
        if ( node ) {
            if (d(node.left) || pre >= node.val || ((pre = node.val ) || 1) && d (node.right))return 1
        }
    }
} 

