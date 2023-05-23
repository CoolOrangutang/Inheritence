public class Main {

    public static void main(String[] args){

        Swedish swedish = new Swedish();
        swedish.age();
        System.out.println(swedish.talk);


        Spanish spanish = new Spanish();
        spanish.age();
        System.out.println(spanish.talk);

        English english = new English();
        english.age();
        System.out.println(english.talk);

    }

}