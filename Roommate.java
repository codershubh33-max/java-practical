package project;


public class Roommate {
     public String name;
     public String Deparment;
     public String village;

   


    public Roommate( String name,String Deparmant,String village){
        this.name=name;
        this.Deparment=Deparmant;
        this.village=village;

    }
    void info(){
      System.out.println(name);
      System.out.println(Deparment);
      System.out.println(village);
    }



    
}
