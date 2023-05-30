public class Swedish extends Human{

     public Swedish(String namn){
          super(namn);

     }

     public String talking() {
          super.age();
          String talk = "Jag heter " + name + " och bor i Sverige.";
          return talk;
     }

}
