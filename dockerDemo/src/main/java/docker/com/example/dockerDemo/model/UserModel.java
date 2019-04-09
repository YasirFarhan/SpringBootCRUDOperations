package docker.com.example.dockerDemo.model;


import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import docker.com.example.dockerDemo.tables.PostgresUserTable;

import java.util.Optional;

public class UserModel {

    private Long id;
    private String name;

    public void convertFromCassandraTable(Optional<CassandraUsersTable> usersTable) {
        this.id = usersTable.get().getId();
        this.name = usersTable.get().getName();
    }

    public void convertFromPostgresTable(Optional<PostgresUserTable> usersTable) {
        this.id = usersTable.get().getId();
        this.name = usersTable.get().getName();
    }


   /* public UserModel convertFromCassandraTable(CassandraUsersTable usersTable) {
        UserModel userModel = new UserModel();
        userModel.setId(usersTable.getId());
        userModel.setName(usersTable.getName());
        return userModel;
    }

    public UserModel convertFromPostgresTable(PostgresUserTable usersTable) {
        UserModel userModel = new UserModel();
        userModel.setId(usersTable.getId());
        userModel.setName(usersTable.getName());
        return userModel;
    }
*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
