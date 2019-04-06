package docker.com.example.dockerDemo.Persistance;

import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import docker.com.example.dockerDemo.tables.PostgresUserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPostgresRepository extends JpaRepository<PostgresUserTable, Long> {
}
