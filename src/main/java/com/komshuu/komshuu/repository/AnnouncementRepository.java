package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sozboke
 */
@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
    List<Announcement> findAllByApartmentId(long apartmentId);

    Announcement findAnnouncementByAnnouncementId(long announcementId);

    Announcement findByAnnouncementIdAndApartmentId(long announcementId, long apartmentId);
}
