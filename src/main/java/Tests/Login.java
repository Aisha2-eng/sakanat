package Tests;

import java.util.ArrayList;
import java.util.List;

public class Login {

    public List<UserInfo> userinfo;
    public boolean isLog;

    public Login() {
        userinfo = new ArrayList<>();
        // Assuming some initial data for userinfo
        userinfo.add(new UserInfo("aishaishtayeh112@gmail.com", "2002"));
        userinfo.add(new UserInfo("areesnobani@gmail.com", "2003"));
    }

    public void arrayValues() {
        // Assuming this method is used for some setup or initialization
        // For example, loading user info from a database or external source
    }

    public static class UserInfo {
        public String email;
        public String passw;

        public UserInfo(String email, String passw) {
            this.email = email;
            this.passw = passw;
        }
    }
}