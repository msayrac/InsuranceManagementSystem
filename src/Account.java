import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

public abstract class Account implements Comparable<Account> {
    enum AuthenticationStatus {SUCCESS, FAIL}

    private User user;
    private ArrayList<Insurance> insuranceList;
    AuthenticationStatus status;
    private int type;


    final void showUserInfo(){

        System.out.println(user.getName() + " " + user.getSurname() + " "+user.getAge());
    }

    public void login(String email, String password) throws InvalidAuthenticationException {

        if(!(user.getEmail().equals(email) && user.getPassword().equals(password))){
            status = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid Password or Email!");

        } else{
            status = AuthenticationStatus.SUCCESS;

        }
    }

    public abstract void addAddress(Address address);
    public abstract void removeAddress(Address address);

    public boolean isLogin(){
        return status == AuthenticationStatus.SUCCESS;
    }

    public void setStatus(AuthenticationStatus status){
        this.status = status;
    }

    public Account(User user, ArrayList<Insurance> insuranceList, AuthenticationStatus status, int type) {
        this.user = user;
        this.insuranceList = insuranceList;
        this.status = status;
        this.type = type;
    }

    public Account() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }





















}
