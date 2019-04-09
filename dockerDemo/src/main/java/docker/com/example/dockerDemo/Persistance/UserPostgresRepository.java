package docker.com.example.dockerDemo.Persistance;

import docker.com.example.dockerDemo.tables.PostgresUsersTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPostgresRepository extends JpaRepository<PostgresUsersTable, Long> {
}
