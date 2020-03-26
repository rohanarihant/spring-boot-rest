package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.post.Post;
import com.sopromadze.blogapi.model.report.Report;
import com.sopromadze.blogapi.model.tag.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface ReportRepository extends JpaRepository<Report, Long> {
//        Page<Report> findByCreatedBy(Long userId, Pageable pageable);
//    Page<Report> findByCategory(Long categoryId, Pageable pageable);
//    Page<Report> findByTags(List<Tag> tags, Pageable pageable);
//    Long countByCreatedBy(Long userId);
}
