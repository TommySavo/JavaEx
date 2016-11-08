/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathreads;

/**
 *
 * @author Lorenzo
 */
public class TestMatrice implements Runnable {
    public static TMatrice matrix;
    public static int VettoreSomma[];
    public static int RigaAttiva=0;
    public static boolean OKThread;
    public static int tmp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrix = new  TMatrice(3, 3);
        matrix.stampa();
        System.out.println(matrix.matrice[RigaAttiva].length);
        VettoreSomma = new int[matrix.matrice[RigaAttiva].length];
        for(int i = 0; i<matrix.matrice[RigaAttiva].length;i++){
            VettoreSomma[i] = 0;
        }
        TestMatrice ThreadArray[];
        Thread Sommatori[];
        ThreadArray = new TestMatrice[matrix.matrice[RigaAttiva].length];
        Sommatori = new Thread[matrix.matrice[RigaAttiva].length];
        for(int i=0;i<matrix.matrice[RigaAttiva].length;i++){
            OKThread = false;
            RigaAttiva = i;
            ThreadArray[i]=new TestMatrice();
            Sommatori[i]=new Thread(ThreadArray[i]);
            Sommatori[i].start();
            while(OKThread==false){/*Do Nothing*/}
        }
        System.out.println("TOTALE: "+tmp);
    }

    @Override
    public void run() {
        for(int i = 0; i<matrix.matrice[RigaAttiva].length;i++){
            VettoreSomma[RigaAttiva]+=matrix.matrice[RigaAttiva][i];
            System.out.println(matrix.matrice[RigaAttiva][i]);
            System.out.println("Somma Riga "+RigaAttiva+" e colonna "+i+" : "+VettoreSomma[RigaAttiva]);
        }
        tmp += VettoreSomma[RigaAttiva];
        System.out.println("END OF LINE");
        OKThread = true;
    }
    
}
