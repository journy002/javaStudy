package loop.sparta.array;

import java.util.Arrays;

public class Arr01 {
    public static void main(String[] args) {

        // 얕은 복사
        int[] a = {1,2,3,4,5};
        int[] b = a; // b에는 a의 참조값인 "주소"가 들어가는 것이다. a가 가지는 {1,2,3,4,5} 값이 들어가는게 아니다.

        b[0] = 3; // 얕은 복사

        //System.out.println(a[0]); // 얕은 복사로 인하여 변수b의 값을 변경했는데 같은 참조값을 가지고 있는 a[0]의 값도 변경 됌.


        //깊은 복사

        int[] c = {1,2,3,4};
        int[] d = new int[c.length]; // d = {0,0,0,0}

        for (int i = 0; i < c.length; i++) {
            d[i] = c[i]; // 깊은 복사
        }

        d[0] = 3;

        //System.out.println("c[0]: " + c[0]); // 1
        //System.out.println("d[0]: " + d[0]); // 3

        // 깊은 복사 메서드
        // 1. clone() 메서드
        // 하지만, clone() 메서드는 2차원이상 배열에서는 "얕은 복사"로 동작한다.
        int[] e = {1,2,3,4};
        int[] f = e.clone();

        f[0] = 3;

        //System.out.println("e[0]: " + e[0]); // 1
        //System.out.println("f[0]: " + f[0]); // 3

        // 상단에서 사용해봤던 clone() 메서드도 2차원 이상의 배열에서는 위험성이 있다.
        // 때문에, 깊은 복사 메서드는 Arrays.copyOf(복사해 올 배열, 배열 길이) 를 사용하는게 좋다.

        int[] g = {1,2,3,4};
        int[] h = Arrays.copyOf(g, 4);

        h[0] = 3;

        System.out.println("g[0]: " + e[0]); // 1
        System.out.println("h[0]: " + f[0]); // 3


    }
}
