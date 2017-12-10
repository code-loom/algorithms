package algorithms.unionFind;

public class Client {
    public static void main(String[] args) {
        try {
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

            int N = new Integer(reader.readLine());
            UnionFind uf = new UnionFind(N);

            while(reader.readLine() != null) {
                    int p = new Integer(reader.readLine());
                    int q = new Integer(reader.readLine());

                    if (!uf.connected(p, q)) {
                        uf.union(p, q);
                        System.out.println(p + " " + q);
                    }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}