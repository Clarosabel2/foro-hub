package alura.forohub.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public final class SessionManager {
    private static SessionManager instance = null;

    private User user;

    private static SessionManager getInstance(User user) {
        if (instance == null) {
            instance = new SessionManager(user);
        }
        return instance;
    }

}
