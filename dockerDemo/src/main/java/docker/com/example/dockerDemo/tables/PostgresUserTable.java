package docker.com.example.dockerDemo.tables;


import docker.com.example.dockerDemo.constant.UserTableConstants;
import docker.com.example.dockerDemo.model.UserModel;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = UserTableConstants.TABLE_NAME)
public class PostgresUserTable implements Serializable {

    @PrimaryKey
    @Id
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
    public void convertFromUserModelToPostgresTable(UserModel userModel) {
        this.id = userModel.getId();
        this.name = userModel.getName();
    }
}
