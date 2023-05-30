public class Spanish extends Human{


    Spanish(String namn) {
        super(namn);
    }

    public String talking() {
        super.age();
        String talk = "Mi nombre es " + name + " y vivo en Suecia.";
        return talk;
    }

}



