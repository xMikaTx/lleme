package aulas.concurrency;

public class teste {

    public static void main(String[] args) {
        double[][] a = null, b = null, c = null;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    c[i][j] += a[i][k] * b[k][j];
    }
}
