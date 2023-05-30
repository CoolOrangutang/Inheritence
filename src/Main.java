public class Main {

    public static void main(String[] args){

        Swedish swedish = new Swedish("Anna");
        //swedish.age();
        System.out.println(swedish.talking());


        Spanish spanish = new Spanish("Fabbe");
        //spanish.age();
        System.out.println(spanish.talking());

        English english = new English("Tom");
        //english.age();
        System.out.println(english.talking());

    }

}