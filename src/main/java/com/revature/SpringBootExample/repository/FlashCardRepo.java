package com.revature.SpringBootExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.SpringBootExample.beans.FlashCard;

/*
 * Your model or repository is an interface that can extend either
 * - CrudRepository<Object, Integer> : Parent Basic CRUD
 * - PagingAndSortRepository 
 * - JpaRepository
 */
public interface FlashCardRepo extends JpaRepository<FlashCard, Integer>{}
