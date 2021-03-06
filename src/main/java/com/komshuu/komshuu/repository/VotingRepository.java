package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VotingRepository extends JpaRepository<Voting, Long> {
    Voting findByApartmentIDAndVoteState(long apartmentID, boolean voteState);

    Voting findByVoteID(long voteId);
}
