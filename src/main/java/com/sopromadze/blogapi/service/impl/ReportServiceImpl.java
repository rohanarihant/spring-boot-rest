package com.sopromadze.blogapi.service.impl;

import com.sopromadze.blogapi.exception.ResourceNotFoundException;
import com.sopromadze.blogapi.model.category.Category;
import com.sopromadze.blogapi.model.post.Post;
import com.sopromadze.blogapi.model.report.Report;
import com.sopromadze.blogapi.model.tag.Tag;
import com.sopromadze.blogapi.model.user.User;
import com.sopromadze.blogapi.payload.PostRequest;
import com.sopromadze.blogapi.payload.PostResponse;
import com.sopromadze.blogapi.payload.ReportRequest;
import com.sopromadze.blogapi.payload.ReportResponse;
import com.sopromadze.blogapi.repository.*;
import com.sopromadze.blogapi.security.UserPrincipal;
import com.sopromadze.blogapi.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.sopromadze.blogapi.utils.AppConstants.*;
import static com.sopromadze.blogapi.utils.AppConstants.ID;

@Service
public class ReportServiceImpl extends ReportService {
    @Autowired
    private ReportRepository reportRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ReportResponse addReport(ReportRequest reportRequest, UserPrincipal currentUser) {
        User user = userRepository.findById(currentUser.getId())
                .orElseThrow(() -> new ResourceNotFoundException(USER, ID, 1L));
//        Category category = categoryRepository.findById(reportRequest.getCategoryId())
//                .orElseThrow(() -> new ResourceNotFoundException(CATEGORY, ID, reportRequest.getCategoryId()));

//        List<Tag> tags = new ArrayList<Tag>(reportRequest.getTags().size());

//        for (String name : reportRequest.getTags()) {
//            Tag tag = tagRepository.findByName(name);
//            tag = tag == null ? tagRepository.save(new Tag(name)) : tag;
//
//            tags.add(tag);
//        }

        Report report = new Report();
        report.setName(reportRequest.getName());
        report.setPhone(reportRequest.getPhone());
        report.setDate(reportRequest.getDate());
        report.setUser(user);
        report.setDuration(reportRequest.getDuration());

        Report newReport = reportRepository.save(report);

        ReportResponse reportResponse = new ReportResponse();

        reportResponse.setName(newReport.getName());
        reportResponse.setPhone(newReport.getPhone());
        reportResponse.setDate(newReport.getDate());
        reportResponse.setDuration(newReport.getDuration());


        return reportResponse;
    }

    private Report getReport(Report report) {
        return report;
    }
}
