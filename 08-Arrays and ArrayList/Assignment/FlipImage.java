/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 

Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.

*/

package Assignment;

public class FlipImage {
    
    public static void main(String[] args) {
        int[][] arr = { {1,1,0},
                        {1,0,1}
                        ,{0,0,0}};
        // System.out.println((0)|(1));
        flipAndInvertImage(arr);
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] flip = new int[image.length][];
        for (int row = 0; row < image.length; row++) {
            flip[row] = new int[image[row].length];
            for(int col=image[row].length-1,j=0;col>=0;col--,j++)
            {
                flip[row][j]=1^image[row][col];
            }
        }
        return flip;
    }
}

/*
 for (int[] row: image)
        {
            // reverse the array
            for (int i=0;i<(image[0].length+1)/2;i++){
                //swap
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }
        }
        return image;
*/