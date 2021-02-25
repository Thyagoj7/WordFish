package com.mundopeixe.mundopeixe.repository;

import com.mundopeixe.mundopeixe.model.WordFish;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FishRepository extends JpaRepository<WordFish,Long> {


}
