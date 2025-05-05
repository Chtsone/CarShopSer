package entity;

import constant.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User
    {
        public User(String username, String password, UserRole role)
            {
                this.username = username;
                this.password = password;
                this.role = role;
            }

        public User(String id, String username, String password, UserRole role)
            {
                this.id = id;
                this.username = username;
                this.password = password;
                this.role = role;
            }

        private String id;
        private String username;
        private String password;
        private UserRole role;

    }
