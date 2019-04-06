package docker.com.example.dockerDemo.tables;

import docker.com.example.dockerDemo.constant.UserTableConstants;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(UserTableConstants.TABLE_NAME)
public class CassandraUsersTable {

    @PrimaryKey
    @Id
    @Column(UserTableConstants.Columns.ID)
    private Long id;

    @Column(UserTableConstants.Columns.NAME)
    private String name;

}


