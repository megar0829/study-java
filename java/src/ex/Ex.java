package ex;

import java.io.*;
import java.util.*;

public class Ex {
    static int N;
    // [[] for _ in range(N)]
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = new int[n];
//        }
//
//        Map<Integer, Integer> map = new HashMap<>();
//        Queue<Integer> q = new ArrayDeque<>();
//        Queue<Integer> ll = new LinkedList<>();
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        List<List<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            list.add(new ArrayList<>());
//        }
//
////        sol1(arr, st);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append('s').append('\n');
//        sb.append("s" + "\n");
//        sb.append(arr[0]).append(" ").append(arr[1]);
//        System.out.println(sb);

        Set<PointN> sn = new HashSet<>();
        Set<Point> s = new HashSet<>(); // eq and hash

        sn.add(new PointN(1, 2));
        if (sn.contains(new PointN(1, 2))) {
            System.out.println("PointN same");
        } else {
            System.out.println("PointN not same");
        }
        s.add(new Point(1, 2));
        if (s.contains(new Point(2, 2))) {
            System.out.println("Point same");
        }else {
            System.out.println("Point not same");
        }
        String ss1 = new String("HIHI");
        String ss2 = new String("HIHI");
        System.out.println(ss1 == ss2);
        System.out.println("hi".equals("hi"));
    }

    private static void sol1(int[] arr, StringTokenizer st) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static int sum(){
        System.out.println(N);
        return N;
    }
    static class PointN {
        int x, y;

        public PointN(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
