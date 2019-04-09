package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.model.UserModel;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;

public interface DataBaseFactory {
    void saveRecord(CassandraUsersTable newRecord);

    UserModel findRecordById(Long id);

    void deleteRecordById(Integer id);

    Iterable<CassandraUsersTable> findAllRecords();
}
