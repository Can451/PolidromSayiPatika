public class PolidromSayı {
    static boolean isPolidrom(int n){

        int t=n,reverseNumber=0,lastNumber;
        while (t!=0){
            lastNumber = t%10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            t/=10;
        }
        if (n==reverseNumber)
            return true;
        else return false;
    }

    public static void main(String[] args) {


        System.out.println(isPolidrom(102));
    }
}
