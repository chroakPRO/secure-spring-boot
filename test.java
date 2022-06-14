public final class NativeMethodWrapper {

    // private native method
    private native void nativeOperation(byte[ ] data, int offset,
                                        int len);

    // wrapper method performs checks
    public void doOperation(byte[ ] data, int offset, int len) {
        // copy mutable input
        data = data.clone();

        // validate input
        // Note offset+len would be subject to integer overflow.
        // For instance if offset = 1 and len = Integer.MAX_VALUE,
        //   then offset+len == Integer.MIN_VALUE which is lower
        //   than data.length.
        // Further,
        //   loops of the form
        //       for (int i=offset; i<offset+len; ++i) { ... }
        //   would not throw an exception or cause native code to
        //   crash.

        if (offset < 0 || len < 0 || offset > data.length - len) {
              throw new IllegalArgumentException();
        }

        nativeOperation(data, offset, len);
    }
}


public final class WrapperFunc {
    private native void Login(String username, String pasword);

    public void doLogin(String username, String pasword) {
        // validate input
        if (username == null || pasword == null) {
            throw new IllegalArgumentException();
        }
        else if (username.length() == 0 || pasword.length() == 0) {
            throw new IllegalArgumentException();
        }

        Login(username, pasword);
    }

}

public final class CopyMutableInput {
    private final Date date;

    private final String name = "Chris";

    // java.util.Date is mutable
    public CopyMutableInput(Date date) {
        // create copy
        this.date = new Date(date.getTime());
    }
}

public class UserInfo {
    private final String name;
    private final String username;
    private final String password;

    public UserInfo(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    private void addUserToDB() {
        // Don't log highly senstive information.
        System.out.println("password has been added to DB: " + password);
        System.Remove(password);
        System.out.println("password has been removed from memory");

        // Make a try catch block
        try {
            // Do something
        }
        catch (Exception e) {
            // Do something
        }

        // Create a for loop
        for (int i = 0; i < 10; i++) {
            // Do something
        }
        
    }




}

// Connect to the database
// Create a new user

class User {
    private final String name;
    private final String username;
    private final String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}

class UserRepository {
    public void save(User user) {
        // Save user to database mysql driver
        

    }
}

