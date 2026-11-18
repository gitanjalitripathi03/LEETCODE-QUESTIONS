class Solution {
    public int calPoints(String[] operations) {
        return points(operations);
    }

    public static int points(String[] op){
        Stack<Integer> st = new Stack<>();
        for(String x : op){
            if(x.equals("C")) st.pop();
            else if(x.equals("D")){
                int p = st.peek();
                st.push(2*p);
            }else if(x.equals("+")){
                int a1 = st.pop();
                int a2 = st.peek();
                st.push(a1);
                st.push(a1 + a2);
            }else{
                st.push(Integer.parseInt(x));
            }
        }

        int sum = 0;
        for(int x : st){
            sum += x;
        }
        return sum;
    }
}