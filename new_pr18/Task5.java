public class Task5 {

    public void getDetails1(String key) {

        if (key == "0") {
            throw new NullPointerException("null key in getDetails" );
        }
/*
       try {
           if (key != "0") System.out.println("ляля");
       }
       catch (Exception e) {
           System.out.println("Error");
       }*/
    }
    public void getDetails2(String key) {
       try {
           if (key != "0") System.out.println("Message");
       }
       catch (Exception e) {
           System.out.println("Error");
       }
    }

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }

    public String getDetails(String key) {
        if(key == "0") {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task5 t = new Task5();
        //t.getDetails1("0");
        //ошибка java.lang.NullPointerException: null key in getDetails
        //t.getDetails2("1");
        t.printMessage("1");
    }
}
