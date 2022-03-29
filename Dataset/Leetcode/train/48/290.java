class Solution {
    public void XXX(int[][] matrix) {
		int n=matrix.length;
		int left=0,right=n-1,up=0,down=n-1;
		while(left<=right){
			int l=left,u=up,r=right,d=down;
			while(l<right){
				int tmp=matrix[up][l];
				matrix[up][l]=matrix[d][left];
				matrix[d][left]=matrix[down][r];
				matrix[down][r]=matrix[u][right];
				matrix[u][right]=tmp;
				l++;u++;r--;d--;
			}
			left++;up++;right--;down--;		
		}
    }
}

