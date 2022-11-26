package PhoneClassConstructor;

public class Phone {
    private String model;
    private String number;
    private double weight;

    public String callerName;

    public Phone(String model, String number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public Phone(String callerName) {
        this.callerName = callerName;
    }

    public void phoneConsol () {
        System.out.println(model + " " + number + " " + weight);
}

   /* public String getCallerName() {
        return callerName;
    }*/

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall (String callerName) {
        System.out.println("Calling " + callerName + " " + getNumber());
    }
    public void setNumber (String number) {
        this.number = number;
    }




}
