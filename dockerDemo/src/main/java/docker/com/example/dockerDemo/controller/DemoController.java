package docker.com.example.dockerDemo.controller;

import docker.com.example.dockerDemo.entity.SimpleTable;
import docker.com.example.dockerDemo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {
    @Autowired
//    Dao service;
            Service service;

    @GetMapping(path = "/findAll")
    @ResponseBody
    public List<SimpleTable> findAll() {
        List<SimpleTable> list = service.findAll();
        return list;
    }

    @GetMapping(path = "/find/{id}")
    @ResponseBody
    public Optional<SimpleTable> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }


    @PostMapping(path = "/save", headers = "Accept=application/json", produces = "application/json")
    public void save(@RequestBody SimpleTable newRecord) {
        service.save(newRecord);
    }

    @PutMapping(path = "/update", headers = "Accept=application/json", produces = "application/json")
    public void update(@RequestBody SimpleTable newRecord) {
        service.save(newRecord);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Integer id) {
        service.deleteById(id);
    }
}

