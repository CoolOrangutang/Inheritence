public class English extends Human{


    English(String namn) {
        super(namn);
    }

    public String talking() {
        super.age();
        String talk = "My name is " + name + " and I live in England.";
        return talk;
    }
}
