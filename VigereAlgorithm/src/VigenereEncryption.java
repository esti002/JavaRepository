import java.util.Scanner;
import java.util.Random;

public class VigenereEncryption
{
    public static void main(String[] args)
    {
        KeyNumbers keyNum = new KeyNumbers();
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();

        int coreNumber;
        int factor;
        String sentence;
        String alphabet;
        String keyWord;

        System.out.println("Dilerseniz ozel karakter dizini giriniz.");
        alphabet = scanner.nextLine();

        System.out.println("Sifrelenmesini istediginiz metni giriniz.");
        sentence = scanner.nextLine();

        System.out.println("Keyword giriniz.");
        keyWord = scanner.nextLine();

        System.out.println("Cekirdek sayiyi giriniz.");
        coreNumber = scanner.nextInt();

        factor = keyWord.length()*coreNumber;

        System.out.println(coreNumber);

        for(int i=0;i<sentence.length();i+=0)
        {
            for(int j =0 ;j<keyWord.length();j++)
            {
                char focusedKey = sentence.charAt(i);
                if(((keyNum.FindNumber(focusedKey,alphabet))+(keyNum.FindNumber(keyWord.charAt(j),alphabet)))<26)
                {
                    System.out.println((keyNum.FindNumber(focusedKey,alphabet) + keyNum.FindNumber(keyWord.charAt(j),alphabet)) * factor);
                }
                else
                {
                    System.out.println((((keyNum.FindNumber(focusedKey,alphabet)) + (keyNum.FindNumber(keyWord.charAt(j),alphabet)))-26) * factor);
                }
                i++;
            }
        }
    }
}
