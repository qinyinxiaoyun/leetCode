public class P200Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0)return 0;
        int count = 0;
        boolean[][] mark = new boolean[grid.length][grid[0].length];
        for (int i = 0;i< grid.length;i++){
            for (int j = 0;j < grid[0].length;j++){
                if (grid[i][j] == '1' && !mark[i][j]){
                    find(i,j,grid,mark);
                    count += 1;
                }
            }
        }
        return count;
    }

    private void find(int i,int j,char[][] grid,boolean[][] mark){
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        if ( i>=0 && i<grid.length && j>=0 && j < grid[0].length&&!mark[i][j]&&grid[i][j] == '1'){
            mark[i][j] = true;
            for (int k=0;k<4;k++){
                find(i+dx[k],j+dy[k],grid,mark);
            }
        }
    }
}
