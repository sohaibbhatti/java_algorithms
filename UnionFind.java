public class UnionFind {
  public int[] elements;

  public UnionFind(int size) {
    elements = new int[size];
    for (int i = 0; i < size; i++) {
      elements[i] = i;
    }
  }

  // Connects two objects
  public void union(int p, int q) {
    int pid = elements[p];
    int qid = elements[q];

    for (int i = 0; i < elements.length; i++) {
      if  (elements[i] == pid) {
        elements[i] = qid;
      }
    }
  }

  // Determines if 2 components are connected
  public boolean connected(int p, int q) {
    return elements[p] == elements[q];
  }


  private int count() {
    return elements.length;
  }

  public static void main(String[] args) {
    int n = StdIn.readInt();
    UnionFind uf = new UnionFind(n);

    while (!StdIn.isEmpty()) {
      int p = StdIn.readInt();
      int q = StdIn.readInt();

      if (!uf.connected(p, 1)) {
        uf.union(p,q);
        StdOut.println(p + " " + q);
      }
    }

    for(int i = 0; i < uf.elements.length; i++) {
      System.out.println(uf.elements[i]);
    }
  }
}
