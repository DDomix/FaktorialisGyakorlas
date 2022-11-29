import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println(faktorialis(3));
        //System.out.println(hatvanyozas(2,4));
        int max=35;
        int db=7;
        int[] tomb=new int[db];
        lottoszelveny(tomb,max,db);
        for (int szam:tomb) {
            System.out.println(szam);
        }
    }

    public static int faktorialis(int n){
        if (n > 0) {
            return n*(faktorialis(n-1));
        }
        return 1;
    }
    public static int hatvanyozas(int n, int hatvany){
        int alap = n;
        int kitevo = hatvany;
        int eredmeny = 1;
        for (int i = 1; i <= kitevo; i++){
            eredmeny *= alap;
        }
        return eredmeny;
    }
    public static void lottoszelveny(int szamok[],int max,int db){
        if (db > 0) {
            int proba =(int)(Math.random()*max+1);
            boolean bennevan= Arrays.stream(szamok).anyMatch(szam -> szam==proba);
            if (bennevan){
                lottoszelveny(szamok,max,db);
            }else{
                szamok[db-1]=proba;
                lottoszelveny(szamok,max,db-1);
            }
        }
    }
    public static int lofasz(int min,int max){
        int gondoltszam= (int) (Math.random()*max+min);
        while (gondoltszam>min && gondoltszam<max){
            max=max/2;
        }
        return 0;
    }
}
