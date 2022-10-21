### Reverse Spiral Form of Matrix
#### [Problem link](https://practice.geeksforgeeks.org/problems/reverse-spiral-form-of-matrix4033/1)
<hr>  

### Given a matrix as 2D array. Find the reverse spiral traversal of the matrix. 

#### Example 1:  

Input: R = 3, C = 3  
  a = {{9, 8, 7},  
       {6, 5, 4},  
       {3, 2, 1}}  
Output: 5 6 3 2 1 4 7 8 9  
Explanation: Spiral form of the matrix in reverse order starts from the centre and goes outward.  
    ![image](https://user-images.githubusercontent.com/91481732/197210916-a0272221-e441-490c-93ee-6a87a1452971.png)

#### Example 2:  
  
Input: R = 4, C = 4   
  a = {{1, 2, 3, 4},  
       {5, 6, 7, 8},  
       {9, 10, 11, 12},   
       {13, 14, 15, 16}}  
Output: 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1  
Explanation:
  ![image](https://user-images.githubusercontent.com/91481732/197210945-46e799f7-f41a-44db-9c87-ffe219084d9d.png)


#### Your Task:   
You dont need to read input or print anything. Complete the function reverseSpiral() which takes R, C and a as input parameters and returns the matrix in reverse spiral form.
  
#### Expected Time Complexity: O(R*C)  
#### Expected Auxiliary Space: O(R*C)  

#### Constraints:  
1 <= R,C <=100  
1 <= a[R][C] <=100  
