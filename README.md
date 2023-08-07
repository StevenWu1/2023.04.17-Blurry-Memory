# 2023.04.17-Blurry-Memory
Dory is starting to remember things! To help her gauge her images of the past, she wants to calculate how fuzzy her picture is. She decides on the following strategy - a picture is fuzzy if many of the pixels in her image are close in color to all the pixels around it (the eight directions - up, down, left, right, up-right, up-left, down-left, and down-right).

Skeleton: https://drive.google.com/file/d/0BxxolsFkwnDqOUZJZHV0d094a3c/view?usp=sharing

##### Input Format
The first line will contain a number k, representing the distance a pixel's color can be from another pixel's color and still be considered close in color. The second line will contain a number n, representing the number of lines to follow. After the second line will be n lines, each containing n numbers separated by spaces. These n lines will represent the n x n pixels in the image.

##### Constraints
0 <= k <= 255 1 <= n <= 1000 Each pixel value is between 0 and 255 (inclusive)

##### Output Format
The number of pixels that are within k in color of all the pixels around it.

##### Sample Input 0
3
4
5 8 7 2
8 5 6 2 
6 7 8 6
5 4 3 8

##### Sample Output 0
6

##### Sample Input 1
0
5
1 1 2 3 5
1 1 1 1 1
2 2 2 2 2
2 2 3 4 5
2 2 5 4 3

##### Sample Output 1
3
