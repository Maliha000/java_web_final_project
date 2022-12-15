package com.example.java_web_final_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WondersOfWorldService {
    @Autowired
    private WondersOfWorldRepository wondersOfWorldRepository;

    public WondersOfWorldService( WondersOfWorldRepository wondersOfWorldRepository)
    {
        this.wondersOfWorldRepository = wondersOfWorldRepository;
    }

    public WondersOfWorldService() {
    }

    public WondersOfWorld save(WondersOfWorld wonder)
    {
        //TODO implement this method
        //if(!itemRepository.equals(item)) {
        return wondersOfWorldRepository.save(wonder);
        // }
        //return null;
    }


    public void deleteById( int wonderId )
    {
        //TODO implement this method
        wondersOfWorldRepository.deleteById(wonderId);
    }


    public List<WondersOfWorld> all()
    {
        //TODO implement this method
        return wondersOfWorldRepository.findAll();
    }


    public Optional<WondersOfWorld> findById(int wonderId )
    {
        //TODO implement this method
        //if(itemRepository.findById(itemId).isPresent()){
        return wondersOfWorldRepository.findById(wonderId);
        //}
        // return null;
    }

}
