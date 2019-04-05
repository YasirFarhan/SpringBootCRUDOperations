//package docker.com.example.dockerDemo.dao;
//
//import docker.com.example.dockerDemo.entity.SimpleTable;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.Optional;
//
//public class BaseDaoCql implements CrudRepository<SimpleTable, Integer> {
//    @Override
//    public <S extends SimpleTable> S save(S entity) {
//        return save(entity);
//    }
//
//    @Override
//    public <S extends SimpleTable> Iterable<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<SimpleTable> findById(Integer integer) {
//        return findById(integer);
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public Iterable<SimpleTable> findAll() {
//
//        try {
//            return findAll();
//        } catch (Exception e) {
//            System.out.println(e.getCause());
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }
//
//    @Override
//    public Iterable<SimpleTable> findAllById(Iterable<Integer> integers) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Integer integer) {
//        deleteById(integer);
//    }
//
//    @Override
//    public void delete(SimpleTable entity) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends SimpleTable> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
