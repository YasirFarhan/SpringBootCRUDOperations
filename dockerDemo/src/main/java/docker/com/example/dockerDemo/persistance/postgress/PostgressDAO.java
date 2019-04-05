package docker.com.example.dockerDemo.persistance.postgress;

import docker.com.example.dockerDemo.entity.SimpleTable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class PostgressDAO {


    @Override
    public void saveRecord(SimpleTable newRecord) {

    }

    @Override
    public List<SimpleTable> findAllRecords() {
        return null;
    }

    @Override
    public void deleteRecordById(Integer id) {

    }

    @Override
    public Optional<SimpleTable> findRecordById(Integer id) {
        return Optional.empty();
    }
}

