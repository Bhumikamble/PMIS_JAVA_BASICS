class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalcolor = image[sr][sc];

        if (originalcolor == color) {
            return image; //original color is = 1 and color is 2
        }

        dfs(image, sr, sc, originalcolor, color);
        return image;
    }

    void dfs(int[][] image, int r, int c, int originalcolor, int color) { 

        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length) { //boundary conditions
            return;
        }

        if (image[r][c] != originalcolor) { //for 0 condition
            return;
        }

        image[r][c] = color;

        dfs(image, r - 1, c, originalcolor, color);//up
        dfs(image, r + 1, c, originalcolor, color);//down
        dfs(image, r, c - 1, originalcolor, color);//left
        dfs(image, r, c + 1, originalcolor, color);//right
    }
}