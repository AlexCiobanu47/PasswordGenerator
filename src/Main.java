import java.util.Scanner;
public class Main {
    public static char generateCharacter(){
        //generate a random number that represents a char
        //26+26 lowercase and uppercase letters
        //10 digits
        //total of 62 characters(letters, digits and symbols)
        int rand = (int) (Math.random()* 62);
        //rand in [0-9] - digit -> ASCII [48-57]
        //rand in [10-35] - lowercase letter -> ASCII [97-122]
        //rand in [36- 61] - uppercase letter -> ASCII [65-90]
        if(rand <= 9){
            //digit
            rand += 48;
            return (char)(rand); //return character for ASCII code rand
        }
        else if(rand <= 35){
            //uppercase
            rand +=55; //65-10
            return (char)(rand);
        }
        else{
            //uppercase
            rand += 61; //97-36
            return (char)(rand);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the password?");
        int passwordLength = sc.nextInt();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < passwordLength; i++){
            password.append(generateCharacter());
        }
        System.out.println(password);
    }

}
