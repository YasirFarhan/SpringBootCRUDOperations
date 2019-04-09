package docker.com.example.dockerDemo.tables;

import docker.com.example.dockerDemo.constant.UserTableConstants;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table(UserTableConstants.TABLE_NAME)
public class CassandraUsersTable {

    @PrimaryKey
    @Column(UserTableConstants.Columns.ID)
    private Long id;

    @Column(UserTableConstants.Columns.NAME)
    private String name;

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


