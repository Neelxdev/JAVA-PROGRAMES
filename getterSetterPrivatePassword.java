class password {
    private String password;

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPassword() {
        return this.password;
    }

}

public class getterSetterPrivatePassword {
    public static void main(String[] args) {
        password pass = new password();
        pass.setPassword("456978");
        System.out.println(pass.getPassword());

    }
}
