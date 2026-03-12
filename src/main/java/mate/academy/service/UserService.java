package mate.academy.service;

import mate.academy.model.User;

public class UserService {
    private static final User[] users = new User[] {
            new User("bob@i.ua", "1234"),
            new User("alice@i.ua", "1234")
    };

    private static User indentifiedUser;

    public static User getIndentifiedUser() {
        return indentifiedUser;
    }

    public static void setIndentifiedUser(User indentifiedUser) {
        UserService.indentifiedUser = indentifiedUser;
    }

    /**
     * Find user by email. All users are stored in <code>private static final User[] users</code>
     * @param email - the input parameter
     * @return - user if his email is equal to passed email.
     * Return <code>null</code> if there is no suitable user
     */

    public User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                setIndentifiedUser(user);
            }
        }
        return null;
    }
}
