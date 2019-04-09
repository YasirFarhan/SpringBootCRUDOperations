package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.model.UserModel;
import docker.com.example.dockerDemo.tables.CassandraUsersTable;

import java.util.List;

public interface DataBaseFactory {
    void saveRecord(UserModel newRecord);

    UserModel findRecordById(Long id);

    void deleteRecordById(Integer id);

    List<UserModel> findAllRecords();
}
