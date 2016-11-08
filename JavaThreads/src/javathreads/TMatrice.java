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
public class TMatrice {
    public int matrice[][];
    public int N,M;
    public TMatrice(int r,int c){
        N=r;
        M=c;
        matrice = new int[N][M];
        for(int i = 0;i<N;i++){
            for(int j = 0; j<M; j++){
                matrice[i][j]=(int)(Math.random()*10);
            }
        }
    }
    public void stampa(){
        for(int i = 0;i<N;i++){
            for(int j = 0; j<M; j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
