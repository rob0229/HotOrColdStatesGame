package com.rob0229.HotOrColdStatesGame.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rob0229.HotOrColdStatesGame.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
