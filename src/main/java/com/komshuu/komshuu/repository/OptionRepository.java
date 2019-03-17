package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ecyamak
 */

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {
    List<Option> findAllByPollId(long pollId);

    Option findByOptionId(long optionId);
}
