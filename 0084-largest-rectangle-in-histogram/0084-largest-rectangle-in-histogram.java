class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nse, pse;
        int maxarea=0;
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<n; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                int element = st.peek();
                st.pop();
                
                nse = i;
                if (st.isEmpty()) {
                   pse=-1;
                }
                else {
                   pse = st.peek();
                }
                maxarea = Math.max(maxarea, (nse-pse-1)*heights[element]);
            }
            st.push(i);
        }
            while (!st.isEmpty()) {
                nse = n;
                int element = st.peek();
                st.pop();
                if (st.isEmpty()) {
                    pse = -1;

                }
                else {
                    pse = st.peek();

                }
                maxarea = Math.max(maxarea, heights[element]*(nse-pse-1));
            }
        
        return maxarea;
    }
}