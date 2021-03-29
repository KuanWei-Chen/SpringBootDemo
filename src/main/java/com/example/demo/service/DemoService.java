package com.example.demo.service;

import com.example.demo.model.db.DemoTableEntity;
import com.example.demo.model.dto.DemoTableDTO;
import com.example.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(rollbackFor = Exception.class)
@Service
@RequiredArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public void insert(String name, String tel) {
        demoRepository.save(DemoTableEntity.builder().name(name).tel(tel).build());
    }

    public List<DemoTableDTO> selectAll() {
       return demoRepository.findAll().stream().map(entity ->
            DemoTableDTO.builder().oid(entity.getOid()).name(entity.getName()).tel(entity.getTel()).build()
        ).collect(Collectors.toList());
    }

    public void delete(Integer oid) {
        demoRepository.deleteById(oid);
    }
}
