// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    class Node{
    	int first;
    	int sec; 
    
    	public Node(int a, int b){
    		first = a;
    		sec = b;
    	}
    }
    public  boolean cycleBFS(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(node, -1));
		vis[node] = true;

		while(!q.isEmpty()){
			int n = q.peek().first;
			int prev = q.peek().sec;
			q.remove();

			for(Integer it: adj.get(n)){
				if(!vis[it]){
					q.add(new Node(it, n));
					vis[it] = true;
				} else if (prev != it)
					return true;
			}
		}
		return false;
	}
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V+1];

		for(int i = 0; i < V; i++)
			if(!vis[i])
				if(cycleBFS(i, adj, vis))
					return true;
		return false;
    }
}