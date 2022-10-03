/*4.22 (Salida tabular)Escriba una aplicación en Java que utilice ciclos para 
imprimir una tabla de valores: */

    public class tabla
    {
    public static void main(String[] args)
    {
            int n = 1;
            int n2 = 10;
            int n3 = 100;
            int n4 = 1000;
            int contador = 1;
            
            System.out.println("N     10*N     100*N     1000*N \n");
            while (contador <= 5) {
                 System.out.printf("%d%s%d%s%d%s%d%n",n ,"      " ,n2 ,"       ",
                    n3 ,"       " ,n4);

                 n++;
                 n2 = n2 + 10;
                 n3 = n3 + 100;
                 n4 = n4 + 1000;
                 contador = contador + 1;
            }
         
    }   
}
