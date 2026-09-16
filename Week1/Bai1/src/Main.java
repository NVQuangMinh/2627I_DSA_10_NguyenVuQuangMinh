public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] leader = new int[n];
        for (int i = 0; i < n; i++) {
            leader[i] = i;
        }
        System.out.println("Mảng ban đầu: [0, 1, 2, 3]");
        union(leader, 1, 2);
        union(leader, 1, 0);
        System.out.println("find(1) = " + leader[1]);
        System.out.println("find(2) = " + leader[2]);
        System.out.println("find(1) = find(2): " + (leader[1] == leader[2]));
    }
    public static void union(int[] leader, int p, int q) {
        for (int i = 0; i < leader.length; i++) {
            if (leader[i] == leader[p]) {
                leader[i] = leader[q];
            }
        }
    }
}

// phan tu 1 va 2 thuoc cung 1 tap hop nhung code tra ve false