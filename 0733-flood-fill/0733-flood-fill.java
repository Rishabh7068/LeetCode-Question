class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodfill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    public static void floodfill(int image[][] , int sr , int sc , int color , int oriColor){
        int m = image.length;
        int n = image[0].length;
        
        if(sr >= m || sc >= n || sr < 0 || sc < 0){
            return;
        }
        if(image[sr][sc] != oriColor || image[sr][sc] == color){
            return;
        }
        image[sr][sc] = color;
        floodfill(image, sr+1, sc, color, oriColor);
        floodfill(image, sr-1, sc, color, oriColor);
        floodfill(image, sr, sc+1, color, oriColor);
        floodfill(image, sr, sc-1, color, oriColor);
        return;
    }
}