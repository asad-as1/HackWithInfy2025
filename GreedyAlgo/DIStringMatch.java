public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length(), k = 0;
        int ans[] = new int[n+1];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'I') ans[i] = k++;
            else ans[i] = n--;
        }
        ans[s.length()] = n;
        return ans;
    }
    public static void main(String[] args) {
        DIStringMatch obj = new DIStringMatch();
        String s = "IDID";
        int[] result = obj.diStringMatch(s);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
