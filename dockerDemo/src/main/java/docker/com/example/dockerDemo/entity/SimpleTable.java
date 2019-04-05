package docker.com.example.dockerDemo.entity;

import docker.com.example.dockerDemo.constant.SimpleTableConstants;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Setter
@Table(SimpleTableConstants.TABLE_NAME)
public class SimpleTable {

    @PrimaryKey
    @Column(SimpleTableConstants.Columns.ID)
    private Integer id;

    @Column(SimpleTableConstants.Columns.NAME)
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
