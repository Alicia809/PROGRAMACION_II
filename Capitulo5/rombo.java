/*5.24 (Programa para imprimir rombos) */
public class rombo {
    public static void main(String[] args){
        int contador=1;
        int limite1=5;
        int limite2=1;
        
        while(contador<=5){
            for (int dato = 1; dato <= limite1; dato++)
                System.out.print(" ");

            for (int dato2 = 1; dato2 <= limite2; dato2++)
                System.out.print("*");
            
            System.out.println();
            limite1--;
            limite2+=2;
            contador++;
        }

        int contador2=1;
        int limite3=4;
        int limite4=1;

        while(contador2<=4){
            for (int dato3 = 5; dato3 >= limite3; dato3--)
                System.out.print(" ");

            for (int dato4 = 7; dato4 >= limite4; dato4--)
                System.out.print("*");
            
            System.out.println();
            limite3--;
            limite4+=2;
            contador2++;
        }
    }
}
