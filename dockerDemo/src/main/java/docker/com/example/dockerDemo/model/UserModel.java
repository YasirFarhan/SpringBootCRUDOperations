package docker.com.example.dockerDemo.model;


import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import docker.com.example.dockerDemo.tables.PostgresUsersTable;

import java.util.Optional;

public class UserModel {

    private Long id;
    private String name;

    public void convertFromCassandraTable(Optional<CassandraUsersTable> usersTable) {
        this.id = usersTable.get().getId();
        this.name = usersTable.get().getName();
    }

    public void convertFromPostgresTable(Optional<PostgresUsersTable> usersTable) {
        this.id = usersTable.get().getId();
        this.name = usersTable.get().getName();
    }


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
