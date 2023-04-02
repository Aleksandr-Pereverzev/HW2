/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

Пример. (n = 6, c1='a', c2='b') -> "ababab"
*/
public class del {
    public static void main(String[] args) {
        int n = 6;
        String c1 = "a";
        String c2 = "b";
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                builder.append(c2);
            } else {
                builder.append(c1);
            }
               // return builder;
               
        }   
    System.out.println(builder);
}
}