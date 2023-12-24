package backrack;

import java.util.Arrays;

public class queen {
    static void nQueen(char [][] board,int row,int n){
        if(row==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,row,n,i)){
                board[row][i]='Q';
                nQueen(board,row+1,n);
                board[row][i]='X';
            }
        }

    }
    static boolean isSafe(char [][] board,int row,int n,int col){
        //check col
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q')return false;
            if(board[i][col]=='Q')return false;
        }
        int i=row;
        int j=col;
        while (i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
         i=row;
         j=col;
        while (i<n && j>=0){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
        i=row;
        j=col;
        while (i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }
        i=row;
        j=col;
        while (i>=0 && j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], 'X');
        }
        nQueen(board,0, n);
    }
}
