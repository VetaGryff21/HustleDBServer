package com.service;

import com.model.Dancer;
import com.repository.DancerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DancerServiceImpl implements DancerService {

    private final DancerRepository dancerRepository;

    public DancerServiceImpl(DancerRepository dancerRepository) {
        this.dancerRepository = dancerRepository;
    }

    @Override
    public void create(Dancer dancer) {
        dancerRepository.save(dancer);
    }

    @Override
    public List<Dancer> readAll() {
        return dancerRepository.findAll();
    }

    @Override
    public boolean update(Dancer dancer, int code) {
        if (dancerRepository.existsById(code)) {
            dancer.setCode(code);
            dancerRepository.save(dancer);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int code) {
        return false;
    }

    @Override
    public List<Dancer> getDancerByCode(Integer code) {
        return dancerRepository.getDancerByCode(code);
    }

    @Override
    public List<Dancer> getDancersByName(String name) {
        return dancerRepository.findByFullnameContaining(name);
    }

    @Override
    public List<Dancer> getDancersByClub(String club) {
        return dancerRepository.findByClubContaining(club);
    }
}