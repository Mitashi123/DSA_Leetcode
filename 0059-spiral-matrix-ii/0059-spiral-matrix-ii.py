class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        matrix = [[0 for i in range(n)] for j in range(n)]
        top ,bottom ,left ,right = 0,n-1,0,n-1
        num = 1
        while left <= right and top <= bottom:

            # Here we fill the 1st row

            for i in range(top,right+1):
                matrix[top][i] = num
                num += 1
            top += 1

            # Here we fill the mid last value by incrementing top

            for i in range(top,bottom+1):
                matrix[i][right] = num
                num += 1
            right -= 1

            # Here we are adding elements in reverse order for last row

            for i in range(right,left-1,-1):
                matrix[bottom][i] = num
                num += 1
            bottom -= 1

            # Here we are again going to the top in reverse order

            for i in range(bottom,top-1,-1):
                matrix[i][left] = num
                num += 1
            left += 1

        return matrix