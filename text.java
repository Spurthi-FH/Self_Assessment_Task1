public class text {
    public static void main(String[] args){
        String text = "To be or not to be, that is the question;"
    +"Whether `tis nobler in the mind to suffer" 
    +" the slings and arrows of outrageous fortune,"
    +" or to take arms against a sea of troubles,"
    +" and by opposing end them?";

    int spaces=0, vowels=0, letters=0;
    for(int i=0;i<text.length();i++){
        char ch = text.charAt(i);
        char prev = (i==0)?' ':text.charAt(i-1);

        //Used to avoid counting 't as a vowel
        if(ch=='t' && prev=='`'){
            continue;
        }

        //used to add spaces
        if(ch == ' '){
            spaces++;
        }

        //used to count letters in text
        if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            letters++;
        }

        //used to count vowels
        if( ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            vowels++;
        }
    }
    System.out.println("The text contained vowels: " + vowels + "\n" + "consonants " + (letters - vowels) + "\n"+ "spaces: " + spaces);
    }
}
