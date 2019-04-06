package docker.com.example.dockerDemo.Persistance;

import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPostgresRepository extends JpaRepository<CassandraUsersTable, Long> {
}
