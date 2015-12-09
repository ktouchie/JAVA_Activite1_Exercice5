import java.util.Scanner;
class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier de 3 chiffres:");
        int num = sc.nextInt();
        int ch1 = (num/100);
        int ch2 = ((num - (ch1*100))/10);
        int ch3 = (num - (ch1*100) - (ch2*10));
        int sum = (ch1 + ch2 + ch3);
        System.out.println("La somme des chiffres = " + sum);
        
	}

}