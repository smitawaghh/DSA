class Solution {
    long total=0;
     int mod=(int)(1e9+7);
    
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] nse = findnse(arr);
        int[] pse = findpse(arr);
        for (int i=0; i<=n-1; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (int)(total + ((long)left*right*arr[i])%mod)%mod;
            
        }
        return (int)total;
    }
     public int[] findnse(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
        
        while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
            st.pop();
        }
        if (st.isEmpty()) {
            nse[i] = n;
        } else{
            nse[i] = st.peek();
        }
        st.push(i);
        }
        return nse;
    }
    public int[] findpse(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<=n-1; i++){
        
        while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
            st.pop();
        }
        if (st.isEmpty()) {
            pse[i] = -1; // as 
        } else{
            pse[i] = st.peek();
        }
        st.push(i);
        }
        return pse;
    }
 
}