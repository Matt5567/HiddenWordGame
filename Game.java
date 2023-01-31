import java.util.Scanner;

public class Game {
    private String hidden;
    private String guess;
    private String hint = "";
    private Scanner kb = new Scanner(System.in);

    public static void main(String[] args){
        Game game = new Game();
        game.run();
    }

    public void run(){
        System.out.println("Enter a hidden word");
        hidden = kb.nextLine();

            while(!hint.equals(hidden)) {
                System.out.println("Enter a " + hidden.length() + " letter word to guess");
                guess = kb.nextLine();
                hint = "";
                    for(int i = 0; i < hidden.length(); i++)
                    {
                        if(guess.substring(i, i+1).equals(hidden.substring(i, i+1))){
                            hint += guess.substring(i, i+1);
                        }

                        else if(hidden.indexOf(guess.substring(i, i+1)) != -1){
                            hint += "+";

                    }
                        else if(hidden.indexOf(guess.substring(i, i+1)) == -1 ){
                            hint += "*";
                        }



                    }
                System.out.println(hint);
            }

        System.out.println("Congratulations! You guessed the correct word.");
    }

}





