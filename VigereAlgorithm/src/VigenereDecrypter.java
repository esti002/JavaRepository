import java.util.Scanner;

public class VigenereDecrypter
{
    public static void main(String[] args)
    {
        KeyNumbers keyNum = new KeyNumbers();
        Scanner scanner = new Scanner(System.in);

        int coreNumber = 0;
        int factor;
        String alphabet;
        String keyWord;
        int[] cipher = new int[50];

        System.out.println("Daha once ozel bir karakter dizini verilmisse lutfen giriniz.");
        alphabet = scanner.nextLine();

        System.out.println("Keyword giriniz.");
        keyWord = scanner.nextLine();

        int temp=1;
        int i=0;
        while(temp>=0)
        {
            if(i==0)
            {
                System.out.println("Sifre elemani giriniz. Cikmak icin 0dan kucuk bir sayi giriniz.");
                coreNumber = scanner.nextInt();
            }
            else
            {
                System.out.println("Sifre elemani giriniz. Cikmak icin 0dan kucuk bir sayi giriniz.");
                temp = scanner.nextInt();
                cipher[i-1] = temp;

                if(temp<0)
                {
                    break;
                }
            }
            i++;
        }

        factor = coreNumber * keyWord.length();

        for(int j=0; j<cipher.length&&cipher[j]>=0;j+=0)
        {
            for(int k=0; k<keyWord.length()&&cipher[j]>=0;k++)
            {
                if(((cipher[j]/factor)-keyNum.FindNumber(keyWord.charAt(k),alphabet))<0)
                {
                    System.out.print(keyNum.FindChar(((cipher[j]/factor)-keyNum.FindNumber(keyWord.charAt(k),alphabet))+26,alphabet));
                }
                else
                {
                    System.out.print(keyNum.FindChar(((cipher[j]/factor)-keyNum.FindNumber(keyWord.charAt(k),alphabet)),alphabet));
                }
                j++;
            }
        }
    }
}
