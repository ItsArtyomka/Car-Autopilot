public class Car {
    public static void driving(String light){
        boolean drive = false;
        switch (light) {
            case "Green":
                drive = true;
                System.out.println("You can drive.");
                break;
            case "Yellow":
                drive = false;
                System.out.println("Wait.");
                break;
            case "Red":
                drive = false;
                System.out.println("Cannot drive.");
                break;
        }
        /*
        if (light == "Green"){
            System.out.println("You can drive.");
        } else if (light == "Yellow"){
            System.out.println("Wait.");
        } else if (light == "Red") {
            System.out.println("Cannot drive.");
        }
        */
    }

    public static void main(String[] args) {
        driving("Green");
        driving("Red");
        driving("Yellow");
    }
}
