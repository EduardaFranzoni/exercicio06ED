
public class Ex6 {

    public static void main(String[] args) {
        int[] c = { 13, 4, 10, 23, 6 };
        System.out.println(maior(c, 0, 4));
    }

    public static int maior(int v[], int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        int n1, n2;
        if (meio > inicio) {
            n1 = maior(v, inicio, meio);
            n2 = maior(v, meio + 1, fim);
        } else {
            n1 = v[inicio];
            n2 = v[fim];
        }
        if (n1 < n2)
            return n1;
        else
            return n2;
    }
}



