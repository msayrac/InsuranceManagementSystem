import java.util.Scanner;

public class AddressManager {

    public static void addAddress(User user, Address address){
        user.getAddressList().add(address);
    }

    public static void removeAddress(User user, Address address){
        user.getAddressList().remove(address);
    }

    public static Address createHomeAddress(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Home Address : ");
        String homeadr = input.nextLine();

      return new HomeAddress(homeadr);
    }

    public static Address createBusinessAddress(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Business Address : ");
        String businessadr = input.nextLine();
        return new BusinessAddress(businessadr);
    }






}
