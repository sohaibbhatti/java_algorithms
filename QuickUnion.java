public class QuickUnion {
  public int[] elements;

  public QuickUnion(int size) {
    elements = new int[size];
    for (int i = 0; i < size; i++) {
      elements[i] = i;
    }
  }

  // Assign Root of p, the value of the root of q
  public void union(int p, int q) {
    elements[root(p)] = elements[root(q)];
  }

  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  public int root(int p) {
    int parent = elements[p];

    while (parent != elements[parent]) {
      parent = elements[parent];
    }

    return parent;
  }

  public static void main(String[] args) {
    int n = StdIn.readInt();
    QuickUnion uf = new QuickUnion(n);

    while (!StdIn.isEmpty()) {
      int p = StdIn.readInt();
      int q = StdIn.readInt();

      if (!uf.connected(p, q)) {
        uf.union(p,q);
        StdOut.println(p + " " + q);
      }
    }

    for(int i = 0; i < uf.elements.length; i++) {
      System.out.println(uf.elements[i]);
    }
  }

}
