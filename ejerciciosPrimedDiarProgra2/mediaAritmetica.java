public class mediaAritmetica {
    public static int mediaAritmeticaIterativo (Arraylist<Integer> lista) {
        int ret = 0;
        int num = 0;
        for (Integer n : lista) {
            ret += n;
            num++;
        }
        return (ret /= num);
    }    
}
