import java.util.ArrayList;

public class Enterprise extends Account{

    public Enterprise() {

        this.setStatus(AuthenticationStatus.FAIL);
        this.setInsuranceList(new ArrayList<>());
        setType(1);
    }

    public Enterprise(User user){
        this();
        this.setUser(user);
    }

    @Override
    public void addAddress(Address address) {

        user.getAddressList().add(address);

    }

    @Override
    public void removeAddress(Address address) {

    }
}
