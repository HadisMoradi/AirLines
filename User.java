import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private ArrayList <String> userList = new ArrayList <>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<String> userList) {
        this.userList = userList;
    }

    public User() {
        defaultUser();
    }
    public void defaultUser(){
        userList.add("user1");
        userList.add("pass1");
        userList.add("user2");
        userList.add("pass2");
        userList.add("user3");
        userList.add("pass3");
        userList.add("user4");
        userList.add("pass4");
        userList.add("user5");
        userList.add("pass5");
        userList.add("user6");
        userList.add("pass6");

    }
    public void addUser(String userName , String password){
        this.userList.add(userName);
        this.userList.add(password);
        System.out.println(userList);
    }
    public void changePassword(String userName , String password){
    int index = this.userList.indexOf(userName);
    this.userList.set(index+1 , password);
    }
    public boolean findUser(String userName , String password) {
        for (int i = 0; i < this.userList.size(); i+=2) {
            if (userList.get(i).equals(userName) && userList.get(i+1).equals(password)){
                return true;
            }
        }
        return false;
    }
}
