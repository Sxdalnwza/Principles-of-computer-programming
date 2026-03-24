class Data {
    int number;
}

public class PassByReference { 
    public static void main(String[] args){
        Data x = new Data();
        x.number = 1000;
        addNumber(x);
        System.out.println("X " + x.number); 
        Hello.greetting();
    }

    public static void addNumber(Data data){
        data.number++;
    }
}