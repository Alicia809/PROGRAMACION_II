/*5.15 (Programa para imprimir triángulos) */
public class triangulos {
    public static void main(String[] args)
    {
        int contador=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int limite=1;
        int limite2=10;
        
        System.out.println("a)\n");
        while(contador<10){
            for (int dato = 1; dato <= limite; dato++)
                System.out.print("*");
            
            System.out.println();
            limite++;
            contador++;
        }
        
        System.out.println("\n b)\n");
        while(contador2<10){
            for (int dato2 = 1; dato2 <= limite2; dato2++)
                System.out.print("*");
            
            System.out.println();
            limite2--;
            contador2++;
        }
        
        int limite3=1;
        int limite4=10;
        System.out.println("\n c)\n");
        while(contador3<10){
            for (int dato3 = 1; dato3 <= limite3; dato3++)
                System.out.print(" ");

            for (int dato3 = 1; dato3 <= limite4; dato3++)
                System.out.print("*");
            
            System.out.println();
            limite3++;
            limite4--;
            contador3++;
        }
        
        int limite5=10;
        int limite6=1;
        System.out.println("\n d)\n");
        while(contador4<10){
            for (int dato4 = 1; dato4 <= limite5; dato4++)
                System.out.print(" ");

            for (int dato4 = 1; dato4 <= limite6; dato4++)
                System.out.print("*");
            
            System.out.println();
            limite5--;
            limite6++;
            contador4++;
        }
        
    }
}