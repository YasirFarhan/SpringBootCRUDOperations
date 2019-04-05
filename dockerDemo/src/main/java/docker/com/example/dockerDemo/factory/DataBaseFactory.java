package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.tables.UsersTable;

import java.util.Optional;

public interface DataBaseFactory {
    void saveRecord(UsersTable newRecord);

    Optional<UsersTable> findRecordById(Integer id);

    void deleteRecordById(Integer id);

    Iterable <UsersTable> findAllRecords();
}
