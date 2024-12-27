package OOPS;


class Constructor{
    String Name;
    int Age;

    public void printInfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
    }
//    Constructor(){// this is non peramiterige constructor
//        System.out.println("constructor called");// create a constructor
//    }
    Constructor(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }


    public static void main(String args[]){
        Constructor student1=new Constructor("biswajit",20);
//        student1.Name="Biswajit";
//        student1.Age=20; this are not use in peramiterige constructor
        student1.printInfo();


    }
}
