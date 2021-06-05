package Abb;

public class Chapter08 {
	public static void main(String[] args) {
        // 1.「while」文
        int num = 1;
        int ans = 0;
        while (num <= 80 ) {
            ans += num * num * num * num;
            num++;
        }
        System.out.println(ans);
        
        
    }
}
