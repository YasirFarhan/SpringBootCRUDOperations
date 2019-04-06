package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.tables.CassandraUsersTable;

import java.util.Optional;

public interface DataBaseFactory {
    void saveRecord(CassandraUsersTable newRecord);

    Optional<CassandraUsersTable> findRecordById(Integer id);

    void deleteRecordById(Integer id);

    Iterable <CassandraUsersTable> findAllRecords();
}
