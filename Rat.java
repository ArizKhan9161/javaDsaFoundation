package backrack;

public class Rat {
    static void ratInaMaze(int stR ,int stC,int eR,int eC,String s,boolean isVisit[][]){
        if(stR<0 || stC<0)return;
        if(stR>eR || stC>eC)return ;
        if(isVisit[stR][stC])return;
        if(stR==eR && stC==eC){
            System.out.println(s);
            return;
        }
        isVisit[stR][stC]=true;
        ratInaMaze(stR+1,stC,eR,eC,s+"R",isVisit);
        ratInaMaze(stR,stC+1,eR,eC,s+"D",isVisit);
        ratInaMaze(stR-1,stC,eR,eC,s+"L",isVisit);
        ratInaMaze(stR,stC-1,eR,eC,s+"U",isVisit);
        isVisit[stR][stC]=false;
    }
    public static void main(String[] args) {
        int row=3;
        int col=3;
        boolean isVisit[][]=new boolean[row][col];
        ratInaMaze(0,0,row-1,col-1,"",isVisit);
    }
}
