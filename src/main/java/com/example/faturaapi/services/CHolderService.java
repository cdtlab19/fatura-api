package com.example.faturaapi.services;

import com.example.faturaapi.domain.CHolder;
import com.example.faturaapi.dto.CHolderDTO;
import com.example.faturaapi.dto.CHolderUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CHolderService {

//    @Autowired
//    private BlockchainService blockchainService;

    public CHolderDTO create(CHolderDTO holderDTO) {
        return new CHolderDTO(null, null, null, null);
    }

    public void update(CHolderUpdateDTO holderDto) {

    }

    public void delete(String cpf) {

    }

    public CHolderDTO findByCPF(String cpf) {
        return new CHolderDTO(null, null, null, null);
    }

    public List<CHolderDTO> findAll() {
        List<CHolderDTO> list = new ArrayList<>();
        return list;
    }

//    public CHolder fromDTO(CHolderUpdateDTO objDto) {
//        return new CHolder(null, objDto.getSex(), objDto.getMaritalStatus(), objDto.getScholarity());
//    }
//
//    public CHolder fromDTO(CHolderDTO objDto) {
//        return new CHolder(objDto.getCpf(), objDto.getSex(), objDto.getMaritalStatus(), objDto.getScholarity());
//    }

}
