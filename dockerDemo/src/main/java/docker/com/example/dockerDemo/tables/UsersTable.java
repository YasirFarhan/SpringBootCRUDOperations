package docker.com.example.dockerDemo.tables;

import docker.com.example.dockerDemo.constant.UserTableConstants;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Setter
@Table(UserTableConstants.TABLE_NAME)
public class UsersTable {

    @PrimaryKey
    @Column(UserTableConstants.Columns.ID)
    private Integer id;

    @Column(UserTableConstants.Columns.NAME)
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
